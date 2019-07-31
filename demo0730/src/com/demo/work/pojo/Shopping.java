package com.demo.work.pojo;

import com.demo.work.pojo.Commodity;

/**
 * @ClassName Shopping
 * 购买商品类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月30日  20:19:00
 * @Version 1.0.0
 */

public class Shopping {

    public  Commodity[] commodity;//商品
    public String address;
    public String name;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Commodity[] getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity[] commodity) {
        this.commodity = commodity;
    }

    public Shopping(){

    }


    public Shopping(Commodity[] commodity, String address,String name) {
        this.commodity = commodity;
        this.address = address;
        this.name = name;
    }
}
