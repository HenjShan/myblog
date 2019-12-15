package com.hanshan.myblog.domain.mapper;

import com.hanshan.myblog.domain.entity.Comment;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CommentMapper {

    //----------------------------------------------------增------------------------------------------------------------
    @Insert("insert into blog_comment(" +
            "comm_content,comm_createdate,user_id,article_id,comm_praise,parent_id) " +
            "values(" +
            "#{commContent},#{commCreatedate},#{userId},#{articleId},#{commPraise},#{parentId})")
    public int addComment(Comment comment);

    //----------------------------------------------------删------------------------------------------------------------

    @Delete("delete from blog_comment where comm_id=#{id}")
    public int deleteCommentById(Long id);

    //----------------------------------------------------改------------------------------------------------------------

    @Update("update blog_comment set " +
            "comm_content=#{commContent},comm_createdate=#{commCreatedate},user_id=#{userId},article_id=#{articleId},comm_praise=#{commPraise},parent_id=#{parentId} " +
            "where comm_id=#{commId}")
    public int updateComment(Comment comment);

    //----------------------------------------------------查------------------------------------------------------------

    @Select("select * from blog_comment where comm_id=#{id}")
    public Comment findCommentById(Long id);

    @Select("select * from blog_comment where user_id=#{userId}")
    public List<Comment> findCommentsByuserId(Long userId);

    @Select("select * from blog_comment where article_id=#{articleId}")
    public List<Comment> findCommentsByarticleId(Long articleId);

    @Select("select * from blog_comment")
    public List<Comment> findAll();

}
