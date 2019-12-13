package com.hanshan.myblog.domain.mapper;


import com.hanshan.myblog.domain.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    //----------------------------------------------------增------------------------------------------------------------
    @Insert("insert into blog_user()")
    public int addUser(User user);

    //----------------------------------------------------删------------------------------------------------------------


    //----------------------------------------------------改------------------------------------------------------------


    //----------------------------------------------------查------------------------------------------------------------


}
