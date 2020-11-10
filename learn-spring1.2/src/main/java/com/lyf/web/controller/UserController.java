package com.lyf.web.controller;

import com.lyf.web.dao.entity.User;
import com.lyf.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("userController")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public void addOne(User user){
        userService.addUser(new User(null,"李云飞3",100));
        System.out.println("controller层添加成功");
    }

    @RequestMapping("/test2")
    @ResponseBody
    public String test(){
        return "hello";
    }

}
