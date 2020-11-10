package com.lyf.dao.impl;

import com.lyf.dao.UserDao;


public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("Ioc执行的add()成功...");
    }
}
