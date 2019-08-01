package com.demo.work.pojo;

/**
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月01日 09:50:17
 */
public class WareHouse {

    private String name;
    private String address;
    private Product[] products = new Product[20];

    public WareHouse() {
    }

    public WareHouse(String name, String address) {
        this.name = name;
        this.address = address;
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

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}
