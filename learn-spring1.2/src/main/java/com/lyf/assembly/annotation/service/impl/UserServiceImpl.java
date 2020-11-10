package com.lyf.assembly.annotation.service.impl;
import javax.annotation.Resource;
import com.lyf.assembly.annotation.dao.UserDao;
import com.lyf.assembly.annotation.dao.impl.UserDaoImpl;
import com.lyf.assembly.annotation.service.UserService;
import org.springframework.stereotype.Service;

// 为避免命名冲突就将其类名的首字母小写
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource(name="userDao")
    private UserDao userDao;

    public UserDao getUserDao(){
        return  userDao;
    }

    @Override
    public void add() {

        userDao.add();
        System.out.println("在UserService中执行了userDao的add()");


    }
//
//    首先使用 @Service 注解将 PersonServiceImpl 类标识为
//    Spring 中的 Bean，其写法相当于配置文件中 <bean id="" +
//            "personService"class="com.mengma.annotation.PersonServiceImpl"/>
//            的书写。
//
//    然后使用 @Resource 注解标注在属性 personDao 上（也可标注在 personDao 的 setPersonDao() 方法上
//    ），这相当于配置文件中 <property name="personDao"ref="personDao"/> 的写法。最后在该类的 add()
//    方法中调用 personDao 中的 add() 方法，并输出一句话。


}
