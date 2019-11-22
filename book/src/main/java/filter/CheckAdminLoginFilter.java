package filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
@WebFilter("/*")
public class CheckAdminLoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String uri = request.getRequestURI();
        uri = uri.substring(uri.lastIndexOf('/')+1);
        // 除了login.html之外的.html请求都进行拦截
        if(uri.endsWith(".html")){
            if("login.html".equals(uri)){
                filterChain.doFilter(servletRequest,servletResponse);
            }else{
                HttpSession session = request.getSession();
                Object obj = session.getAttribute("ADMIN_INFO");
                if(obj==null){
                    session.setAttribute("ERROR_MSG",1);
                    response.sendRedirect("login.html");
                }else{
                    filterChain.doFilter(servletRequest,servletResponse);
                }
            }
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
