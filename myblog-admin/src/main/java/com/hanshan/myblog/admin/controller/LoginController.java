package com.hanshan.myblog.admin.controller;

import com.hanshan.myblog.admin.commons.ResponseData;
import com.hanshan.myblog.admin.commons.StatusCodeUtils;
import com.hanshan.myblog.admin.commons.TransitionEntityType;
import com.hanshan.myblog.admin.service.AdminService;
import com.hanshan.myblog.admin.service.LoginService;
import com.hanshan.myblog.domain.generator.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private AdminService adminService;

    @Autowired
    private HttpServletRequest request;

//    @GetMapping(value = "login")
//    public String login(){
//        return "login";
//    }

    @GetMapping(value = "manager")
    public ModelAndView manager(
            ModelAndView modelAndView
    ){
        modelAndView.setViewName("manager");
        return modelAndView;
    }

    @PostMapping(value = "/login")
    @ResponseBody
    public Map<String,Object> login(
            @RequestParam("account") String account,
            @RequestParam("password") String password
    ){
        ResponseData result = new ResponseData();
        HttpSession session = request.getSession();
        Admin admin = loginService.login(account, password);
        if (admin != null){
            session.setAttribute("adminAccount",admin.getAdminAccount());
            session.setAttribute("adminId",admin.getAdminId());
            result.setCode(StatusCodeUtils.LOGIN_SUCCESS.getCode());
            result.setMsg(StatusCodeUtils.LOGIN_SUCCESS.getMsg());
        }else{
            result.setCode(StatusCodeUtils.LOGIN_DEFEAT.getCode());
            result.setMsg(StatusCodeUtils.LOGIN_DEFEAT.getMsg());
        }
        return TransitionEntityType.transitionEntityToHashMap(result);
    }
}
