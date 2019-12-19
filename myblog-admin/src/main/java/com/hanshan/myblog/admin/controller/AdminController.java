package com.hanshan.myblog.admin.controller;

import com.github.pagehelper.PageInfo;
import com.hanshan.myblog.admin.service.AdminService;
import com.hanshan.myblog.domain.generator.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminController {


    @Autowired
    private AdminService adminService;

    @GetMapping(value = "adminlist")
    public ModelAndView adminList(
            ModelAndView modelAndView,
            @RequestParam(value = "page",defaultValue = "1") Integer page,
            @RequestParam(value = "limit",defaultValue = "10") Integer limit
    ){
        PageInfo<Admin> adminPageInfo = adminService.getAdminListByPageAndLimit(page, limit);
        modelAndView.addObject("adminPageInfo",adminPageInfo);
        modelAndView.setViewName("admin/adminlist");
        return modelAndView;
    }
}
