package com.lyf.service.impl;

import com.lyf.dao.UserDao;
import com.lyf.service.UserService;

public class UserServiceImpl implements UserService {

    // 定义接口说明
    private UserDao userDao;
    // 提供set()方法，用于依赖注入（若果不创建：Error creating bean with name 'UserService' defined in class
    // path resource [applicationContext.xml]: Error setting property values; nested exception is
    // org.springframework.beans.NotWritablePropertyException:Invalid property 'userDao' of bean
    // class [com.lyf.service.impl.UserServiceImpl]: Bean property 'userDao' is not writable or has an invalid setter m
    // ethod. Does the parameter type of the setter match the return type of the getter?）
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        userDao.add();
        System.out.println("addUser()执行了...");
    }
}
