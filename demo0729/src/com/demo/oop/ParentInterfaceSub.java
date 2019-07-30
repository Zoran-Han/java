package com.demo.oop;

/**
 * @ClassName 接口
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月29日  15:31:42
 * @Version 1.0.0
 */
public interface ParentInterfaceSub extends ParentInterface1,ParentInterface2 {

     //static  final int I =10;//默认是公共的、 静态的、最终的常量
     int I =10;

    // public  abstract void abstractMethod(); //默认是abstract和public的
     void abstractMethod();

    //默认方法可以重写父接口中的方法
    @Override
    public default void method(){

    }

    public  default  void function(){

    }

    public static void staticMethod(){

    }

}
