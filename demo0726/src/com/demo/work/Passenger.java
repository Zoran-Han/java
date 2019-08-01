package com.demo.work;

/**
 * @ClassName Passenger
 * 乘客类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月28日  19:43:04
 * @Version 1.0.0
 */

public class Passenger {

    private String name;//乘客姓名
    private String  gender;//乘客性别
    private  Car car;

    public Passenger(String name,String gender,Car car){
        this.name = name;
        this.gender = gender;
        this.car = car;

    }
    public Passenger(){

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
