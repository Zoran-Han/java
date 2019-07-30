package com.demo.oop.impl;

import com.demo.oop.IShape;

import static java.lang.Math.*;


/**
 * @ClassName Triangle
 * 三角形类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月29日  17:20:05
 * @Version 1.0.0
 */

public class Triangle implements IShape {
    double a ;
    double b;
    double c;

    public  Triangle(){

    }

    public  Triangle(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("边为为："+a + "  "+ b+"  "+c);
        return a + b + c;
    }

    @Override
    public double calculateArea() {
        double area = 0;

        if ((a + b) < c || (a + c) < b || (b + c) < a) {
            System.out.println("构不成三角形！");
        } else {
            //海伦公式计算面积
            //double s = this.calculatePerimeter()/2;
            double s = (a + b + c) / 2;
            area = sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return area;

    }
}
