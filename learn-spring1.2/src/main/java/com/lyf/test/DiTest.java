package com.lyf.test;

import com.lyf.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiTest {

    @Test
    public void testDi(){
        String xmlPath = "applicationContext.xml";

        // 初始化Spring容器，加载配置文件，并对bean进行实例化（构造器方法实例化）
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        System.out.println("application:"+applicationContext.getBean("UserDao"));//application:com.lyf.dao.impl.UserDaoImpl@645aa696 (散列码)

        UserService userService = (UserService)applicationContext.getBean("UserService");

        userService.addUser();


    }


}
