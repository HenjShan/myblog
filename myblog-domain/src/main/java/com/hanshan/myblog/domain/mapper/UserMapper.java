package com.hanshan.myblog.domain.mapper;


import com.hanshan.myblog.domain.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    //----------------------------------------------------增------------------------------------------------------------
    @Insert("insert into blog_user(" +
            "user_name,user_account,user_password,user_gender,user_birthday,user_phone,user_email) " +
            "values(" +
            "#{userName},#{userAccount},#{userPassword},#{userGender},#{userBirthday},#{userPhone},#{userEmail})")
    public int addUser(User user);

    //----------------------------------------------------删------------------------------------------------------------

    @Delete("delete from blog_user where user_id=#{id}")
    public int deleteUserById(Long id);

    //----------------------------------------------------改------------------------------------------------------------

    @Update("update blog_user set " +
            "user_name=#{userName},user_account=#{userAccount},user_password=#{userPassword},user_gender=#{userGender},user_birthday=#{userBirthday},user_phone=#{userPhone},user_email=#{userEmail} " +
            "where user_id=#{userId}")
    public int updateUser(User user);

    //----------------------------------------------------查------------------------------------------------------------
    @Select("select * from blog_user")
    public List<User> findAll();

    @Select("select * from blog_user where user_id=#{id}")
    public User findUserById(Long id);

}
