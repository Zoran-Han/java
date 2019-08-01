package com.demo.work;

/**
 * @ClassName FactoryPatternTest
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月28日  21:19:07
 * @Version 1.0.0
 */

public class FactoryPatternTest {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        //获取 Circle 的对象
        Shape shape = shapeFactory.getShape("圆");
        shape.draw();

        //获取 Rectangle 的对象
        Shape shape2 = shapeFactory.getShape("长方形");
        shape2.draw();

        //获取 Square 的对象
        Shape shape3 = shapeFactory.getShape("正方形");
        shape3.draw();
    }
}
