package com.demo.api;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TestDate
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月02日  14:11:39
 * @Version 1.0.0
 */

public class TestDate {
    public static void main(String[] args){
        /*//创建日期对象
        Date date1 = new Date();
        System.out.println(date1);
        Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);

        //创建时间戳类,可以精确到毫秒
        Timestamp timestamp = new Timestamp(date2.getTime());
        System.out.println(timestamp);
        Timestamp timestamp2 = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp2);

        //获得当前时间的毫秒数
        System.out.println(timestamp.getTime());*/

        //日期格式化
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        //日期格式化成字符串
        Date date = new Date();
        String strDate =  dateFormat.format(date);
        System.out.println(strDate);
        //修改时间格式
        ((SimpleDateFormat)dateFormat).applyPattern("yyyy年MM月dd日 HH:mm:ss");
        strDate = dateFormat.format(date);
        System.out.println(strDate);

        //将字符串格式化成日期
        try {
            Date date2 = dateFormat.parse("2019年08月02日 14:42:52");
            System.out.println(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
