package com.demo.oop;

/**
 * @ClassName GraphicsRectangle
 * 矩形类，继承图形类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月26日  11:03:53
 * @Version 1.0.0
 */

public class GraphicsRectangle extends Graphics {

    //可变参数参与重载，
    /*public  double Area(double length, double width){
        return length * width;
    }
    @Override
    public double Area(double... param) {
       // return Area(param[0] ,param[1]);
        return 0;
    }
    public static  void main(String[] args){
        GraphicsRectangle gr = new GraphicsRectangle();
        System.out.println( gr.Area(2,4));//访问的是固定参数的重载方法
        System.out.println(gr.Area(1));//访问的可变参数重载的方法
        System.out.println(gr.Area(new double[]{6,8} ));// f访问的是可变参数的方法

    }*/

    public  double Area(double length, double width){
        return length * width;
    }

    @Override
    public double Area(double... param) {
        System.out.println("可变参数方法");
         return Area(param[0] ,param[1]);

    }

    public static void main(String[] args) {
        //上转型后的赋值的对象，访问的是子类重写的方法，
        Graphics g = new GraphicsRectangle();
        System.out.println("矩形的面积为："+  g.Area(5,9));

        Graphics graphics =new Graphics() {
            @Override
            public double Area(double... param) {
                return 0;
            }
        };


    }
}
