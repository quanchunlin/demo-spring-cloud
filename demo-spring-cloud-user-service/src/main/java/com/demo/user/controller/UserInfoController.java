package com.demo.user.controller;

import com.demo.common.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

@RestController
@RefreshScope
public class UserInfoController {
    @Value("${info.foo}")
    String name;
    @Value("${spring.aaaa.eeeee11}")
    String name2;
    @Value("${spring.aaaa.eeeee22}")
    String name3;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id, HttpServletRequest request){
        System.out.println("当前服务端口："+request.getServerPort());
        User uesr = new User();
        uesr.setId(id);
        uesr.setAge(30);
        uesr.setName("哈哈" + id + name + ":" + name2 + ":" + name3);
        return uesr;
    }

}
