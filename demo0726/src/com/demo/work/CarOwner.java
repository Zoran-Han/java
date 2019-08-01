package com.demo.work;

/**
 * @ClassName CarOwner
 * 车主类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月28日  19:44:00
 * @Version 1.0.0
 */

public class CarOwner {

    private  String name;//车主姓名
    private  String mobileNumber;//电话号码
    private Car car ;//车,在构造方法中给其赋值


    //不要无参构造函数
    public CarOwner(String name,String mobileNumber ){
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.car= new Car();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    //只要获取，不要赋值
    public Car getCar() {
        return car;
    }
}
