package servlet;

import biz.ProvincesBiz;
import biz.Impl.ProvincesBizImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/provinces")
public class ProvincesServlet extends HttpServlet {
    private ProvincesBiz pb = new ProvincesBizImpl();
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(pb.findAllProvinces());
    }
}

