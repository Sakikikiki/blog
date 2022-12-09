package com.wy.qa.mapper;

import com.wy.qa.pojo.Check;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface CheckMapper {
    /**
     * 添加一条审核数据
     *
     * @param check 审核数据
     */
    @Insert("insert into t_check(check_id, report_id, check_result, check_time) " +
            "values (seq_check.nextval, #{reportId}, #{result}, sysdate)")
    void add(Check check);

    /**
     * 根据审核ID查询审核信息
     *
     * @param checkId 审核ID
     * @return 审核信息
     */
    @Select("select * from t_check where check_id = #{checkId}")
    @ResultMap("CheckAndReportMap")
    Check getById(Integer checkId);

    /**
     * 根据审核ID删除审核信息
     *
     * @param checkId 审核ID
     */
    @Delete("delete from t_check where check_id = #{checkId}")
    void del(Integer checkId);
}
