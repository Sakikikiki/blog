package com.wy.qa.mapper;

import com.wy.qa.pojo.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PostMapper {
    /**
     * 新增一条帖子数据
     *
     * @param post 帖子
     */
    void add(Post post);

    /**
     * 根据帖子ID查询帖子信息
     *
     * @param postId 帖子ID
     * @return 帖子信息
     */
    Post getById(Integer postId);

    /**
     * 根据标题模糊查询帖子(按时间降序排列)
     *
     * @param title    帖子标题
     * @param pageNo   当前页码
     * @param pageSize 每页显示的帖子数量
     * @return 帖子列表
     */
    List<Post> queryAllByPage(@Param("title") String title, @Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize);

    /**
     * 分页查询自己的帖子(按时间降序排列)
     *
     * @param userId   当前用户ID
     * @param pageNo   当前页码
     * @param pageSize 每页显示的帖子数量
     * @return 帖子列表
     */
    List<Post> querySelfByPage(@Param("userId") Integer userId, @Param("pageNo") Integer pageNo, @Param("pageSize") Integer pageSize);

    /**
     * 根据帖子置顶状态查询帖子信息
     *
     * @param topping 置顶状态(1未置顶,2已置顶)
     * @return 帖子列表
     */
    @Select("select * from t_post where topping = #{topping} order by createtime desc")
    @ResultMap("PostMap")
    List<Post> queryByTopping(Integer topping);

    /**
     * 根据帖子结贴状态查询帖子信息
     *
     * @param status 结贴状态(1未结帖,2已结帖)
     * @return 帖子列表
     */
    @Select("select * from t_post where status = #{status}")
    @ResultMap("PostMap")
    List<Post> queryByStatus(Integer status);

    /**
     * 最近热帖(浏览量降序排序,只显示8条)
     *
     * @return 帖子列表
     */
    List<Post> orderByViews();

    /**
     * 近期热议
     *
     * @return 帖子列表
     */
    List<Post> orderByReplies();

    /**
     * 根据帖子ID更改帖子信息
     *
     * @param title   帖子标题
     * @param content 帖子内容
     * @param tagId   帖子标签
     * @param postId  帖子ID
     */
    @Update("update t_post set post_title = #{title},post_content = #{content},tag_id = #{tagId} " +
            "where post_id = #{postId}")
    void updatePost(@Param("title") String title, @Param("content") String content, @Param("tagId") Integer tagId, @Param("postId") Integer postId);

    /**
     * 根据帖子ID更改评论量
     *
     * @param postId 帖子ID
     * @param number 评论量
     */
    @Update("update t_post set replies = #{number} where post_id = #{postId}")
    void updateReplies(@Param("postId") Integer postId, @Param("number") Integer number);

    /**
     * 根据帖子ID更改帖子结贴状态(1未结帖->2已结帖)
     *
     * @param postId 帖子ID
     */
    @Update("update t_post set status = #{status} where post_id = #{postId}")
    void updateStatus(@Param("postId") Integer postId, @Param("status") Integer status);

    /**
     * 根据帖子ID删除帖子数据
     *
     * @param postId 帖子ID
     */
    @Delete("delete from t_post where post_id = #{postId}")
    void del(Integer postId);
}
