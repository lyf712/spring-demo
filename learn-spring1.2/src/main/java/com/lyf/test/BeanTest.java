package com.lyf.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @Test
    public void testBean(){
        String xmlPath="applicationContext.xml";

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        System.out.println(applicationContext.getBean("UserDao1"));
        System.out.println(applicationContext.getBean("UserDao2"));

        System.out.println(applicationContext.getBean("UserDao1"));
        System.out.println(applicationContext.getBean("UserDao2"));

        // scopeTest singleton:  ,prototype:运行两次不一致



    }
}
