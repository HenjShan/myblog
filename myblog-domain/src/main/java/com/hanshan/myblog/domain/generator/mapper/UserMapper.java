package com.hanshan.myblog.domain.generator.mapper;

import com.hanshan.myblog.domain.generator.entity.User;
import com.hanshan.myblog.domain.generator.entity.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    @Delete({
        "delete from blog_user",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long userId);

    @Insert({
        "insert into blog_user (user_id, user_name, ",
        "user_account, user_password, ",
        "user_gender, user_birthday, ",
        "user_phone, user_email)",
        "values (#{userId,jdbcType=BIGINT}, #{userName,jdbcType=VARCHAR}, ",
        "#{userAccount,jdbcType=VARCHAR}, #{userPassword,jdbcType=VARCHAR}, ",
        "#{userGender,jdbcType=TINYINT}, #{userBirthday,jdbcType=TIMESTAMP}, ",
        "#{userPhone,jdbcType=VARCHAR}, #{userEmail,jdbcType=VARCHAR})"
    })
    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExampleWithRowbounds(UserExample example, RowBounds rowBounds);

    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "user_id, user_name, user_account, user_password, user_gender, user_birthday, ",
        "user_phone, user_email",
        "from blog_user",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    @ResultMap("com.hanshan.myblog.domain.generator.mapper.UserMapper.BaseResultMap")
    User selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    @Update({
        "update blog_user",
        "set user_name = #{userName,jdbcType=VARCHAR},",
          "user_account = #{userAccount,jdbcType=VARCHAR},",
          "user_password = #{userPassword,jdbcType=VARCHAR},",
          "user_gender = #{userGender,jdbcType=TINYINT},",
          "user_birthday = #{userBirthday,jdbcType=TIMESTAMP},",
          "user_phone = #{userPhone,jdbcType=VARCHAR},",
          "user_email = #{userEmail,jdbcType=VARCHAR}",
        "where user_id = #{userId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);
}