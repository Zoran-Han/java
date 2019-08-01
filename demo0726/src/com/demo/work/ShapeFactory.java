package com.demo.work;

/**
 * @ClassName ShapeFactory
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月28日  21:16:37
 * @Version 1.0.0
 */

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shape){
        Circle circle = new Circle();
        if(shape == null){
            return null;
        }
        if(shape.equals("圆")){
            return circle;
        } else if(shape.equals("长方形")){
            return new Rectangle();
        } else if(shape.equals("正方形")){
            return new Square();
        }
        return null;
    }
}
