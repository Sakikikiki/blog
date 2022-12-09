package com.wy.qa.service.impl;

import com.wy.qa.mapper.TagMapper;
import com.wy.qa.pojo.Tag;
import com.wy.qa.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("tagService")
public class TagServiceImpl implements TagService {
    private final TagMapper tagMapper;

    @Autowired
    public TagServiceImpl(TagMapper tagMapper) {
        this.tagMapper = tagMapper;
    }

    @Transactional
    @Override
    public void add(Tag tag) {
        tagMapper.add(tag);
    }

    @Override
    public Tag getById(Integer tagId) {
        return tagMapper.getById(tagId);
    }

    @Transactional
    @Override
    public void del(Integer tagId) {
        tagMapper.del(tagId);
    }
}
