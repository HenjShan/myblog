package com.hanshan.myblog.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class User implements Serializable {

    /*
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_account` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `user_password` varchar(255) COLLATE utf8mb4_general_ci NOT NULL,
  `user_gender` tinyint(2) DEFAULT NULL,
  `user_birthday` timestamp NULL DEFAULT NULL,
  `user_phone` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `user_email` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL
    * */

    private Long userId;
    private String userName;
    private String userAccount;
    private String userPassword;
    private Integer userGender;
    private Date userBirthday;
    private String userPhone;
    private String userEmail;
}
