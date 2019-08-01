package com.demo.work;

/**
 * @ClassName Member
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  20:11:49
 * @Version 1.0.0
 */

public class Member extends User {
    private String  gender;  //性别
    private String  phoneNumber; //电话号码
    private String  address;  //地址
    private double  balance; //余额

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //构造方法
    public Member(){

    }

    public Member(String name,String password,String email, String  gender,
                  String  phoneNumber, String  address,double  balance){
        super(name,password,email);
        this.address = address;
        this.balance = balance;
        this.gender = gender;
        this.phoneNumber = phoneNumber;

    }

    @Override
    public void printMsg(){

        System.out.println("用户名："+getName()+" 密码："+password+" 邮箱："+email +" 性别： "+gender
                + " 电话号码："+phoneNumber+" 地址："+address + " 余额："+balance);
//        super.printMsg();
//        System.out.println("\b\b  "+" 性别： "+gender + " 电话号码："+phoneNumber+" 地址："+address
//                + " 余额："+balance);
    }


}
