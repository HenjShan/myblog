package com.hanshan.myblog.domain.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Comment implements Serializable {

    private Long commId;
    private String commContent;
    private Date commCreatedate;
    private Long userId;
    private Long articleId;
    private Integer commPraise;
    private Long parentId;
}
