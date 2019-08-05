package com.demo.api;

import java.util.Calendar;
import java.util.Date;

/**
 * @ClassName TestCalender
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月02日  15:34:30
 * @Version 1.0.0
 */

public class TestCalender {


    public static  void main(String[] args){
        /*//创建日历对象
        Calendar cal = Calendar.getInstance();
        //获得当前的时间对象
        Date date = cal.getTime();
        System.out.println(date);
        //指定日期    mothod:  0-11
        cal.set(2018,0,31);
        date = cal.getTime();
        System.out.println(date);
        cal.set(2018,10,25);
        date = cal.getTime();
        System.out.println(date);
*/

        //创建日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR)+ "-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH));
        //翻动月份,true就是下一个月，false就是上一个月
        cal.roll(Calendar.MONTH,true);
        System.out.println(cal.get(Calendar.YEAR)+ "-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH));
        //向下翻动3个月,当翻滚到月份结束时，从当年的一月份开始继续翻动
        cal.roll(Calendar.MONTH,4);
        System.out.println(cal.get(Calendar.YEAR)+ "-"+(cal.get(Calendar.MONTH)+1)+"-"+cal.get(Calendar.DAY_OF_MONTH));
    }

}
