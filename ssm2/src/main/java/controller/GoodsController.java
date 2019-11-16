package controller;

import biz.GoodsBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private GoodsBiz gb;
    @RequestMapping("/findgoods")
    public String findAllGoods(HttpSession session){
        session.setAttribute("GOODS_LIST",gb.findAllGoods());
        return "index";
    }
}
