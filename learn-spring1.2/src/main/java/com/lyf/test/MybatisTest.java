package com.lyf.test;

import com.lyf.web.controller.UserController;
import com.lyf.web.dao.entity.User;
import com.lyf.web.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisTest {
    @Test
    public void testMapper(){

        String xmlPath = "applicationContext.xml";

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        UserService userService = (UserService) applicationContext.getBean("userService2");

        UserController userController = (UserController) applicationContext.getBean("userController");

        userController.addOne(new User(null,"李云飞2",199));



    }

}
