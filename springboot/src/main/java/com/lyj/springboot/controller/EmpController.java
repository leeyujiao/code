package com.lyj.springboot.controller;

import com.lyj.springboot.Biz.EmpBiz;
import com.lyj.springboot.bean.EmpInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {
    @Autowired
    private EmpBiz eb;
    @RequestMapping("/findemp")
    @ResponseBody
    public List<EmpInfo> findAllEmp(){

        return eb.findAllEmp();
    }
    @RequestMapping("/findemp2")
    public String findAllEmp2(HttpSession session){
        session.setAttribute("EMPLIST",eb.findAllEmp());
        return "index";
    }
    @RequestMapping("/saveemp")
    public String saveEmp(EmpInfo ei){
        eb.saveEmp(ei);
        return "redirect:/emp/findemp2";
    }


}
