package com.hanshan.myblog.admin.service;

import com.hanshan.myblog.domain.generator.entity.Admin;
import com.hanshan.myblog.domain.generator.entity.AdminExample;
import com.hanshan.myblog.domain.generator.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    @Autowired(required = false)
    private AdminMapper adminMapper;

    public Admin login(String account,String password){
        Admin admin = null;
        AdminExample adminExample = new AdminExample();
        adminExample.createCriteria().andAdminAccountEqualTo(account).andAdminPasswordEqualTo(password);
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        return admins.size() != 0 ? admins.get(0) : null;
    }



}
