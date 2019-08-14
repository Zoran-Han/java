package com.demo.work.pojo;

import java.io.Serializable;

/**
 * @ClassName Car
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  19:13:20
 * @Version 1.0.0
 */

public class Car implements Serializable {
    private String brand;//品牌
    private String fuel;//油耗
    private String price;//价格

    public Car(){

    }

    public Car(String brand, String fuel, String price) {
        this.brand = brand;
        this.fuel = fuel;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
