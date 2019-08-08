package com.demo.annotation;

import java.util.Date;

/**
 * @ClassName Employee
 * 职员类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月08日  15:23:32
 * @Version 1.0.0
 */

public class Employee {

    /**
     * 姓名
     */
    private String name;
    /**
     * 入职时间
     */
    //@DateAnnotation("2017-09-15 15:25:56")
    @DateAnnotation(value = "2017/09/15",pattern =  "yyyy/MM/dd")
    private Date inTime;

    public void setName(String name) {
        this.name = name;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getName() {
        return name;
    }

    public Date getInTime() {
        return inTime;
    }
}
