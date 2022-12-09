package com.wy.qa.service;

import com.wy.qa.pojo.Post;

import java.util.List;

public interface PostService {
    void add(Post post);

    Post getById(Integer postId);

    List<Post> queryAllByPage(String title, Integer pageNo, Integer pageSize);

    List<Post> querySelfByPage(Integer userId, Integer pageNo, Integer pageSize);

    List<Post> queryByTopping(Integer topping);

    List<Post> queryByStatus(Integer status);

    List<Post> orderByViews();

    List<Post> orderByReplies();

    void updatePost(String title, String content, Integer tagId, Integer postId);

    void updateReplies(Integer postId, Integer number);

    void updateStatus(Integer postId, Integer status);

    void del(Integer postId);
}
