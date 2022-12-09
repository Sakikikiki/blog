package com.wy.qa.mapper;

import com.wy.qa.pojo.VIP;
import org.apache.ibatis.annotations.*;

import java.util.Date;

public interface VIPMapper {
    /**
     * 新增一条VIP数据
     *
     * @param vip VIP数据
     */
    @Insert("insert into t_vip(vip_id,user_id,start_time,end_time) " +
            "values(seq_vip.nextval,#{userId},#{startTime},#{endTime})")
    void add(VIP vip);

    /**
     * 根据用户ID查询该用户的VIP信息
     *
     * @param userId 用户ID
     * @return VIP信息
     */
    @Select("select * from t_vip where user_id = #{userId}")
    @ResultMap("VIPAndUserMap")
    VIP getById(Integer userId);

    /**
     * 根据用户ID更新该用户VIP的起止时间
     *
     * @param newEndTime 充值VIP后的截止时间
     * @param userId     用户ID
     */
    @Update("update t_vip set end_time = #{newEndTime} where user_id = #{userId}")
    void updateTime(@Param("newEndTime") Date newEndTime, @Param("userId") Integer userId);

    /**
     * 根据用户ID撤销该用户的VIP
     *
     * @param userId 用户ID
     */
    @Delete("delete from t_vip where user_id = #{userId}")
    void del(Integer userId);
}
