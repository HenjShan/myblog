package com.hanshan.myblog.admin;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.hanshan.myblog"})
@MapperScan({"com.hanshan.myblog.domain.mapper"})
public class MyblogAdmin {
    public static void main(String[] args) {
        SpringApplication.run(MyblogAdmin.class,args);
    }
}
