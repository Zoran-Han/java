package com.demo.Work;

/**
 * @ClassName  在类的外部不可以使用“new 构造方法()”的形式创建对象，只能通过类提供的类方法来创建对象
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  09:26:02
 * @Version 1.0.0
 */

 //饱汉模式、懒汉模式
     public class Singleton {

    /*//创建私有静态的本类的实例
    private static   Singleton instance;

    //构造方法的默认修饰符就是类的默认修饰符
    private Singleton(){

    }
    public static  Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }*/

    //饿汉模式
    private static final  Singleton instance = new Singleton();

    //构造方法的默认修饰符就是类的默认修饰符
    private Singleton(){

    }
    public static  Singleton getInstance(){

        return instance;
    }
}
