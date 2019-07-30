package com.demo.oop.impl;

import com.demo.oop.IShape;

/**
 * @ClassName Square
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月29日  16:27:21
 * @Version 1.0.0
 */

public class Square implements IShape {

    double a;
    double b;
    public Square(){

    }
    public Square(double a,double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculatePerimeter() {
        System.out.println("边为为："+a + "  "+ b);
        return 2 * ( a +b );
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
