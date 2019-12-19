package com.hanshan.myblog.domain.generator.mapper;

import com.hanshan.myblog.domain.generator.entity.Comment;
import com.hanshan.myblog.domain.generator.entity.CommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface CommentMapper {
    long countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    @Delete({
        "delete from blog_comment",
        "where comm_id = #{commId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long commId);

    @Insert({
        "insert into blog_comment (comm_id, comm_createdate, ",
        "user_id, article_id, ",
        "comm_praise, parent_id, ",
        "comm_content)",
        "values (#{commId,jdbcType=BIGINT}, #{commCreatedate,jdbcType=TIMESTAMP}, ",
        "#{userId,jdbcType=BIGINT}, #{articleId,jdbcType=BIGINT}, ",
        "#{commPraise,jdbcType=INTEGER}, #{parentId,jdbcType=BIGINT}, ",
        "#{commContent,jdbcType=LONGVARCHAR})"
    })
    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExampleWithBLOBsWithRowbounds(CommentExample example, RowBounds rowBounds);

    List<Comment> selectByExampleWithBLOBs(CommentExample example);

    List<Comment> selectByExampleWithRowbounds(CommentExample example, RowBounds rowBounds);

    List<Comment> selectByExample(CommentExample example);

    @Select({
        "select",
        "comm_id, comm_createdate, user_id, article_id, comm_praise, parent_id, comm_content",
        "from blog_comment",
        "where comm_id = #{commId,jdbcType=BIGINT}"
    })
    @ResultMap("com.hanshan.myblog.domain.generator.mapper.CommentMapper.ResultMapWithBLOBs")
    Comment selectByPrimaryKey(Long commId);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExampleWithBLOBs(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByPrimaryKeySelective(Comment record);

    @Update({
        "update blog_comment",
        "set comm_createdate = #{commCreatedate,jdbcType=TIMESTAMP},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "article_id = #{articleId,jdbcType=BIGINT},",
          "comm_praise = #{commPraise,jdbcType=INTEGER},",
          "parent_id = #{parentId,jdbcType=BIGINT},",
          "comm_content = #{commContent,jdbcType=LONGVARCHAR}",
        "where comm_id = #{commId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(Comment record);

    @Update({
        "update blog_comment",
        "set comm_createdate = #{commCreatedate,jdbcType=TIMESTAMP},",
          "user_id = #{userId,jdbcType=BIGINT},",
          "article_id = #{articleId,jdbcType=BIGINT},",
          "comm_praise = #{commPraise,jdbcType=INTEGER},",
          "parent_id = #{parentId,jdbcType=BIGINT}",
        "where comm_id = #{commId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Comment record);
}