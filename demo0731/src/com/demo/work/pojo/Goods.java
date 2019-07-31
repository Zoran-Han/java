package com.demo.work.pojo;

/**
 * 商品类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 09:22:49
 */
public class Goods {

    private String name; //商品名称
    private double price; //单价
    private int total; //数量

    public Goods() {

    }

    public Goods(String name, double price, int total) {
        this.name = name;
        this.price = price;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
