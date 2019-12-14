package com.hanshan.myblog.domain.mapper;

import com.hanshan.myblog.domain.entity.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
    /*
    * private Long articleId;
    private String articleTitle;
    private String articleContent;
    private Date articleCreatedate;
    private Integer articlePraise;
    private Integer articleComment;
    private Long adminId;
    * */

    //----------------------------------------------------增------------------------------------------------------------
    @Insert("insert into blog_article(" +
            "article_title,article_content,article_createdate,article_praise,article_comment,admin_id) " +
            "values(" +
            "#{articleTitle},#{articleContent},#{articleCreatedate},#{articlePraise},#{articleComment},#{adminId})")
    public int addArticle(Article article);

    //----------------------------------------------------删------------------------------------------------------------

    @Delete("delete from blog_article where article_id=#{id}")
    public int deleteArticleById(Long id);

    //----------------------------------------------------改------------------------------------------------------------

    @Update("update blog_article set " +
            "article_title=#{articleTitle},article_content=#{articleContent},article_createdate=#{articleCreatedate},article_praise=#{articlePraise},article_comment=#{articleComment},admin_id=#{adminId} " +
            "where article_id=#{articleId}")
    public int updateArticle(Article article);
    //----------------------------------------------------查------------------------------------------------------------

    @Select("select * from blog_article where article_id=#{id}")
    public Article findArticleById(Long id);

    @Select("select * from blog_article")
    public List<Article> findAll();

}
