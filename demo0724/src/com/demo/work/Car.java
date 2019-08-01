package com.demo.work;

/**
 * @ClassName Car
 * 作业1
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  19:44:51
 * @Version 1.0.0
 */

public class Car {
    private double width;//汽车的宽
    private double high;//汽车的高
    private double weight;//汽车的净重量

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //构造方法
    public Car(){

    }

   /*
    //this.属性名
   public Car(double width){
        this.width = width;
    }*/

    //this.方法名
    public Car(double width,double high){
        //this(width);
        this.width = width;
        this.high = high;

    }

    //this（）；
    public Car(double width,double high,double weight){

        this(width ,high);
        this.weight = weight;
    }

}
