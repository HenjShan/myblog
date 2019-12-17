package com.hanshan.myblog.admin.controller;

import com.hanshan.myblog.admin.service.AdminService;
import com.hanshan.myblog.admin.service.LoginService;
import com.hanshan.myblog.domain.entity.Admin;
import com.hanshan.myblog.domain.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private AdminService adminService;

    @GetMapping(value = "login")
    public String loginPage(){
        return "login";
    }

    @GetMapping(value = "manager")
    public ModelAndView managerPage(
            ModelAndView modelAndView
    ){
        modelAndView.setViewName("manager");
        return modelAndView;
    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public ModelAndView login(
            HttpServletRequest request,
            ModelAndView modelAndView,
            @RequestParam("account") String account,
            @RequestParam("password") String password
    ){
        Admin admin = loginService.login(account, password);
        if (admin != null){
            HttpSession session = request.getSession();
            session.setAttribute("adminAccount",admin.getAdminAccount());
            session.setAttribute("adminId",admin.getAdminId());
            modelAndView.setViewName("redirect:/manager");
            return modelAndView;
        }
        modelAndView.setViewName("redirect:/login");
        return modelAndView;
    }
}
