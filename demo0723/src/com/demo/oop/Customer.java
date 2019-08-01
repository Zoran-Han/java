package com.demo.oop;

/**
 * @ClassName Customer
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  10:06:49
 * @Version 1.0.0
 */
//对作业Client 类的讲解
public class Customer {
    String name;
    String gender;//性别
    String  mobile;//联系方式

    //alt+insert选择"getter and setter"

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public  void print(){
        System.out.println(name+"[" + gender + "]" + ": " + mobile);
    }
    public static void main(String[] args) {
        Customer cust = new Customer();
        cust.setName("张三");
        cust.setGender("男");
        cust.setMobile("15685859696");
        cust.print();

    }
}
