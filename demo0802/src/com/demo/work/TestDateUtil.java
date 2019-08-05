package com.demo.work;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TestDateUtil
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月04日  15:15:19
 * @Version 1.0.0
 */

public class TestDateUtil {
    public static void main(String[] args){

        //创建类对象
        DateUtil dateUtil = DateUtil.getDateUtil();
        dateUtil.setDate();
        dateUtil.setDefaultDate();
        //指定日期
        dateUtil.method1(2018,2,5,15,36,59);
        dateUtil.method2();
        dateUtil.method3();

    }


}
