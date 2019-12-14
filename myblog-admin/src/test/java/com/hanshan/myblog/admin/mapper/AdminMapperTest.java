package com.hanshan.myblog.admin.mapper;

import com.hanshan.myblog.domain.entity.Admin;
import com.hanshan.myblog.domain.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootTest
@ComponentScan({"com.hanshan.myblog.domain.config"})
@MapperScan({"com.hanshan.myblog.domain.mapper"})
public class AdminMapperTest {

    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void addadmintest(){
        Admin admin = new Admin();
        admin.setAdminAccount("admin");
        admin.setAdminPassword("123456");
        admin.setAdminName("admin");
        adminMapper.addAdmin(admin);
    }

    @Test
    public void deleteadmintest(){
        adminMapper.deleteAdminById(5L);
    }

    @Test
    public void updateadmintest(){
        Admin admin = adminMapper.findAdminById(6L);
        admin.setAdminPassword("123456789");
        adminMapper.updateAdmin(admin);
    }

    @Test
    public void findalltest(){
        List<Admin> admins = adminMapper.findAll();
        for (Admin admin:admins
             ) {
            System.out.println(admin);
        }
    }
}
