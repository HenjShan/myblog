package com.hanshan.myblog.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Admin implements Serializable {

    private Long adminId;
    private String adminAccount;
    private String adminPassword;
    private String adminName;
}
