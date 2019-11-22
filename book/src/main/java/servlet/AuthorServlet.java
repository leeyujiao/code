package servlet;

import biz.AuthorBiz;
import biz.impl.AuthorBizImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/author.do")
public class AuthorServlet extends HttpServlet {
    private AuthorBiz ab = new AuthorBizImpl();
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String type = request.getParameter("type");
        if("find".equals(type)){
            find(request,response);
        }else if("save".equals(type)){
            save(request,response);
        }
    }
    public void find(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String str = ab.findAllAuthor();
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(str);
    }
    public void save(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        ab.saveAuthor(name);
        response.sendRedirect("author.html");
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
}
