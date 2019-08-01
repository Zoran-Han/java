package com.demo.oop;

/**
 * @ClassName TestFinalVarible最终变量的赋值测试
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  14:21:34
 * @Version 1.0.0
 */

public class TestFinalVarible {

    //实例变量声明方式
   private   final int i =4;

   final int k;
    {
        k=8;
    }

    final int g;
    private TestFinalVarible(){
        g = 8;
    }

    //类变量
    private  static  final double o = 8;

     final static int f;
    static {
        f = 8;
    }
    /*private final int i = 0;

    final int j ;
    {
        j = 109;
    }

    final int k;
    private TestFinalVarible(){
        k = 23;
    }

    private  final int g = 9897;

    final static int y;
    static {
        y = 9;
    }
    public static void main(String[] args) {
    }
*/
}
