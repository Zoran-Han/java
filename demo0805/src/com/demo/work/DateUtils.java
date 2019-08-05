package com.demo.work;

/*interface A {
    public default void method() {

    }
}

class B implements A {

}*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期处理工具类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月05日 09:46:11
 */
public class DateUtils {

    /*private String defaultDateFormat = "yyyy-MM-dd"; //默认时间格式
    private Calendar cal = Calendar.getInstance();
    private DateFormat dateFormat = new SimpleDateFormat(defaultDateFormat);*/
    private String defaultDateFormat; //默认时间格式
    private Calendar cal; //日历
    private SimpleDateFormat dateFormat; //时间格式化

    private DateUtils() {
        defaultDateFormat = "yyyy-MM-dd";
        cal = Calendar.getInstance();
        dateFormat = new SimpleDateFormat(defaultDateFormat);
    }

    public static DateUtils getInstance() {
        return new DateUtils();
    }

    public String getDefaultDateFormat() {
        return defaultDateFormat;
    }

    public void setDefaultDateFormat(String defaultDateFormat) {
        this.defaultDateFormat = defaultDateFormat;
    }

    /**
     * 获得当前日期
     * @return
     */
    public Date currentDate() {
        return new Date();
    }

    /**
     * 设置年月日返回日期对象
     * @param year
     * @param month
     * @param day
     * @return
     */
    public Date getDate(int year, int month, int day) {
        cal.set(year, month-1, day);
        return cal.getTime();
    }

    /**
     * 设置年月日时分秒返回日期对象
     * @param year
     * @param momth
     * @param day
     * @param hour
     * @param minute
     * @param second
     * @return
     */
    public Date getDate(int year, int momth, int day, int hour, int minute, int second) {
        cal.set(year, momth-1, day, hour, minute, second);
        return cal.getTime();
    }

    /**
     * 格式化日期字符串，返回日期对象
     * @param strDate
     * @return
     * @throws ParseException
     */
    public Date parse(String strDate) throws ParseException {
        return dateFormat.parse(strDate);
    }

    /**
     * 格式日化期字符串，返回日期对象
     * @param strDate
     * @param pattern
     * @return
     */
    public Date parse(String strDate, String pattern) throws ParseException {
        dateFormat.applyPattern(pattern);
        return dateFormat.parse(strDate);
    }

    /**
     * 格式化日期，返回日期字符串
     * @param date
     * @return
     */
    public String format(Date date) {
        return dateFormat.format(date);
    }

    /**
     * 格式化日期，返回日期字符串
     * @param date
     * @param pattern
     * @return
     */
    public String format(Date date, String pattern) {
        dateFormat.applyPattern(pattern);
        return dateFormat.format(date);
    }

    public static void main(String[] args) {
        /*A a = new B();
        a.method();*/
    }

}
