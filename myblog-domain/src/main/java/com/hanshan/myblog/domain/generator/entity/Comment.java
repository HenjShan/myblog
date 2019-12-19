package com.hanshan.myblog.domain.generator.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private Long commId;

    private Date commCreatedate;

    private Long userId;

    private Long articleId;

    private Integer commPraise;

    private Long parentId;

    private String commContent;

    private static final long serialVersionUID = 1L;

    public Long getCommId() {
        return commId;
    }

    public Comment withCommId(Long commId) {
        this.setCommId(commId);
        return this;
    }

    public void setCommId(Long commId) {
        this.commId = commId;
    }

    public Date getCommCreatedate() {
        return commCreatedate;
    }

    public Comment withCommCreatedate(Date commCreatedate) {
        this.setCommCreatedate(commCreatedate);
        return this;
    }

    public void setCommCreatedate(Date commCreatedate) {
        this.commCreatedate = commCreatedate;
    }

    public Long getUserId() {
        return userId;
    }

    public Comment withUserId(Long userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public Comment withArticleId(Long articleId) {
        this.setArticleId(articleId);
        return this;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Integer getCommPraise() {
        return commPraise;
    }

    public Comment withCommPraise(Integer commPraise) {
        this.setCommPraise(commPraise);
        return this;
    }

    public void setCommPraise(Integer commPraise) {
        this.commPraise = commPraise;
    }

    public Long getParentId() {
        return parentId;
    }

    public Comment withParentId(Long parentId) {
        this.setParentId(parentId);
        return this;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCommContent() {
        return commContent;
    }

    public Comment withCommContent(String commContent) {
        this.setCommContent(commContent);
        return this;
    }

    public void setCommContent(String commContent) {
        this.commContent = commContent == null ? null : commContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", commId=").append(commId);
        sb.append(", commCreatedate=").append(commCreatedate);
        sb.append(", userId=").append(userId);
        sb.append(", articleId=").append(articleId);
        sb.append(", commPraise=").append(commPraise);
        sb.append(", parentId=").append(parentId);
        sb.append(", commContent=").append(commContent);
        sb.append("]");
        return sb.toString();
    }
}