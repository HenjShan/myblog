package com.hanshan.myblog.domain.generator.mapper;

import com.hanshan.myblog.domain.generator.entity.Article;
import com.hanshan.myblog.domain.generator.entity.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface ArticleMapper {
    long countByExample(ArticleExample example);

    int deleteByExample(ArticleExample example);

    @Delete({
        "delete from blog_article",
        "where article_id = #{articleId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long articleId);

    @Insert({
        "insert into blog_article (article_id, article_title, ",
        "article_createdate, article_praise, ",
        "article_comment, admin_id, ",
        "article_content)",
        "values (#{articleId,jdbcType=BIGINT}, #{articleTitle,jdbcType=VARCHAR}, ",
        "#{articleCreatedate,jdbcType=TIMESTAMP}, #{articlePraise,jdbcType=INTEGER}, ",
        "#{articleComment,jdbcType=INTEGER}, #{adminId,jdbcType=BIGINT}, ",
        "#{articleContent,jdbcType=LONGVARCHAR})"
    })
    int insert(Article record);

    int insertSelective(Article record);

    List<Article> selectByExampleWithBLOBsWithRowbounds(ArticleExample example, RowBounds rowBounds);

    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    List<Article> selectByExampleWithRowbounds(ArticleExample example, RowBounds rowBounds);

    List<Article> selectByExample(ArticleExample example);

    @Select({
        "select",
        "article_id, article_title, article_createdate, article_praise, article_comment, ",
        "admin_id, article_content",
        "from blog_article",
        "where article_id = #{articleId,jdbcType=BIGINT}"
    })
    @ResultMap("com.hanshan.myblog.domain.generator.mapper.ArticleMapper.ResultMapWithBLOBs")
    Article selectByPrimaryKey(Long articleId);

    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    int updateByPrimaryKeySelective(Article record);

    @Update({
        "update blog_article",
        "set article_title = #{articleTitle,jdbcType=VARCHAR},",
          "article_createdate = #{articleCreatedate,jdbcType=TIMESTAMP},",
          "article_praise = #{articlePraise,jdbcType=INTEGER},",
          "article_comment = #{articleComment,jdbcType=INTEGER},",
          "admin_id = #{adminId,jdbcType=BIGINT},",
          "article_content = #{articleContent,jdbcType=LONGVARCHAR}",
        "where article_id = #{articleId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Article record);

    @Update({
        "update blog_article",
        "set article_title = #{articleTitle,jdbcType=VARCHAR},",
          "article_createdate = #{articleCreatedate,jdbcType=TIMESTAMP},",
          "article_praise = #{articlePraise,jdbcType=INTEGER},",
          "article_comment = #{articleComment,jdbcType=INTEGER},",
          "admin_id = #{adminId,jdbcType=BIGINT}",
        "where article_id = #{articleId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Article record);
}