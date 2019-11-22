package servlet;

import bean.AdminInfo;
import bean.PowerInfo;
import biz.AdminBiz;
import biz.impl.AdminBizImpl;
import com.alibaba.fastjson.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

@WebServlet("/admin.do")
public class AdminServlet extends HttpServlet {
    private AdminBiz ab = new AdminBizImpl();
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String type = request.getParameter("type");
        if("login".equals(type)){
            login(request,response);
        }else if("islogin".equals(type)){
            isLogin(request,response);
        }else if("getpower".equals(type)){
            getPower(request,response);
        }
    }
    public void login(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String pass = request.getParameter("pass");
        AdminInfo ai = new AdminInfo();
        ai.setAdminName(name);
        ai.setAdminPass(pass);
        ai = ab.checkAdminLogin(ai);
        HttpSession session = request.getSession();
        if(ai==null){
            session.setAttribute("ERROR_MSG",0);
            response.sendRedirect("login.html");
        }else{
            session.removeAttribute("ERROR_MSG");
            session.setAttribute("ADMIN_INFO",ai);
            response.sendRedirect("index.html");
        }
    }
    public void isLogin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        Object obj = session.getAttribute("ERROR_MSG");
        System.out.println(obj+"!!!!!!");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        if(obj!=null){
            out.print(obj);
        }else{
            out.print(-1);
        }
    }
    public void getPower(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        AdminInfo ai = (AdminInfo) session.getAttribute("ADMIN_INFO");
        Set<PowerInfo> set = ai.getPowerSet();
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(JSONArray.toJSONString(set));
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
}
