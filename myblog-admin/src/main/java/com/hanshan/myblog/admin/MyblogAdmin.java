package com.hanshan.myblog.admin;


import com.hanshan.myblog.admin.config.WebMvcConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.hanshan.myblog.domain"})
@MapperScan({"com.hanshan.myblog.domain.generator.mapper"})
public class MyblogAdmin {
    public static void main(String[] args) {
        SpringApplication.run(MyblogAdmin.class,args);
    }
}
