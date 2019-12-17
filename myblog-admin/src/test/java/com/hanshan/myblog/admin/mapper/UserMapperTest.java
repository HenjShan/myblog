package com.hanshan.myblog.admin.mapper;

import com.hanshan.myblog.domain.entity.User;
import com.hanshan.myblog.domain.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@ComponentScan({"com.hanshan.myblog.domain.config"})
@MapperScan({"com.hanshan.myblog.domain.mapper"})
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    @Transactional
    @Commit
    public void adduser(){
        User user = new User();
        user.setUserAccount("092215210");
        user.setUserPassword("123456");
        userMapper.addUser(user);
    }

    @Test
    public void deleteuser(){
        userMapper.deleteUserById(1L);
    }

    @Test
    public void updateuser(){
        User user = userMapper.findUserById(2L);
        user.setUserName("辅助");
        user.setUserPhone("123456");
        userMapper.updateUser(user);
    }

    @Test
    public void selectuser(){
        List<User> users = userMapper.findAll();
        for (User u: users
             ) {
            System.out.println(u);
        }
    }

    @Test
    public void findOne(){
        User user = userMapper.findUserById(1L);
        System.out.println(user);
    }
}
