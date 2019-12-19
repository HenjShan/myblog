package com.hanshan.myblog.admin.mapper;


import com.hanshan.myblog.domain.generator.entity.Admin;
import com.hanshan.myblog.domain.generator.entity.AdminExample;
import com.hanshan.myblog.domain.generator.mapper.AdminMapper;
import org.apache.ibatis.session.RowBounds;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
//@ComponentScan({"com.hanshan.myblog.domain.config"})
@MapperScan({"com.hanshan.myblog.domain.generator.mapper"})
public class AdminMapperTest {

    @Autowired(required = false)
    private AdminMapper adminMapper;

    @Test
    public void addadmintest(){
        Admin admin = new Admin();
        admin.setAdminAccount("admin");
        admin.setAdminPassword("123456");
        admin.setAdminName("admin");
        int insert = adminMapper.insert(admin);
        System.out.println(insert);
    }
//
//    @Test
//    public void deleteadmintest(){
//        adminMapper.deleteAdminById(5L);
//    }
//
//    @Test
//    public void updateadmintest(){
//        Admin admin = adminMapper.findAdminById(6L);
//        admin.setAdminPassword("123456789");
//        adminMapper.updateAdmin(admin);
//    }

    @Test
    public void findalltest(){
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminIdIsNotNull();
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        for (Admin admin:admins
             ) {
            System.out.println(admin);
        }
    }

    @Test
    public void findPagelist(){
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminIdIsNotNull();
        RowBounds rowBounds = new RowBounds(1, 2);
        List<Admin> admins = adminMapper.selectByExampleWithRowbounds(adminExample,rowBounds);
        for (Admin admin:admins
        ) {
            System.out.println(admin);
        }
    }

    @Test
    public void testdelete(){
        adminMapper.deleteByPrimaryKey(7L);
    }
}
