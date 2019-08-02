package com.demo.work;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName TestSensitive
 * 屏蔽敏感词
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月01日  19:04:33
 * @Version 1.0.0
 */

public class TestSensitive {
    //int index1 = str.indexOf("cdf");//返回子串的第一个字符的下标
    public static void main(String[] args) {
        String str1 = "一个男的对女的说：今晚跟我去看电影，那女的直接来一句，我丢！你也不看你那批样子";
        String str2 = "[丢批]";
        System.out.println("屏蔽前："+str1);
        //创建正则表达式对象
        Pattern p = Pattern.compile(str2);
        Matcher m = p.matcher(str1);
        //将敏感词用*替换，并去除空格
        str1 = m.replaceAll("*").trim();

        System.out.println("屏蔽后："+str1);

        }
    }

