package com.demo.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName TestString
 * String类的常用方法
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月01日  14:36:31
 * @Version 1.0.0
 */

public class TestString {


    public static void main(String[] args) {
        /*//构造方法创建字符串
        String str1 = new String();
        String str2 = new String("abc");
        String str3 = new String(new byte[]{65,66,67,68});//输出的是字符
        String str4 = new String(new char[]{'a','b','0','1'});//输出的是ascall码
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);//ABCD
        System.out.println(str4);*/

        /*
       //截取字符串
        String str = "abcdefghijk";
        String subStr1 = str.substring(2);
        String subStr2 = str.substring(1,8);//开始位置到结束位置减1
        //String subStr3 = str.substring(3,50);//运行出错，数组越界，结束下标超出范围（startIndex-length-1）
        System.out.println(subStr1);
        System.out.println(subStr2);
        //System.out.println(subStr3);
        //System.out.println(str.substring(5,4));//超出范围，（startIndex-length-1）
        */

       /* //字符串分割
        String str = "Tom,  LiLu,   Jack, Rose";
        String[] subStrings = str.split(",");
        for (String s :subStrings){
            //System.out.print(s+" \t");
            System.out.print(s.trim()+"\t");//trim():去除前后空格
        }
*/
/*
        String str = "Tom,   LiLY&    Jack,&   Rose";
        System.out.println();
        String[] subStrings = str.split("(,&*|,*&){1} *");//正则表达式
        for (String s :subStrings){
            System.out.print(s+" ");
        }*/

        /*//字符串检索,
        String str = "abcdncdfjpjfsdfjdsklnscd";
        int index1 = str.indexOf("cdf");//返回子串的第一个字符的下标
        int index2 = str.indexOf("cddef"); //未找到返回-1，表示未查找到字符串
        System.out.println(index1);
        System.out.println(index2);

        //指定搜索的开始位置
        int index3 = str.indexOf("abc");
        System.out.println(index3);
        int index4 = str.indexOf("abc",1);
        System.out.println(index4);
        //从尾部开始搜索
        int index5 = str.lastIndexOf("nc");
        System.out.println(index5);
        */

       /* //字符串大小写转换
        String str = "How are you!";
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);*/

      /* //字符串比较
        String str1 = "abc";
        String str2 = "ABC";
        //区分大小写
        System.out.println(str1.equals(str2));
        //不区分大小写
        System.out.println(str1.equalsIgnoreCase(str2));

        String url = "https://www.runoob.com/regexp/regexp-syntax.html";
        //判断是否是以某个字符串开头,一般用于比较路径的协议
        System.out.println(url.startsWith("https://"));
        //判断是否是以某个字符串结尾，一般用于比较路径的后缀
        System.out.println(url.endsWith(".html"));
*/
       /* //替换,也可以用空替换找到的字符串
        String str1 = "How are you! Nice to meet you! Nice to meet you too!";
        String str2 = str1.replace("you","YOU");//替换找到的所有子串
        String str3 = str1.replaceFirst("you","YOU");//替换找到的第一个
        String str4 = str1.replaceAll("t[a-zA-Z]","***");//替换找到的第一个
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);*/

       /*//根据字符串生成字符串或者字符数组
        String str1 = "Hollo World!";
        byte[] bArr = str1.getBytes();
        char[] cArr = str1.toCharArray();*/

       //正则表达式匹配字符串
        String mobileNUmber = "15652526363";
        //创建模式（正则表达式）对象
        Pattern pattern = Pattern.compile("^(\\d{2,3}-)?\\d{8}（\\d{3}）?$");
        //创建匹配其对象
        Matcher matcher = pattern.matcher(mobileNUmber);
        //匹配字符串返回结构
        boolean isNumber = matcher.matches();
//        System.out.println(isNumber);
        //判断验证码是否通过
         if (matcher.matches()){
             System.out.println("验证通过，电话号码为："+mobileNUmber);
         }else {
             System.out.println("验证未通过，注意格式：(\\d{2,3}-)?\\d{8}（\\d{3}）?" );
         }








    }
}
