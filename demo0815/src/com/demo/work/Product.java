package com.demo.work;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * @ClassName Product
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月15日  18:24:25
 * @Version 1.0.0
 */

public class Product {

    private String goodsName;
    private String goodsNum;
    private int goodsTotal;


    public Product(){

    }
    public Product(String goodsName, String goodsNum, int  goodsTotal) {
        this.goodsName = goodsName;
        this.goodsNum = goodsNum;
        this.goodsTotal = goodsTotal;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(String goodsNum) {
        this.goodsNum = goodsNum;
    }

    public int  getGoodsTotal() {
        return goodsTotal;
    }

    public void setGoodsTotal(int  goodsTotal) {
        this.goodsTotal = goodsTotal;
    }


    @Override
    public int hashCode() {
        //字符串的hashCode是被重写了的，比较的是值
        return this.getGoodsNum().hashCode();
        //return Objects.hashCode(id);
    }


    @Override
    public boolean equals(Object obj){

        return this.hashCode()==obj.hashCode();
    }


   /* //产品集合
    private HashMap<String, Object> product = new HashMap<>();

    public void put(Product product){
         product.put(product);
    }
    public void remove() {

    }

    @Override
    public String toString() {
        return getGoodsName() + " " + getGoodsNum() + " " + getGoodsTotal();
    }*/
}
