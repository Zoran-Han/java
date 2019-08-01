package com.demo.oop;

/**
 * @ClassName Store
 * 商店类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月26日  09:50:42
 * @Version 1.0.0
 */

public class Store {

    private  String name;//店名
    private  String address;//地址
    private  StoreOwner storeOwner;//店主
    private StoreAssis[] storeAsses;//店员

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StoreOwner getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(StoreOwner storeOwner) {
        this.storeOwner = storeOwner;
    }

    public StoreAssis[] getStoreAsses() {
        return storeAsses;
    }

    public void setStoreAsses(StoreAssis[] storeAsses) {
        this.storeAsses = storeAsses;
    }

}
