package com.wy.qa.mapper;

import com.wy.qa.pojo.Violation;
import org.apache.ibatis.annotations.*;

public interface ViolationMapper {
    /**
     * 新增一条违规数据
     *
     * @param violation 违规数据
     */
    @Insert("insert into t_violation(vio_id,user_id) values(seq_vio.nextval,#{userId})")
    void add(Violation violation);

    /**
     * 根据用户ID查询违规信息
     *
     * @param userId 用户ID
     * @return 违规信息
     */
    @Select("select * from t_violation where user_id = #{userId}")
    @ResultMap("ViolationAndUserMap")
    Violation getById(Integer userId);

    /**
     * 根据用户ID更改用户违规次数(+1)
     *
     * @param userId 用户ID
     */
    @Update("update t_violation set vio_times = vio_times + 1 where user_id = #{userId}")
    void updateVio(Integer userId);

    /**
     * 根据用户ID删除违规信息
     *
     * @param userId 用户ID
     */
    @Delete("delete from t_violation where user_id = #{userId}")
    void del(Integer userId);
}
