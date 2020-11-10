package com.lyf.web.dao.entity;

import java.io.Serializable;

public class User implements Serializable {

    private Integer id;
    private String userName;
    private Integer money;

    public User() {
    }

    public User(Integer id, String userName, Integer money) {
        this.id = id;
        this.userName = userName;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", money=" + money +
                '}';
    }
}
