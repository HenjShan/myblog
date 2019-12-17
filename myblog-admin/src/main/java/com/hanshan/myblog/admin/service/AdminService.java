package com.hanshan.myblog.admin.service;

import com.github.pagehelper.PageInfo;
import com.hanshan.myblog.domain.entity.Admin;
import com.hanshan.myblog.domain.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired(required = false)
    private AdminMapper adminMapper;

    public Admin getAdminById(Long id){
        Admin admin = null;
        admin = adminMapper.findAdminById(id);
        return admin;
    }

    public List<Admin> getAdminList(){
        List<Admin> admins = null;
        admins = adminMapper.findAll();
        return admins;
    }

}
