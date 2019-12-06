package com.hanshan.myblog.domain.entity;

import lombok.Data;

import java.io.Serializable;


@Data
public class User implements Serializable {

    private Long userId;
    private String userName;
    private String userAccount;
    private String userPassword;
}
