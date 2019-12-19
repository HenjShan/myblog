package com.hanshan.myblog.domain.generator.mapper;

import com.hanshan.myblog.domain.generator.entity.Admin;
import com.hanshan.myblog.domain.generator.entity.AdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface AdminMapper {
    long countByExample(AdminExample example);

    int deleteByExample(AdminExample example);

    @Delete({
        "delete from blog_admin",
        "where admin_id = #{adminId,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long adminId);

    @Insert({
        "insert into blog_admin (admin_id, admin_account, ",
        "admin_password, admin_name)",
        "values (#{adminId,jdbcType=BIGINT}, #{adminAccount,jdbcType=VARCHAR}, ",
        "#{adminPassword,jdbcType=VARCHAR}, #{adminName,jdbcType=VARCHAR})"
    })
    int insert(Admin record);

    int insertSelective(Admin record);

    List<Admin> selectByExampleWithRowbounds(AdminExample example, RowBounds rowBounds);

    List<Admin> selectByExample(AdminExample example);

    @Select({
        "select",
        "admin_id, admin_account, admin_password, admin_name",
        "from blog_admin",
        "where admin_id = #{adminId,jdbcType=BIGINT}"
    })
    @ResultMap("com.hanshan.myblog.domain.generator.mapper.AdminMapper.BaseResultMap")
    Admin selectByPrimaryKey(Long adminId);

    int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

    int updateByPrimaryKeySelective(Admin record);

    @Update({
        "update blog_admin",
        "set admin_account = #{adminAccount,jdbcType=VARCHAR},",
          "admin_password = #{adminPassword,jdbcType=VARCHAR},",
          "admin_name = #{adminName,jdbcType=VARCHAR}",
        "where admin_id = #{adminId,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Admin record);
}