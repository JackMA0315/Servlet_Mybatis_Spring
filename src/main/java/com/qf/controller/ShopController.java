package com.qf.controller;

import com.alibaba.fastjson.JSONObject;
import com.qf.pojo.Shop;
import com.qf.service.ShopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/findAllShop")
public class ShopController extends HttpServlet {
    private ShopService shopService;
    public ShopController(){
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        shopService = (ShopService) applicationContext.getBean("shopService");
        System.out.println(shopService);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        List<Shop> shopList = shopService.getAllShop();
        String jsonStr = JSONObject.toJSONString(shopList);
        System.out.println(jsonStr);
        response.getWriter().write(jsonStr);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
