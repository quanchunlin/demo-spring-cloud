package com.demo.user2.controller;

import com.demo.common.entity.Order;
import com.demo.common.entity.User;
import com.demo.user2.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class UserInfoController {
    @Value("${test.info.arg1}")
    String arg1;
    @Value("${test.info.arg2}")
    String arg2;
    @Value("${test.info.arg3}")
    String arg3;
    @Value("${test.info.arg4}")
    String arg4;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id, HttpServletRequest request) {
        System.out.println("当前服务端口："+request.getServerPort());
        User uesr = new User();
        uesr.setId(id);
        uesr.setAge(30);
        uesr.setName("用户服务 参数:" + arg1 + " * " + arg2 + " * " + arg3 + " * " + arg4);
        return uesr;
    }

    @Autowired
    private OrderService orderService;

    @GetMapping("/userOrder/{id}")
    public Order getOrder(@PathVariable("id") Integer id, HttpServletRequest request) {
        System.out.println("当前服务端口：" + request.getServerPort());
        return orderService.getOrder(id);
    }

}