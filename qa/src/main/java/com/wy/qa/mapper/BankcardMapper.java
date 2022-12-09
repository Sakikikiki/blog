package com.wy.qa.mapper;

import com.wy.qa.pojo.Bankcard;
import org.apache.ibatis.annotations.*;

public interface BankcardMapper {
    /**
     * 新增一条银行卡数据
     *
     * @param bankcard 银行卡
     */
    @Insert("insert into t_bankcard(seq_id,card_id,card_pwd,balance,user_id) " +
            "values(seq_bankcard.nextval,#{cardId},#{cardPwd},100,#{userId,jdbcType=VARCHAR})")
    void add(Bankcard bankcard);

    /**
     * 根据用户ID查询银行卡信息
     *
     * @param userId 用户ID
     * @return 银行卡信息
     */
    @Select("select * from t_bankcard where user_id = #{userId}")
    @ResultMap("BankcardAndUserMap")
    Bankcard getById(Integer userId);

    /**
     * 扣款
     *
     * @param cardId 银行卡号
     * @param number 扣款数额
     */
    void deduction(@Param("cardId") String cardId, @Param("number") Integer number);

    /**
     * 根据银行卡号删除银行卡信息
     *
     * @param cardId 银行卡号
     */
    @Delete("delete from t_bankcard where card_id = #{cardId}")
    void del(String cardId);
}
