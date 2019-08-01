package com.demo.apis;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 测试String类的常用方法
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月01日 14:36:50
 */
public class TestString {

    public static void main(String[] args) {
       /* //构造方法创建字符串
        String str1 = new String();
        String str2 = new String("abc");
        String str3 = new String(new byte[]{65, 66, 67});
        String str4 = new String(new char[]{'A', '0', '1'});
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3); //ABC
        System.out.println(str4);*/
       //常用方法
        //截取字符串
       /* String str = "abcefghijk";
        String subStr = str.substring(2);
        String subStr2 = str.substring(1, 8); //开始位置...结束位置减1
        //String subStr3 = str.substring(3, 50); //运行时出错：endIndex超出范围 (startIndex...length-1)
        System.out.println(subStr);
        System.out.println(subStr2);
        //System.out.println(subStr3);
        System.out.println(str.substring(5, 4)); //运行时出错：endIndex超出范围（startIndex...length-1）*/
        //字符串分割
        /*String str = "Tom,    Lily,    Jack, Rose";
        String[] subStrings = str.split(",");
        for(String s: subStrings) {
            //System.out.print(s+" ");
            System.out.print(s.trim()+" "); //trim(); 去除前后空格
        }*/
        /*String str = "Tom,   Lily&        Jack,&Rose";
        //String[] subStrings = str.split(",*&* +"); // 正则表达式
        String[] subStrings = str.split("(,&*|,*&){1} *");
        System.out.println(subStrings.length);
        for(String s: subStrings) {
            System.out.print(s+" ");
        }*/
        //字符串检索
        //String str = "abcdefgabchijkderst";
        /*//返回子串第一个字符下标
        int index = str.indexOf("efg");
        System.out.println(index);
        index = str.indexOf("hello");
        System.out.println(index); //-1，表示未查找到字符串*/
        //指定搜索的开始位置
        /*int index = str.indexOf("abc");
        System.out.println(index);
        index = str.indexOf("abc", 1);
        System.out.println(index);*/
        //从尾部开始搜索
        /*int index = str.lastIndexOf("abc");
        System.out.println(index);*/
        //大小写转换
        /*String str = "How are you!";
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);*/
        //字符串比较
       /* String str1 = "abc";
        String str2 = "ABC";
        //区分大小写
        System.out.println(str1.equals(str2));
        //不区分大小写
        System.out.println(str1.equalsIgnoreCase(str2));

        String url = "http://www.regexlab.com/zh/regref.htm";
        //判断是否以某个字符串开头, 一般用于比较路径协议
        System.out.println(url.startsWith("http://"));
        //判断是否以某个字符串结尾，一般用于比较路径的后缀
        System.out.println(url.endsWith(".htm"));*/
        //字符串替换
        /*String str = "How are you! nice to meet you! nice to meet you too!";
        String str2 = str.replace("you", "YOU"); //替换所有匹配到的子串
        String str3 = str.replaceFirst("you", ""); //替换匹配到的第一个子串
        String str4 = str.replaceAll("t[A-Za-z]+", "***");
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);*/
        //根据字符串生成字节或字符数组
        /*String str = "Hello World";
        byte[] bArr = str.getBytes();
        char[] cArr = str.toCharArray();*/

        //正则表达式匹配字符串
        String mobileNumber = "023-130564282";
        //创建模式（正则表达式）对象
        Pattern pattern = Pattern.compile("^(\\d{2,3}-)?\\d{8}(\\d{3})?$");
        //创建匹配器对象
        Matcher matcher = pattern.matcher(mobileNumber);
        //匹配字符串返回结果
        //boolean isNumber = matcher.matches();
        //判断电话号码验证是否通过
        if(matcher.matches()) {
            System.out.println("验证通过，电话号码: "+mobileNumber);
        } else {
            System.out.println("验证未通过，注意格式: (\\d{2,3}-)?\\d{8}(\\d{3})?");
        }
    }

}
