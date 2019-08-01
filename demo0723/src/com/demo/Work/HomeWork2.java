package com.demo.Work;

/**
 * @ClassName HomeWork2
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  20:53:28
 * @Version 1.0.0
 */

public class HomeWork2 {
    //初始化实例
    private static final HomeWork2 hw = new HomeWork2();
    //私有的构造方法
    private  HomeWork2(){

    }
    //开放访问，使得外不能通过gethw（）方法获取实例hw
    public static  HomeWork2 gethw(){
        return hw;
    }

}
