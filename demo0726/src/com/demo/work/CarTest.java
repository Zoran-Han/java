package com.demo.work;

/**
 * @ClassName CarTest
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月28日  19:54:44
 * @Version 1.0.0
 */

public class CarTest {

    public   double profitRate = 2;//一公里的利润

    public void printMsg(Car car){
        System.out.println("车牌号："+car.getCarNumber()+" 座位数：  "+car.getSeatCount()+" 汽车品牌："+car.getBrand());
        CarOwner carOwner = car.getCarOwner();
        System.out.println("司机姓名："+carOwner.getName()+" 司机电话:"+carOwner.getMobileNumber());
        Passenger[] passengers =car.getPassenger();
        for(Passenger pa : passengers){
            System.out.println("乘客性别： "+pa.getGender()+" 乘客姓名： "+pa.getName()+" ");
        }

    }

    public double getProfit (double distance,Car car){
        //获得乘客数量
        int passengerCount = car.getPassenger().length;
        if(passengerCount>car.getSeatCount()-1){
            System.out.println("乘客数大于座位数，已超载！");
            return  0;
        }
        //未满一公里按照以公里计算
            if (distance<1){
                distance = 1;
            }
        System.out.println("本次出行"+distance+"公里，总利润为：");
        return   passengerCount * 2 *distance;

    }

    public  static void main(String[] args){

        CarOwner carOwner = new CarOwner("张三","15623569847");
        Car car = carOwner.getCar();
        Passenger[] passenger = {
                new Passenger("小明","男",car),
                new Passenger("小张","男",car),
                new Passenger("小李","男",car)
        };
        car.setBrand("凯迪拉克ATS");
        car.setSeatCount(5);
        car.setCarNumber("78956");
        car.setCarOwner(carOwner);
        car.setPassenger(passenger);

        CarTest carTest = new CarTest();
        carTest.printMsg(car);
        System.out.println(carTest.getProfit(50,car));

    }


}
