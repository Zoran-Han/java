package com.demo.apis;

/**
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月01日 16:57:48
 */
public class TestMath {

    public static void main(String[] args) {
        //ceil() 大于等于参数的最小整数值, 向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        //floor() 小于等于参数的最大整数值，向下取整
        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(3.1));
        //四舍五入, 返回整数
        System.out.println(Math.round(3.4999999));
        System.out.println(Math.round(3.5));
        //求随机数, 返回值为 double值为正号，大于等于 0.0 ，小于 1.0 。
        System.out.println(Math.random());
        //获得1...100的随机数
        System.out.println((int)(Math.random()*100+1));
    }

}
