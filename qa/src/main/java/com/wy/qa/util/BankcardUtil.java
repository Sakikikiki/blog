package com.wy.qa.util;

import com.wy.qa.pojo.Bankcard;
import com.wy.qa.pojo.User;

import java.util.Random;

public class BankcardUtil {
    public static Bankcard generate(Integer userId) {
        StringBuilder sb = new StringBuilder("62");
        Bankcard bankcard = new Bankcard();
        int number;
        Random random = new Random();
        for (int i = 0; i < 17; i++) {
            number = random.nextInt(10) + 48;
            sb.append((char) number);
        }
        bankcard.setCardId(sb.toString());
        bankcard.setCardPwd("123456");
        bankcard.setUserId(userId);
        return bankcard;
    }


}
