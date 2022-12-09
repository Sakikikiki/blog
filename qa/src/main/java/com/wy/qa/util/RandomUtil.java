package com.wy.qa.util;

public class RandomUtil {
    public static String generateQuestion() {
        StringBuilder sb = new StringBuilder();
        int num = (int) (Math.random() * 3 + 1);
        int calc = (int) (Math.random() * 9 + 1);
        int calcBy = (int) (Math.random() * 9 + 1);
        switch (num) {
            case 1:
                //随机生成加法
                sb.append(calc).append("+").append(calcBy).append("=?").append(calc + calcBy);
                break;
            case 2:
                //随机生成减法
                sb.append(calc).append("-").append(calcBy).append("=?").append(calc - calcBy);
                break;
            case 3:
                //随机生成乘法
                sb.append(calc).append("*").append(calcBy).append("=?").append(calc * calcBy);
                break;
        }
        return sb.toString();
    }
}
