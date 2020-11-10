package com.lyf.bankdemo.service;

import com.lyf.bankdemo.dao.AccountDao;

public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao){
        this.accountDao=accountDao;
    }

    @Override
    public void transfer(String outUser, String inUser, int money) {
        this.accountDao.out(outUser,money);
        this.accountDao.in(inUser,money);
    }
}
