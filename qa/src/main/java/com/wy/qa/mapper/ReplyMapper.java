package com.wy.qa.mapper;

import com.wy.qa.pojo.Reply;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface ReplyMapper {
    /**
     * 新增一条回复数据
     *
     * @param reply 回复
     */
    @Insert("insert into t_reply(reply_id,reply_content,post_id,user_id,reply_time) " +
            "values(seq_reply.nextval,#{content},#{postId},#{userId},sysdate)")
    void add(Reply reply);

    /**
     * 根据回复ID查询回复信息
     *
     * @param replyId 回复ID
     * @return 回复信息
     */
    @Select("select * from t_reply where reply_id = #{replyId}")
    @ResultMap("ReplyAndPostAndUserMap")
    Reply getById(Integer replyId);

    /**
     * 根据用户ID查询该用户的部分评论
     *
     * @param userId 用户ID
     * @param size   显示的评论数量
     * @return 评论列表
     */
    List<Reply> queryByIdAndSize(@Param("userId") Integer userId, @Param("size") Integer size);

    /**
     * 根据帖子ID查询帖子下的所有评论
     *
     * @param postId 帖子ID
     * @return 评论列表
     */
    @Select("select * from t_reply where post_id = #{postId}")
    @ResultMap("ReplyAndPostAndUserMap")
    List<Reply> queryAllById(Integer postId);

    /**
     * 根据回帖ID更改该回帖的点赞数
     *
     * @param replyId 回帖ID
     * @param number  点赞数
     */
    @Update("update t_reply set likes = #{number} where reply_id = #{replyId}")
    void updateLikes(@Param("replyId") Integer replyId, @Param("number") Integer number);

    /**
     * 根据回复ID删除回复
     *
     * @param replyId 回复ID
     */
    @Delete("delete from t_reply where reply_id = #{replyId}")
    void del(Integer replyId);
}
