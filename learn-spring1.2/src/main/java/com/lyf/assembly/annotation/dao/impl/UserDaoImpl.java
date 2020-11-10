package com.lyf.assembly.annotation.dao.impl;

import com.lyf.assembly.annotation.dao.UserDao;
import org.springframework.stereotype.Repository;

// 对应xml在<bean>配置
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("Dao层的add()方法执行了..");
    }
}
