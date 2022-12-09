package com.wy.qa.mapper;

import com.wy.qa.pojo.Role;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface RoleMapper {
    /**
     * 新增一条角色数据
     *
     * @param role 角色
     */
    @Insert("insert into t_role(role_id,role_name) values(#{roleId},#{roleName})")
    void add(Role role);

    /**
     * 根据角色ID查询角色数据
     *
     * @param roleId 角色ID
     * @return 角色数据
     */
    @Select("select * from t_role where role_id = #{roleId}")
    @ResultMap("RoleMap")
    Role getById(Integer roleId);

    /**
     * 根据角色ID删除角色数据
     *
     * @param roleId 角色ID
     */
    @Delete("delete from t_role where role_id = #{roleId}")
    void del(Integer roleId);
}
