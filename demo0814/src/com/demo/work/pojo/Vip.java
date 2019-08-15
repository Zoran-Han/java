package com.demo.work.pojo;


import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName Vip
 * 会员类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  19:06:21
 * @Version 1.0.0
 */

public class Vip implements Serializable {

    private String id; //会员id号
    private String name; //会员姓名
    private int Date; //有效期，，单位月



    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public Vip(){

    }

    public String getId() {
        return id;
    }

    public Vip(String id, String name, int date) {
        this.id = id;
        this.name = name;
        Date = date;
    }
    @Override
    public String toString(){
        return "id: "+ this.id+" 姓名："+this.name+" 有效期："+this.Date+"个月";
    }




    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }



    public boolean equals(Object obj){
         if (obj==null){
             return false;
         }
         if (obj==this){
             return true;
         }
        if (obj instanceof Vip) {
            return   ((Vip) obj).id == id;
        }
        return false;
    }
}
