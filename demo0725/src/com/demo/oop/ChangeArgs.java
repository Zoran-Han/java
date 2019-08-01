package com.demo.oop;

/**
 * @ClassName ChangeArgs
 * 可变参数
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月25日  13:47:00
 * @Version 1.0.0
 */

public class ChangeArgs {

    //public  void method(int...x,int y) //编译不通过，可变参数必须是参数列表中的最后一个参数
    public  void method(int...x){

        //方法中将可变参数视为数组使用，
       for(int i=0;i<x.length;i++){
           System.out.print(x[i]+" ");
       }
        System.out.println("\n--------------");

    }
    //编译不通过，因为可变参数本质就是一个数组，区分重载时可变参数被视为数组，所以并为发生重载
  /*  public  void method(int[] x){

    }*/
    public  static void main(String[] args){
        ChangeArgs c = new ChangeArgs();
        c.method();
        c.method(1);
        c.method(1,5,6);

    }

}
