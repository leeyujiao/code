package controller;

import bean.PageInfo;
import biz.UserBiz;
import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserBiz ub;
    @RequestMapping("/findalluser")
    public String findAllUser(HttpServletRequest request){
        request.getSession().setAttribute("USER_LIST",ub.findAllUser());
        //model.addObject("USER_LIST",ub.findAllUser());
        return "index";
    }
    @RequestMapping("/finduser")
    public String findUserByPage(PageInfo pi, HttpSession session){
        session.setAttribute("USER_LIST",ub.findUserByPage(pi));
        session.setAttribute("PAGE_NUM",ub.findUserPageNum());
        return "index";
    }
    @RequestMapping("/deleteuser")
    public String deleteUser(int userId){
        ub.deleteUser(userId);
        return "redirect:/user/finduser.do?page=1";
    }
    @RequestMapping("/searchuser")
    public String searchUser(String name,HttpSession session){
        System.out.println(name);
        session.setAttribute("USER_LIST",ub.searchUser(name));
        return "index";
    }
}
