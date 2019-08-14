package com.demo.work.pojo;

import java.io.Serializable;

/**
 * @ClassName Class
 * 班级类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月13日  16:30:18
 * @Version 1.0.0
 */

public class Class  implements Serializable {

    private  String name;
    public Class(){

    }

    public Class(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
