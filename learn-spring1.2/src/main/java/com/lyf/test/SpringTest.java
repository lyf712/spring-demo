package com.lyf.test;

import com.lyf.assembly.annotation.controller.UserAction;
import com.lyf.bankdemo.dao.AccountDao;
import com.lyf.bankdemo.service.AccountService;
import com.lyf.sdk.CustomDao;
import com.lyf.sdk.MyAspectFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

public class SpringTest {

    @Test
    public void testAssembly(){

        String xmlPath="applicationContext.xml";

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        System.out.println("User1:"+applicationContext.getBean("User1"));
        System.out.println("User2:"+applicationContext.getBean("User2"));


        UserAction userAction = (UserAction) applicationContext.getBean("UserAction");

        userAction.add();

    }

    @Test
    public void testAop(){

        CustomDao customDao = MyAspectFactory.getBean();

        customDao.add();
    }

    @Test
    public void testJdbcDataSource(){

        String xmlPath="applicationContext.xml";

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);

        AccountDao accountDao = (AccountDao)applicationContext.getBean("accountDao");

        accountDao.in("李云飞",100);
    }


    @Test
    public void testBank(){
        String xmlPath = "applicationContext.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                xmlPath);

        AccountService accountService = (AccountService)applicationContext.getBean("accountService");

        accountService.transfer("李云飞","史可心",100);

    }

    public void testJdbc(){

        String resource = "mybatis_config.xml";

        try{
            InputStream inputStream = Resources.getResourceAsStream(resource);
            // 建立SqlSession
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

            // 建立session
            try(SqlSession sqlSession = sqlSessionFactory.openSession()){ // 保证关闭sqlSession
                // 获取映射 （此中管理各种事务处理查询SQL）
//                UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
//
//                userMapper.insertUser(new EmpUser(null,22,33,3,"史可心","hk145"));
//                // 提交,若不提交则短期保存
                sqlSession.commit();
                //  sqlSession.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
