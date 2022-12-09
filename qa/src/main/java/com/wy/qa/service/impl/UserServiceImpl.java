package com.wy.qa.service.impl;

import com.wy.qa.exception.QaException;
import com.wy.qa.mapper.BankcardMapper;
import com.wy.qa.mapper.UserMapper;
import com.wy.qa.mapper.VIPMapper;
import com.wy.qa.pojo.User;
import com.wy.qa.pojo.VIP;
import com.wy.qa.service.UserService;
import com.wy.qa.util.BankcardUtil;
import com.wy.qa.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BankcardMapper bankcardMapper;
    @Autowired
    private VIPMapper vipMapper;

    /**
     * 用户注册
     *
     * @param user 用户信息
     */
    @Override
    @Transactional
    public void register(User user) {
        //根据邮箱查询数据库中是否有与之对应的用户
        User preUser = userMapper.getByEmail(user.getEmail());
        if (null == preUser) {
            //没有与该邮箱对应的用户,邮箱未被注册
            if (user.getPwd().trim().length() > 16 || user.getPwd().trim().length() < 6) {
                throw new QaException("密码长度应该在6-16位之间");
            } else {
                //密码长度在6-16位之间
                userMapper.add(user);
            }
        } else {
            throw new QaException("该邮箱已被注册");
        }
        User curUser = userMapper.getByEmail(user.getEmail());
        //随机生成该用户的银行卡号
        bankcardMapper.add(BankcardUtil.generate(curUser.getUserId()));
    }

    /**
     * 用户登录
     *
     * @param email 用户邮箱
     * @param pwd   用户密码
     * @return 用户信息
     */
    @Override
    public User login(String email, String pwd) {
        User user = userMapper.getByEmail(email);
        if (null == user) {
            throw new QaException("该账户尚未注册");
        } else {
            if (!pwd.equals(user.getPwd())) {
                throw new QaException("密码错误");
            }
        }
        return user;
    }

    /**
     * 用户更改密码
     *
     * @param curPwd     当前密码
     * @param newPwd     新密码
     * @param confirmPwd 确认密码
     * @param userId     用户ID
     */
    @Override
    @Transactional
    public void updatePwd(String curPwd, String newPwd, String confirmPwd, Integer userId) {
        if (!curPwd.equals(userMapper.getById(userId).getPwd())) {
            throw new QaException("当前密码错误");
        } else if (!newPwd.equals(confirmPwd)) {
            throw new QaException("新密码和确认密码不一致");
        } else {
            userMapper.updatePwd(curPwd, userId);
        }
    }

    /**
     * 更改用户个人信息
     *
     * @param username 用户名
     * @param sex      性别
     * @param city     所在城市
     * @param motto    个性签名
     * @param userId   用户ID
     */
    @Override
    @Transactional
    public void updateSelfInfo(String username, Integer sex, String city, String motto, Integer userId) {
        userMapper.updateSelfInfo(username, sex, city, motto, userId);
    }

    /**
     * 更改用户头像
     *
     * @param filename 头像文件名
     * @param userId   用户ID
     */
    @Override
    @Transactional
    public void updateAvatar(String filename, Integer userId) {
        userMapper.updateAvatar(filename, userId);
    }

    /**
     * 用户用银行卡充值飞吻
     *
     * @param cardId  银行卡号
     * @param cardPwd 银行卡密码
     * @param number  数额
     * @param userId  用户ID
     */
    @Override
    @Transactional
    public void charge(String cardId, String cardPwd, Integer number, Integer userId) {
        if (bankcardMapper.getById(userId).getCardPwd().equals(cardPwd)) {
            //密码正确,银行卡扣款
            bankcardMapper.deduction(cardId, number);
            //充值飞吻
            userMapper.charge(number, userId);
        } else {
            throw new QaException("密码错误");
        }

    }

    /**
     * 用飞吻充值会员
     *
     * @param number 扣除的飞吻数额
     * @param userId 用户ID
     */
    @Override
    @Transactional
    public void deduction(Integer number, Integer userId, Integer month) {
        if (userMapper.getById(userId).getMoney() >= number) {
            //充值会员扣除飞吻
            userMapper.deduction(number, userId);
            if (userMapper.getById(userId).getRoleId() == 1) {
                //当前用户不是会员,用户角色由普通用户变为VIP
                userMapper.updateRole(userId, 2);
                VIP vip = new VIP();
                vip.setUserId(userId);
                Date start = new Date();
                vip.setStartTime(start);
                vip.setEndTime(DateUtil.getEndTime(start, month));
                //VIP表中新增一条VIP数据
                vipMapper.add(vip);
            } else {
                //当前用户是会员,用户会员时间延长
                Date start = vipMapper.getById(userId).getStartTime();
                Date end = DateUtil.getEndTime(start, month)    ;
                vipMapper.updateTime(end, userId);
            }
        } else {
            throw new QaException("飞吻余额不足");
        }
    }

    /**
     * 删除用户(admin)
     *
     * @param userId 用户ID
     */
    @Override
    @Transactional
    public void del(Integer userId) {
        userMapper.del(userId);
    }

}
