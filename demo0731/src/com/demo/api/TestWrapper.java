package com.demo.api;

/**
 * 测试封装类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 16:53:54
 */
public class TestWrapper {

    public static void main(String[] args) {
        /*int i = 100;
        Integer integer = new Integer(i); //装箱
        int j = integer.intValue(); //拆箱*/

        /*int i = 100;
        Integer integer = i; //自动装箱
        int j = integer; //自动拆箱*/

        String str = "180";
        int i = Integer.parseInt(str);
        System.out.println("i="+(i+100));

        String str2 = String.valueOf(i);
    }

}
