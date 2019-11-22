package servlet;

import bean.AuthorInfo;
import bean.BookInfo;
import bean.PubInfo;
import biz.BookBiz;
import biz.impl.BookBizImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/book.do")
public class BookServlet extends HttpServlet {
    private BookBiz bb = new BookBizImpl();
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String type = request.getParameter("type");
        if("search".equals(type)){
            search(request,response);
        }else if("searchbook".equals(type)){
            searchBook(request,response);
        }
    }
    public void search(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(bb.searchBook(null));
    }
    public void searchBook(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 接受三个参数
        String bookName = request.getParameter("bookName");
        String authorName = request.getParameter("authorName");
        String pubName = request.getParameter("pubName");
        BookInfo bi = new BookInfo();
        bi.setBookName("%"+bookName+"%");
        if(!"".equals(authorName)){
            AuthorInfo ai = new AuthorInfo();
            ai.setAuthorName(authorName);
            bi.setAi(ai);
        }
        if(!"".equals(pubName)){
            PubInfo pi = new PubInfo();
            pi.setPubName(pubName);
            bi.setPi(pi);
        }
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(bb.searchBook(bi));
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request,response);
    }
}
