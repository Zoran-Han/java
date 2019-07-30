package com.demo.oop.impl;

import com.demo.oop.IShape;
import com.demo.oop.ParentInterface2;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月29日  16:13:13
 * @Version 1.0.0
 */

/*
public class Circle implements IShape ,ParentInterface2 {//实现类可以实现多个接口


    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public void method() {

    }
}*/
public class Circle implements IShape {

    // IShape iShape = new Circle();//接口引用可以指向实现该接口的对象

    private  double r;
    public Circle(){

    }
    public Circle(double r){
        this.r = r;
    }
    @Override
    public double calculatePerimeter() {
         // PI = 3.1415;//不允许修改值
        System.out.println("半径为："+r);
        return 2 * PI * r;
    }

    @Override
    public double calculateArea() {
        // Circle.show();//访问接口中的静态方法
        return PI * r * r ;
    }


    @Override
    public  void printMsg(){
        System.out.println("实现类中重写默认方法！");
    }

    //@Override  不算重写 ，只是实现类的自定义，访问的时候覆盖父接口中的方法
    public static  void show(){
        System.out.println("实现类中的静态方法！");
    }

    public void method(){

        //无法使用super访问接口中的成员
        //super.printMsg();编译出错
        //super.show();编译出错
        //double PI = super.PI;编译出错


        this.printMsg();//访问默认方法
        double PI = this.PI;//访问静态变量
        //this.show();  //访问静态方法，在没有继承的情况下编译报错
    }

}

