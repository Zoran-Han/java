package com.demo.work;

import java.util.Date;

/**
 * @ClassName Person
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月08日  16:38:18
 * @Version 1.0.0
 */

public class Person {
    /**
     * 姓名
     */
    private String name;
    /**
     *性别
     */
    private String sex;
    /**
     *出生年月日
     */


    //@DateAnnotation("2019/03/13 18:25:18")
    @DateAnnotation(value = "2019年03月13日 18:25:18",pattern = "yyyy年MM月dd日 HH:mm:ss")
    private Date date;
    /**
     *身份证号
     */
    private String identityNum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIdentityNum() {
        return identityNum;
    }

    public void setIdentityNum(String identityNum) {
        this.identityNum = identityNum;
    }
}
