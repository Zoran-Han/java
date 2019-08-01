package com.demo.work;

/**
 * @ClassName Car
 * 汽车类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月28日  19:42:37
 * @Version 1.0.0
 */



public class Car {


    private String carNumber;//车牌号
    private  String brand;
    private  CarOwner carOwner;//车主
    private  int seatCount; //座位数
    private  Passenger[] passenger;//乘客



    public  Car(){

    }

    public Car(String carNumber, String brand, int seatCount) {
        this.carNumber = carNumber;
        this.brand = brand;
        this.seatCount = seatCount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String sex) {
        this.brand = brand;
    }

    public CarOwner getCarOwner() {
        return carOwner;
    }



    public void setCarOwner(CarOwner carOwner) {
        this.carOwner = carOwner;
    }

    public Passenger[] getPassenger() {
        return passenger;
    }


    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public void setPassenger(Passenger[] passenger) {
        this.passenger = passenger;
    }

   /* public void printMsg(){
        Car car = new Car();
        System.out.println("车主姓名："+carOwner.getName()+" 车牌号："+carNumber+" 车主电话："+
                carOwner.getMobileNumber());
        //" 乘客姓名："+passenger.getName()+" 乘客性别："+passenger.getGender()
    }*/

}
