package com.lyf.instance;

import com.lyf.dao.entity.User;

public class InstanceFactory {

    public InstanceFactory(){
        System.out.println("InstanceFactory...");
    }

    public User createBean(){
        return new User();
    }

    public void print(){
        System.out.println("this is Factory test>");
    }


}
