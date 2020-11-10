package com.lyf.bankdemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao{
    // 属性注入
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){}{
        this.jdbcTemplate = jdbcTemplate;
    }

    // 汇出
    @Override
    public void out(String outUser, int money) {
        this.jdbcTemplate.update("UPDATE bank set money = money+? WHERE username=?",money,outUser);
    }

    // 汇入
    @Override
    public void in(String inUser, int money) {
       this.jdbcTemplate.update("UPDATE bank set money=money+? WHERE username = ?",money,inUser);


      // this.jdbcTemplate.execute("INSERT INTO bank VALUES(null,'张三','100')");
    }
}
