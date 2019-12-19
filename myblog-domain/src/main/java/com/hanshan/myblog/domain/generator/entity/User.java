package com.hanshan.myblog.domain.generator.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Long userId;

    private String userName;

    private String userAccount;

    private String userPassword;

    private Byte userGender;

    private Date userBirthday;

    private String userPhone;

    private String userEmail;

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public User withUserId(Long userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public User withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserAccount() {
        return userAccount;
    }

    public User withUserAccount(String userAccount) {
        this.setUserAccount(userAccount);
        return this;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount == null ? null : userAccount.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public User withUserPassword(String userPassword) {
        this.setUserPassword(userPassword);
        return this;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public Byte getUserGender() {
        return userGender;
    }

    public User withUserGender(Byte userGender) {
        this.setUserGender(userGender);
        return this;
    }

    public void setUserGender(Byte userGender) {
        this.userGender = userGender;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public User withUserBirthday(Date userBirthday) {
        this.setUserBirthday(userBirthday);
        return this;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public User withUserPhone(String userPhone) {
        this.setUserPhone(userPhone);
        return this;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public User withUserEmail(String userEmail) {
        this.setUserEmail(userEmail);
        return this;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userAccount=").append(userAccount);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userGender=").append(userGender);
        sb.append(", userBirthday=").append(userBirthday);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append("]");
        return sb.toString();
    }
}