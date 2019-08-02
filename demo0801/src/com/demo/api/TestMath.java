package com.demo.api;

/**
 * @ClassName TestMath
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月01日  16:57:55
 * @Version 1.0.0
 */

public class TestMath {

    public static void main(String[] args){

        //cell（），大于等于参数的最小整数值，向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.1));
        //floor() 小于等于参数的最大整数，向下取整
        System.out.println(Math.floor(3.9));
        System.out.println(Math.floor(3.1));
        //四舍五入,返回整数
        System.out.println(Math.round(3.45885));
        System.out.println(Math.round(3.55885));
        //求随机数0-1之间
        System.out.println(Math.random());
        //获取1-100的随机数
        System.out.println((int)Math.random()*100+1);


    }

}
