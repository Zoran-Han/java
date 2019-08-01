package com.demo.oop;

/**
 * @ClassName 语句块
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  11:17:58
 * @Version 1.0.0
 */

public class Statement {
    int i = 10;
    public Statement(){
        System.out.println("构造方法！");
    }
    //语句块就是使用大括号括起来的一段代码，也可为空
    {
        System.out.println("语句块");
        i = 5;
    }
    //静态语句块,静态块
    //静态块在加载类的时候执行，JVM只会加载一次类，加载后放在内存中，
    // 所以静态块是先于语句块执行，且只执行一次
    static {
        System.out.println("静态语句块，简称为静态块");
        // i = 5;  //非法的表示，不能访问实例变量

    }

    public static void main(String[] args) {
//        if(true){
//            System.out.println("语句块1");
//
//        }
//        {}//空语句块，
//        {System.out.println("语句块2");}
//
        Statement s1 = new Statement();//创建一个对象，语句块执行一次
        Statement s2 = new Statement();
    }
}
