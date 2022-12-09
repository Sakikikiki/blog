package com.wy.qa.mapper;

import com.wy.qa.pojo.User;
import org.apache.ibatis.annotations.*;

public interface UserMapper {
    /**
     * 新增一条用户数据
     *
     * @param user 用户
     */
    @Insert("insert into t_user(user_id, username, pwd, sex, email, createtime) " +
            "values (seq_user.nextval, #{username,jdbcType=VARCHAR}, #{pwd,jdbcType=VARCHAR}, #{sex,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, sysdate)")
    void add(User user);

    /**
     * 根据用户ID查询用户数据
     *
     * @param userId 用户ID
     * @return 用户数据
     */
    @Select("select * from t_user where user_id = #{userId}")
    @ResultMap("UserAndRoleMap")
    User getById(Integer userId);

    /**
     * 根据邮箱查询用户数据
     *
     * @param email 邮箱
     * @return 用户数据
     */
    @Select("select * from t_user where email = #{email}")
    @ResultMap("UserAndRoleMap")
    User getByEmail(String email);

    /**
     * 根据用户ID更改密码
     *
     * @param pwd    新密码
     * @param userId 用户ID
     */
    @Update("update t_user set pwd = #{pwd} where user_id = #{userId}")
    void updatePwd(@Param("pwd") String pwd, @Param("userId") Integer userId);

    /**
     * 根据用户ID更改个人资料
     *
     * @param username 用户名
     * @param sex      性别
     * @param city     所在城市
     * @param motto    个性签名
     * @param userId   用户ID
     */
    @Update("update t_user " +
            "set username = #{username}, sex = #{sex}, city = #{city}, motto = #{motto} " +
            "where user_id = #{userId}")
    void updateSelfInfo(@Param("username") String username, @Param("sex") Integer sex, @Param("city") String city, @Param("motto") String motto, @Param("userId") Integer userId);

    /**
     * 根据用户ID上传头像
     *
     * @param filename 头像文件名(带后缀名)
     * @param userId   用户ID
     */
    @Update("update t_user set avatar = #{filename} where user_id = #{userId}")
    void updateAvatar(@Param("filename") String filename, @Param("userId") Integer userId);

    /**
     * 变更用户角色
     *
     * @param userId 用户ID
     * @param roleId 角色ID
     */
    @Update("update t_user set role_id = #{roleId} where user_id = #{userId}")
    void updateRole(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

    /**
     * 充值飞吻
     *
     * @param number RMB
     * @param userId 用户ID
     */
    @Update("update t_user set money = money + 10 * #{number} where user_id = #{userId}")
    void charge(@Param("number") Integer number, @Param("userId") Integer userId);

    /**
     * 扣款
     *
     * @param number 扣款数额(飞吻)
     * @param userId 用户ID
     */
    @Update("update t_user set money = money - #{number} where user_id = #{userId}")
    void deduction(@Param("number") Integer number, @Param("userId") Integer userId);

    /**
     * 根据用户ID删除用户数据
     *
     * @param userId 用户ID
     */
    @Delete("delete from t_user where user_id = #{userId}")
    void del(Integer userId);
}
