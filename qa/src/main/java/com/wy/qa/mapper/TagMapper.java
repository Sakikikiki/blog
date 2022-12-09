package com.wy.qa.mapper;

import com.wy.qa.pojo.Tag;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface TagMapper {
    /**
     * 新增一条标签数据
     *
     * @param tag 标签
     */
    @Insert("insert into t_tag(tag_id,tag_name) values(seq_tag.nextval,#{tagName})")
    void add(Tag tag);

    /**
     * 根据标签ID查询标签信息
     *
     * @param tagId 标签ID
     * @return 标签信息
     */
    @Select("select * from t_tag where tag_id = #{tagId}")
    @ResultMap("TagMap")
    Tag getById(Integer tagId);

    /**
     * 根据标签ID删除标签数据
     *
     * @param tagId 标签ID
     */
    @Delete("delete from t_tag where tag_id = #{tagId}")
    void del(Integer tagId);
}
