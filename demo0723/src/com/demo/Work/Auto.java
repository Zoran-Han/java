package com.demo.Work;

/**
 * @ClassName Auto 汽车类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  20:13:40
 * @Version 1.0.0
 */

public class Auto {
    protected   double width  ;
    protected   double high  ;
    protected   double weight ;
    public double getWidth() {
        return width;
    }

    public double getHigh() {
        return high;
    }

    public double getWeight() {
        return weight;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Auto( double high, double width, double weight) {
        this.high = high;
        this.weight = weight;
        this.width = width;
    }
}
