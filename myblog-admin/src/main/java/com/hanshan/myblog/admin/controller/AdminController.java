package com.hanshan.myblog.admin.controller;

import com.hanshan.myblog.admin.service.AdminService;
import com.hanshan.myblog.domain.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {


    @Autowired
    private AdminService adminService;

    @GetMapping(value = "adminlist")
    public ModelAndView adminList(
            ModelAndView modelAndView
    ){
        List<Admin> adminList = adminService.getAdminList();
        modelAndView.addObject("adminList",adminList);
        modelAndView.setViewName("admin/adminlist");
        return modelAndView;
    }
}
