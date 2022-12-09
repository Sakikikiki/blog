package com.wy.qa.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    /**
     * 获取截止时间
     *
     * @param start 开始时间
     * @param month +month
     * @return 截止时间
     */
    public static Date getEndTime(Date start, Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(start);
        calendar.add(Calendar.MONTH, month);
        return calendar.getTime();
    }
}
