package com.demo.oop;

class A{

}
class B extends A{

}
class C extends B{

}
/**
 * @ClassName Overload
 * 重载
 * 参数引用类型、访问时参数上下转型
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月25日  14:02:48
 * @Version 1.0.0
 */

public class Overload extends ChangeArgs {

    public  void method(A a){
        System.out.println("访问到A类作为参数的方法");
    }

    public  void method(B b){
        System.out.println("访问到B类作为参数的方法");
    }
    public  void method(C c){
        System.out.println("访问到C类作为参数的方法");
    }



    public  static void main(String[] args){
        Overload o  = new Overload();
        B b = new B();
        o.method(b);
        A a = new C();
        o.method(a);  //以参数的类型来决定访问那个被重载的方法
        o.method((B)a);


    }

}
