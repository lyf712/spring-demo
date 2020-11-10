package com.lyf.test;

import com.lyf.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IocTest {
    // Junit
    @Test
    public void testIoc(){
        String xmlPath = "applicationContext.xml";

        // from content root
        String filePath = "src/main/resources/applicationContext.xml";
        // 一般使用ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserDao userDao = (UserDao) applicationContext.getBean("UserDao");

        ApplicationContext applicationContext1 = new FileSystemXmlApplicationContext(filePath);

        UserDao userDao2 = (UserDao) applicationContext1.getBean("UserDao");

        userDao2.add();

        userDao.add();

        BeanFactory beanFactory = new ClassPathXmlApplicationContext(xmlPath);

        UserDao userDao1 = (UserDao) beanFactory.getBean("UserDao");


        userDao1.add();



    }
}
