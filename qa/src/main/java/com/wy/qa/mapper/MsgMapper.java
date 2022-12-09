package com.wy.qa.mapper;

import com.wy.qa.pojo.Msg;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface MsgMapper {
    /**
     * 新增一条消息数据
     *
     * @param msg 消息数据
     */
    @Insert("insert into t_msg(msg_id,msg_sender_id,msg_recipient_id,msg_content,msg_send_time) " +
            "values(seq_msg.nextval,#{senderId},#{recipientId},#{content},sysdate)")
    void add(Msg msg);

    /**
     * 根据消息ID查询消息
     *
     * @param msgId 消息ID
     * @return 消息
     */
    @Select("select * from t_msg where msg_id = #{msgId}")
    @ResultMap("MsgMap")
    Msg getById(Integer msgId);

    /**
     * 根据用户ID查询该用户的所有消息
     *
     * @param recipientId 用户ID
     * @return 消息列表
     */
    List<Msg> queryById(Integer recipientId);

    /**
     * 根据消息ID更新消息状态(1未读->2已读)
     *
     * @param msgId 消息ID
     */
    @Update("update t_msg set status = 2 where msg_id = #{msgId}")
    void updateStatus(Integer msgId);

    /**
     * 全部已读
     */
    @Update("update t_msg set status = 2")
    void updateAllStatus();

    /**
     * 根据消息ID删除消息
     *
     * @param msgId 消息ID
     */
    @Delete("delete from t_msg where msg_id = #{msgId}")
    void del(Integer msgId);

    /**
     * 根据消息接收者ID删除该用户收到的所有消息
     *
     * @param recipientId 消息接收者ID
     */
    @Delete("delete from t_msg where msg_recipient_id = #{recipientId}")
    void delAll(Integer recipientId);
}
