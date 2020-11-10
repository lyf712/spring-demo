package com.lyf.assembly.annotation.controller;

import com.lyf.assembly.annotation.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller("UserAction")
public class UserAction {
    @Resource(name="userService")
    private UserService userService;
//     若不返回？？方便外界获取，并不影响执行
    public UserService getUserService(){
        return userService;
    }

    public void add(){
        userService.add();
        System.out.println("Action层调用了add()...");
    }
}
