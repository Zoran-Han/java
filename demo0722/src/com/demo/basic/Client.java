package com.demo.basic;

/**
 * @ClassName Client
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月22日  19:37:53
 * @Version 1.0.0
 */

public class Client {
    //定义属性
    static String name;
    static String sex;
    String phoneNum;

    public static void setName(String name) {
        Client.name = name;

    }

    public static void setSex(String sex) {
        Client.sex = sex;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public static String getName() {
        return name;
    }

    public static String getSex() {
        return sex;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.setName("张三");
        c.setSex("男");
        c.setPhoneNum("15225252266");
        System.out.println(name+"[" + sex + "]" + ": " + c.phoneNum);

    }
}
