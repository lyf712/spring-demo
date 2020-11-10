package com.lyf.web.service;

import com.lyf.web.dao.entity.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> queryAll();

}
