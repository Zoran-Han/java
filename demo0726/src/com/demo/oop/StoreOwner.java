package com.demo.oop;

/**
 * @ClassName StoreOwner
 * 店主类
 * 聚合
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月26日  09:50:54
 * @Version 1.0.0
 */

public class StoreOwner {

    private  String name;//姓名
    private  String mobileNumber;//联系电话
    private  Store store;//商店
    // private  Store store = new Store();// 一种方式

    //另一种方式
    public StoreOwner(){
        this.store = new Store();
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

    public Store getStore() {
        return store;
    }

  /*  public void setStore(Store store) {
        this.store = store;
    }*/
}
