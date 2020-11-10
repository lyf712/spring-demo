package com.lyf.instance;

import com.lyf.dao.entity.User;

public class StaticFactory {
    public static User createBean(){
        return new User();
    }
}
