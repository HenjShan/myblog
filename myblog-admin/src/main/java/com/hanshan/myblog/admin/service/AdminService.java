package com.hanshan.myblog.admin.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hanshan.myblog.domain.generator.entity.Admin;
import com.hanshan.myblog.domain.generator.entity.AdminExample;
import com.hanshan.myblog.domain.generator.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired(required = false)
    private AdminMapper adminMapper;

    public Admin getAdminById(Long id){
        Admin admin = null;
        admin = adminMapper.selectByPrimaryKey(id);
        return admin;
    }

    public PageInfo<Admin> getAdminListByPageAndLimit(Integer page,Integer limit){
        AdminExample adminExample = new AdminExample();
        PageHelper.startPage(page,limit);

        adminExample.createCriteria().andAdminIdIsNotNull();
        List<Admin> admins = adminMapper.selectByExample(adminExample);
        PageInfo<Admin> adminPageInfo = new PageInfo<>(admins,5);
        return adminPageInfo;
    }

}
