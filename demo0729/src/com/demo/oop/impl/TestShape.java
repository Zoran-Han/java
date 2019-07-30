package com.demo.oop.impl;

import com.demo.oop.IShape;

/**
 * @ClassName TestShape
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月29日  16:18:22
 * @Version 1.0.0
 */

public class TestShape {


    public static void main(String[] args){
        Circle circle = new Circle(5);

        circle.printMsg();
        //circle.show();//编译不通过，静态方法只能在包含接口类时调用
        IShape.show();
        //IShape.printMsg();//无法从静态上下文引用非静态方法'printMsg（）'
        circle.show();//访问的是实现类的静态方法

        IShape iShape = new Circle(5);
        iShape.printMsg();
        // iShape.show();//只能通过接口名访问

        System.out.println("----------------圆-----------------");
        System.out.println("圆的周长：" + circle.calculatePerimeter());
        System.out.println("圆的面积：" + circle.calculateArea());


        System.out.println("----------------矩形-----------------");
        Square square = new Square(10,5);
        System.out.println("矩形的周长：" + square.calculatePerimeter());
        System.out.println("矩形的面积：" + square.calculateArea());

        System.out.println("----------------三角形-----------------");
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("三角形的周长："+triangle.calculatePerimeter());
        System.out.println("三角形的面积："+triangle.calculateArea());




    }

}
