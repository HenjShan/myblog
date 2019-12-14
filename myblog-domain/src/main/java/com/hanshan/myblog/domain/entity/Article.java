package com.hanshan.myblog.domain.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Article implements Serializable {

    /*
  `article_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `article_title` varchar(255) COLLATE utf8mb4_general_ci DEFAULT NULL,
  `article_content` mediumtext COLLATE utf8mb4_general_ci,
  `article_createdate` timestamp NOT NULL,
  `article_praise` int(11) DEFAULT '0',
  `article_comment` int(11) DEFAULT '0',
  `admin_id` bigint(20) DEFAULT NULL,
    * */

    private Long articleId;
    private String articleTitle;
    private String articleContent;
    private Date articleCreatedate;
    private Integer articlePraise;
    private Integer articleComment;
    private Long adminId;

}
