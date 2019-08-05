package com.demo.work;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName DateUtil
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月04日  14:35:59
 * @Version 1.0.0
 */

public class DateUtil {
    //创建私有静态的本类的实例
    private static  DateUtil dateUtil;
    Date date = new Date();
    DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");


    public static  DateUtil getDateUtil(){
        if (dateUtil==null){
            dateUtil = new DateUtil();
        }
        return dateUtil;
    }

    /**
     *获取当前时间
     */
    public void setDate( ){

        Date date = new Date();
        System.out.println(date);

    }
    //设置日期默认格式
    public void setDefaultDate(){

        //将日期格式转换为字符串型
        String strDate =  dateFormat.format(date);
        System.out.println(strDate);
    }

    //设置指定日期时间，返回日期对象；
    public  Date method1(int year,int month, int day, int hour, int minute,int second){
        Calendar cal = Calendar.getInstance();
        cal.set(1997,9,25);
        date = cal.getTime();
        System.out.println(date);
        return date;


    }
    //根据日期字符串与格式，返回日期对象
    public  Date method2(){
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = new Date();
        String strDate =  df.format(date);
        System.out.println(strDate);
        return  date;


    }
    //按照指定的格式与日期对象，返回格式化的日期字符串。
    public Date method3(){
        Date date = new Date();
        try {
            date = dateFormat.parse("2019年08月04日");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        return date;
    }

}
