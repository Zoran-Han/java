package com.demo.api;

/**
 * 测试字符串比较
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 15:07:52
 */
public class TestStringEquals {

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        String str4 = new String("abc");
        String str5 = "efg";
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println("---------------------------------");
        System.out.println(str1==str3);
        System.out.println(str3==str4);
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println("---------------------------------");
        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));
    }

}
