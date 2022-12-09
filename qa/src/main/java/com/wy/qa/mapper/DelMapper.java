package com.wy.qa.mapper;

import com.wy.qa.pojo.Del;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DelMapper {
    /**
     * 新增一条删帖数据
     *
     * @param del 删帖数据
     */
    @Insert("insert into t_del(del_id,post_title,post_content,post_author_id,del_reason,del_time) " +
            "values(seq_del.nextval,#{postTitle},#{postContent},#{authorId},#{reason},sysdate)")
    void add(Del del);

    /**
     * 根据删帖ID查询删帖信息
     *
     * @param delId 删帖ID
     * @return 删帖信息
     */
    @Select("select * from t_del where del_id = #{delId}")
    @ResultMap("DelAndUserMap")
    Del getById(Integer delId);

    /**
     * 查询所有的删帖信息
     *
     * @return 删帖列表
     */
    @Select("select * from t_del")
    @ResultMap("DelAndUserMap")
    List<Del> queryAll();
}
