package com.demo.work;

import java.sql.SQLOutput;

/**
 * 处理数学问题的工具类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月02日 09:43:43
 */
public class MathUtil {

    /**
     * 格式化数字
     * @param value
     * @param precision   精确小数位数 >= 0
     * @return
     */
    public static String format(double value,int precision) throws RuntimeException {
        if(precision<0) {
            throw  new RuntimeException("错误: 不支持整数位，精度>=0！");
        }
        if(precision==0) {
            return String.valueOf(Math.round(value));
        }
        //小数位数大于0时
        double temp = Math.pow(10, precision);
        String result = String.valueOf(Math.round(value*temp)/temp);
        //判断小数位数是否足够
        int scount = result.substring(result.lastIndexOf(".")+1).length();
        for(int i=0; i<precision-scount; i++) {
            result += 0;
        }
        return result;
    }

    public static void main(String[] args) {
        double d = 3.1567;
        System.out.println((double)Math.round(d*100)/100);
        System.out.println(MathUtil.format(d, 3));
        System.out.println(MathUtil.format(d, 0));
        System.out.println(MathUtil.format(3.9999, 3));
        System.out.println(MathUtil.format(3.55, 5));
    }

}
