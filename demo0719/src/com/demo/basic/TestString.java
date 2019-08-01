package com.demo.basic;

/**
 * 测试字符串
 * @author
 * @createTime 2019年07月19日 14:46:30
 * @version  1.0.0
 */
public class TestString {
    public static void main(String[] args){
        System.out.println("--------------字符串-----------------");
        String str1 = "abc";
        String str2 = new String("How are you?");
        char[] chrArr = {'H','e','l','l','o','!'};
        String str3 = new String(chrArr);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        //获取字符串长度
        int str1len = str1.length();
        System.out.println("字符串1的长度:"+str1len);
        //提取下标
        char chr =str2.charAt(5);
        System.out.println("字符串2的第四个字符："+chr);
        //将字符串转换为字符数组
        char[] chrArr2 = str2.toCharArray();
        System.out.println(chrArr2[2]);


    }

}
