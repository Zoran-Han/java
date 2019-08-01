package com.demo.oop;

/**
 * @ClassName StoreAssis
 * 店员类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月26日  09:51:21
 * @Version 1.0.0
 */

public class StoreAssis {

    private  String name;//姓名
    private int age;//年龄
    private Store  store;//店名
    private String  mobileNumber;//联系电话
    private String bankAccount;//银行账号

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}
