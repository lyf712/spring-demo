package com.lyf.web.service;

import com.lyf.web.dao.entity.User;
import com.lyf.web.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService2")
@Transactional

/**
 * 加上注解@Transactional可以指定这个类需要受Spring的事务管理，
 *注意@Transactional只能针对public属性范围内的方法添加，
 *本案例并不需要处理事务，在这里只是告诉读者如何使用事务
 */

public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser(User user) {

        userDao.addOne(user);
        System.out.println("在service层添加成功！");
    }

    @Override
    public  List<User> queryAll() {
        return null;
    }
}
