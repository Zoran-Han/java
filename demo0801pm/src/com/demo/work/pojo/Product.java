package com.demo.work.pojo;

/**
 * 产品类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月01日 09:41:01
 */
public class Product {

    private String number; //编号
    private String name; //名称
    private Double price; //单价
    private Integer total; //数量

    public Product() {
    }

    public Product(String number) {
        this.number = number;
    }

    public Product(String number, String name, Double price, Integer total) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.total = total;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null) {
            return false;
        }
        return number.equals(((Product)o).number);
    }
}
