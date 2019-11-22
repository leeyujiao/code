package filter;

import bean.AdminInfo;
import bean.PowerInfo;
import biz.AdminBiz;
import biz.PowerBiz;
import biz.impl.AdminBizImpl;
import biz.impl.PowerBizImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Set;

@WebFilter("*.do")
public class CheckAdminLoginPowerFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException { }

    public void destroy() {}

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;
        String uri = request.getRequestURI();
        uri = uri.substring(uri.lastIndexOf('/')+1);
        if("admin.do".equals(uri)){
            String type = request.getParameter("type");
            if("login".equals(type)){
                String adminName = request.getParameter("name");
                AdminBiz ab = new AdminBizImpl();
                AdminInfo ai = ab.checkAdminPowerLogin(adminName);
                HttpSession session = request.getSession();
                if(ai==null){
                    session.setAttribute("ERROR_MSG",2);
                    response.sendRedirect("login.html");
                }else{

                    chain.doFilter(req,resp);
                    // 判断是否登录成功！
                    Object obj = session.getAttribute("ADMIN_INFO");
                    if(obj!=null){
                        ai = (AdminInfo) obj;
                        PowerBiz pb = new PowerBizImpl();
                        Set<PowerInfo> set = pb.findPowerByAdminId(ai.getAdminId());
                        ai.setPowerSet(set);
                        session.setAttribute("ADMIN_INFO",ai);
                    }
                }
            }else{
                chain.doFilter(req,resp);
            }
        }else{
            chain.doFilter(req,resp);
        }

    }
}
/*
    1.这个过滤器只是拦截登录操作
    2.会在登录前，判断用户是否有登录权限
    3.如果没有登录权限,返回登录页面,并提示
    4.有登录权限,继续
 */
