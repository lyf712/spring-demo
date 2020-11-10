package com.lyf.web.dao;

import com.lyf.web.dao.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao2")
// 有mapper.xml文件了就不需要impl
/**
 * 使用Spring自动扫描MyBatis的接口并装配
 * （Spring将指定包中所有被@Mapper注解标注的接口自动
 * 装配为Mybatis的映射接口
 */
public interface UserDao {

    /**
     * 接口方法对应SQL映射文件UserMapper.xml中的id
     */
    public void addOne(User user);
    public List<User> getAllUser();

}
