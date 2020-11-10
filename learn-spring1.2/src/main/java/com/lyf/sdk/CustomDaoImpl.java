package com.lyf.sdk;

public class CustomDaoImpl implements CustomDao{
    @Override
    public void add() {
        System.out.println("add()执行..");
    }

    @Override
    public void delete() {
        System.out.println("delete()执行..");
    }

    @Override
    public void query() {
        System.out.println("query()执行..");
    }
}
