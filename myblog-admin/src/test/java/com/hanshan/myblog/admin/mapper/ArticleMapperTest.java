package com.hanshan.myblog.admin.mapper;


import com.hanshan.myblog.domain.entity.Article;
import com.hanshan.myblog.domain.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;
import java.util.List;

@SpringBootTest
@ComponentScan({"com.hanshan.myblog.domain.config"})
@MapperScan({"com.hanshan.myblog.domain.mapper"})
public class ArticleMapperTest {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void addarticletest(){
        Article article = new Article();
        article.setArticleContent("testcontent002");
        article.setArticleTitle("testtitle002");
        article.setArticleCreatedate(new Date());
        articleMapper.addArticle(article);
    }

    @Test
    public void deletearticletest(){
        articleMapper.deleteArticleById(4L);
    }


    @Test
    public void updatearticletest(){
        Article article = articleMapper.findArticleById(5L);
        article.setArticlePraise(10);
        articleMapper.updateArticle(article);
    }

    @Test
    public void findallarticletest(){
        List<Article> articles = articleMapper.findAll();
        for (Article article: articles
             ) {
            System.out.println(article);
        }
    }

}
