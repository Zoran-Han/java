package com.demo.work.pojo;

/**
 * 商店类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 09:28:26
 */
public class Store {

    private String name; //商店名称
    private String address; //地址
    private Goods[] goodses; //商品

    public Store() {

    }

    public Store(String name, String address, Goods[] goodses) {
        this.name = name;
        this.address = address;
        this.goodses = goodses;
    }

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

    public Goods[] getGoodses() {
        return goodses;
    }

    public void setGoodses(Goods[] goodses) {
        this.goodses = goodses;
    }
}
