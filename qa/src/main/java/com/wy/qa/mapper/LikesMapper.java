package com.wy.qa.mapper;

import com.wy.qa.pojo.Likes;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface LikesMapper {
    /**
     * 新增一条点赞数据
     *
     * @param likes 点赞数据
     */
    @Insert("insert into t_likes(like_id,reply_id,liker_id,createtime) " +
            "values(seq_likes.nextval,#{replyId},#{likerId},sysdate)")
    void add(Likes likes);

    /**
     * 根据回帖ID查询该回帖的点赞数
     *
     * @param replyId 回帖ID
     * @return 点赞数
     */
    @Select("select count(0) from t_likes where reply_id = #{replyId}")
    Integer queryLikesById(Integer replyId);

    /**
     * 根据用户ID删除点赞信息
     *
     * @param likerId 用户ID
     */
    @Delete("delete from t_likes where liker_id = #{likerId}")
    void del(Integer likerId);
}
