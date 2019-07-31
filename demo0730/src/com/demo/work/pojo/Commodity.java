package com.demo.work.pojo;

/**
 * @ClassName Commodity
 * 商品类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月30日  20:19:55
 * @Version 1.0.0
 */

public class Commodity {


    public String name;//商品名称
    public double price;//商品价格
    public int count;//商品的数量
    public Shopping shopping;

    public Commodity() {

    }

    public Commodity(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;


    }


    public Shopping getShopping() {
        return shopping;
    }

    public void setShopping(Shopping shopping) {
        this.shopping = shopping;
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
