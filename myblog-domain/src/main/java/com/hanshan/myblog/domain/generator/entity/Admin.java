package com.hanshan.myblog.domain.generator.entity;

import java.io.Serializable;

public class Admin implements Serializable {
    private Long adminId;

    private String adminAccount;

    private String adminPassword;

    private String adminName;

    private static final long serialVersionUID = 1L;

    public Long getAdminId() {
        return adminId;
    }

    public Admin withAdminId(Long adminId) {
        this.setAdminId(adminId);
        return this;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public Admin withAdminAccount(String adminAccount) {
        this.setAdminAccount(adminAccount);
        return this;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount == null ? null : adminAccount.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public Admin withAdminPassword(String adminPassword) {
        this.setAdminPassword(adminPassword);
        return this;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public Admin withAdminName(String adminName) {
        this.setAdminName(adminName);
        return this;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", adminId=").append(adminId);
        sb.append(", adminAccount=").append(adminAccount);
        sb.append(", adminPassword=").append(adminPassword);
        sb.append(", adminName=").append(adminName);
        sb.append("]");
        return sb.toString();
    }
}