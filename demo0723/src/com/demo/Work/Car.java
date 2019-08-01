package com.demo.Work;

/**
 * @ClassName Car 小轿车类，继承汽车类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  19:36:16
 * @Version 1.0.0
 */

public class Car extends Auto{
    private String brand;//品牌
    private double fuel; //油耗
    private int fassenger; //座位数


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setFassenger(int fassenger) {
        this.fassenger = fassenger;
    }

    public String getBrand() {
        return brand;
    }

    public double getFuel() {
        return fuel;
    }

    public int getFassenger() {
        return fassenger;
    }

    public Car(String brand, double fuel, int fassenger,double high,double width, double weight){
        super(high, width, weight);
        this.brand = brand;
        this.fuel = fuel;
        this.fassenger = fassenger;


    }

    /**
     * 根据路程估算油耗
     * @param distance
     * @return
     */
    public double FuelCount(double distance){
       fuel = fuel * distance;
        return fuel;

    }
    public void printMsg(){
        System.out.println("品牌： "+brand +" 座位数："+ fassenger +" 油耗: " +FuelCount(5) +" 高度:" +getHigh() + "米"+" 宽度："+ getWidth() + "米"+ " 净重量:"+getWeight()+"吨");
    }

    public static void main(String[] args) {
        Car c = new Car("梅赛德斯",0.25,5,1.8,2,1.7);
        c.printMsg();


    }
}
