package com.hanshan.myblog.domain.example.entity;

import java.io.Serializable;
import java.util.Date;

public class Article implements Serializable {
    private Long articleId;

    private String articleTitle;

    private Date articleCreatedate;

    private Integer articlePraise;

    private Integer articleComment;

    private Long adminId;

    private String articleContent;

    private static final long serialVersionUID = 1L;

    public Long getArticleId() {
        return articleId;
    }

    public Article withArticleId(Long articleId) {
        this.setArticleId(articleId);
        return this;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public Article withArticleTitle(String articleTitle) {
        this.setArticleTitle(articleTitle);
        return this;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Date getArticleCreatedate() {
        return articleCreatedate;
    }

    public Article withArticleCreatedate(Date articleCreatedate) {
        this.setArticleCreatedate(articleCreatedate);
        return this;
    }

    public void setArticleCreatedate(Date articleCreatedate) {
        this.articleCreatedate = articleCreatedate;
    }

    public Integer getArticlePraise() {
        return articlePraise;
    }

    public Article withArticlePraise(Integer articlePraise) {
        this.setArticlePraise(articlePraise);
        return this;
    }

    public void setArticlePraise(Integer articlePraise) {
        this.articlePraise = articlePraise;
    }

    public Integer getArticleComment() {
        return articleComment;
    }

    public Article withArticleComment(Integer articleComment) {
        this.setArticleComment(articleComment);
        return this;
    }

    public void setArticleComment(Integer articleComment) {
        this.articleComment = articleComment;
    }

    public Long getAdminId() {
        return adminId;
    }

    public Article withAdminId(Long adminId) {
        this.setAdminId(adminId);
        return this;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public Article withArticleContent(String articleContent) {
        this.setArticleContent(articleContent);
        return this;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", articleId=").append(articleId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", articleCreatedate=").append(articleCreatedate);
        sb.append(", articlePraise=").append(articlePraise);
        sb.append(", articleComment=").append(articleComment);
        sb.append(", adminId=").append(adminId);
        sb.append(", articleContent=").append(articleContent);
        sb.append("]");
        return sb.toString();
    }
}