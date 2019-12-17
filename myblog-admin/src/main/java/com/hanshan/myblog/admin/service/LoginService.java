package com.hanshan.myblog.admin.service;

import com.hanshan.myblog.domain.entity.Admin;
import com.hanshan.myblog.domain.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private AdminMapper adminMapper;

    public Admin login(String account,String password){
        Admin admin = null;
        admin = adminMapper.findAdminByAccountAndPassword(account, password);
        return admin;
    }



}
