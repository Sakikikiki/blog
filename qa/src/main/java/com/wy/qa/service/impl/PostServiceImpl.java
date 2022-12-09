package com.wy.qa.service.impl;

import com.wy.qa.mapper.PostMapper;
import com.wy.qa.pojo.Post;
import com.wy.qa.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("postService")
public class PostServiceImpl implements PostService {
    private final PostMapper postMapper;

    @Autowired
    public PostServiceImpl(PostMapper postMapper) {
        this.postMapper = postMapper;
    }

    @Transactional
    @Override
    public void add(Post post) {
        postMapper.add(post);
    }

    @Override
    public Post getById(Integer postId) {
        return postMapper.getById(postId);
    }

    @Override
    public List<Post> queryAllByPage(String title, Integer pageNo, Integer pageSize) {
        return postMapper.queryAllByPage(title, pageNo, pageSize);
    }

    @Override
    public List<Post> querySelfByPage(Integer userId, Integer pageNo, Integer pageSize) {
        return postMapper.querySelfByPage(userId, pageNo, pageSize);
    }

    @Override
    public List<Post> queryByTopping(Integer topping) {
        return postMapper.queryByTopping(topping);
    }

    @Override
    public List<Post> queryByStatus(Integer status) {
        return postMapper.queryByStatus(status);
    }

    @Override
    public List<Post> orderByViews() {
        return postMapper.orderByViews();
    }

    @Override
    public List<Post> orderByReplies() {
        return postMapper.orderByReplies();
    }

    @Transactional
    @Override
    public void updatePost(String title, String content, Integer tagId, Integer postId) {
        postMapper.updatePost(title, content, tagId, postId);
    }

    @Transactional
    @Override
    public void updateReplies(Integer postId, Integer number) {
        postMapper.updateReplies(postId, number);
    }

    @Transactional
    @Override
    public void updateStatus(Integer postId, Integer status) {
        postMapper.updateStatus(postId, status);
    }

    @Transactional
    @Override
    public void del(Integer postId) {
        postMapper.del(postId);
    }
}
