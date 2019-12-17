package com.hanshan.myblog.domain.mapper;

import com.hanshan.myblog.domain.entity.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface AdminMapper {

    //----------------------------------------------------增------------------------------------------------------------
    @Insert("insert into blog_admin(" +
            "admin_account,admin_password,admin_name) " +
            "values(" +
            "#{adminAccount},#{adminPassword},#{adminName})")
    public int addAdmin(Admin admin);

    //----------------------------------------------------删------------------------------------------------------------

    @Delete("delete from blog_admin where admin_id=#{id}")
    public int deleteAdminById(Long id);
    //----------------------------------------------------改------------------------------------------------------------

    @Update("update blog_admin set " +
            "admin_account=#{adminAccount},admin_password=#{adminPassword},admin_name=#{adminName} " +
            "where admin_id=#{adminId}")
    public int updateAdmin(Admin admin);
    //----------------------------------------------------查------------------------------------------------------------
    @Select("select * from blog_admin where admin_id=#{id}")
    public Admin findAdminById(Long id);

    @Select("select * from blog_admin")
    public List<Admin> findAll();

    @Select("select * from blog_admin where admin_account=#{adminAccount} and admin_password=#{adminPassword}")
    public Admin findAdminByAccountAndPassword(String adminAccount,String adminPassword);

    public List<Admin> selectByExample();
}
