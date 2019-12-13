package com.hanshan.myblog.domain.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.jdbc.Driver");
        dataSourceBuilder.type(DruidDataSource.class);
        dataSourceBuilder.url("jdbc:mysql://192.168.195.133:3306/myblog?userUnicode=true&characterEncoding=utf-8&userSSL=false");
        dataSourceBuilder.username("hanshan");
        dataSourceBuilder.password("123456");
        return (DataSource) dataSourceBuilder.build();
    }
}
