package com.demo.oop;

/**
 * @InterfaceName IShape
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月29日  16:06:19
 * @Version 1.0.0
 */
public interface IShape {

    double PI = 3.14;

    /**
     * 计算周长
     * @return
     */
    public abstract double calculatePerimeter();

    /**
     * 计算面积
     * @return
     */
    public double calculateArea();

    //默认方法
    public default  void printMsg(){
        System.out.println("接口中的默认方法！");
    }
    public static  void show(){
        System.out.println("接口中的静态方法！");
    }
}
