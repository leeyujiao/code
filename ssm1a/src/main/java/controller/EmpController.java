package controller;

import bean.EmpPageInfo;
import biz.EmpBiz;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    EmpBiz eb;
    @RequestMapping("/findallemp")
    public String findAllEmp(HttpServletRequest request){
        request.getSession().setAttribute("EMP_LIST",eb.findAllEmp());
       return "index";
    }
    @RequestMapping("/findemp")
    public String findEmpByPage(EmpPageInfo ep, HttpSession session){
        session.setAttribute("EMP_LIST",eb.findEmpByPage(ep));
        session.setAttribute("PAGE_LIST",eb.findEmpPageNum());
        return "index";
    }

    @RequestMapping("/deleteemp")
    public String deleteEmp(int empNo){
        eb.deleteEmp(empNo);
        return "redirect:/emp/findemp.do?page=1";
    }


}
