package com.hanshan.myblog.admin.service;


import com.github.pagehelper.PageInfo;
import com.hanshan.myblog.domain.generator.entity.Admin;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@MapperScan({"com.hanshan.myblog.domain.generator.mapper"})
public class AdminServiceTest {

    @Autowired
    private AdminService adminService;

    @Test
    public void testPageList(){
        PageInfo<Admin> adminListByPageAndLimit = adminService.getAdminListByPageAndLimit(1, 1);
        System.out.println(adminListByPageAndLimit);
    }
}
