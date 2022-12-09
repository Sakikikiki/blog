package com.wy.qa.mapper;

import com.wy.qa.pojo.Report;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ReportMapper {
    /**
     * 新增一条举报数据
     *
     * @param report 举报数据
     */
    @Insert("insert into t_report(report_id,post_id,user_id,report_title,report_reason,report_time) " +
            "values(seq_report.nextval,#{postId},#{userId},#{title},#{reason},sysdate)")
    void add(Report report);

    /**
     * 根据举报ID查询举报信息
     *
     * @param reportId 举报ID
     * @return 举报信息
     */
    @Select("select * from t_report where report_id = #{reportId}")
    @ResultMap("ReportAndPostAndUserMap")
    Report getById(Integer reportId);

    /**
     * 根据举报的审核状态查询举报信息
     *
     * @param status 审核状态(1未审核,2已审核)
     * @return 举报信息列表
     */
    @Select("select * from t_report where status = #{status}")
    @ResultMap("ReportAndPostAndUserMap")
    List<Report> queryReportByStatus(Integer status);

    /**
     * 根据举报ID更改该举报的审核状态
     *
     * @param reportId 举报ID
     */
    @Update("update t_report set status = 2 where report_id = #{reportId}")
    void updateStatus(Integer reportId);

    /**
     * 根据举报ID删除举报信息
     *
     * @param reportId 举报ID
     */
    @Delete("delete from t_report where report_id = #{reportId}")
    void del(Integer reportId);
}
