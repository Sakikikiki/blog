package com.wy.qa.mapper;

import com.wy.qa.pojo.Collect;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

import java.util.List;

public interface CollectMapper {
    /**
     * 新增一条收藏数据
     *
     * @param collect 收藏数据
     */
    @Insert("insert into t_collection(collection_id,post_id,user_id,collect_time) " +
            "values(seq_collection.nextval,#{postId},#{userId},sysdate)")
    void add(Collect collect);

    /**
     * 根据当前用户ID查询该用户的收藏信息
     *
     * @param userId 用户ID
     * @return 收藏列表
     */
    List<Collect> queryByUserId(Integer userId);

    /**
     * 根据收藏ID删除收藏信息
     *
     * @param collectionId 收藏ID
     */
    @Delete("delete from t_collection where collection_id = #{collectId}")
    void del(Integer collectionId);
}
