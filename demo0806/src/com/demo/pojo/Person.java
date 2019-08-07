package com.demo.pojo;

import java.beans.Introspector;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月06日  15:08:01
 * @Version 1.0.0
 */

public class Person {

    private String name;
    private Object[] values = new Object[10];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender){
        values[0] = gender;
    }
    public String getGender(){
        return  values[0].toString();
    }
    public void setAge(Integer age){
           values[1] = age;
    }
    public Integer getAge ( ){

        return Integer.parseInt(values[1].toString());
    }
}
