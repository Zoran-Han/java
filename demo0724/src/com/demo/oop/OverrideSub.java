package com.demo.oop;

/**
 * @ClassName OverrideSub 重写子类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  10:48:14
 * @Version 1.0.0
 */

public class OverrideSub  extends OverrideParent{

    String i = "abc";
    @Override
    //重写父类中方法
    public  void  method(int x ){
        System.out.println("子类中方法");

    }
    //重载父类中的方法
    private int method(int x, int y){
        return 1;
    }

    public  void  method2(int x ){
        System.out.println("子类中自定义的方法");

    }

    //重写父类中的类方法
    public  static void function(int x){
        System.out.println("子类中的类方法");
    }
}
