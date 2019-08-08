package com.demo.annotation;

import java.lang.reflect.Field;

/**
 * @ClassName Person
 * 人员类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月08日  11:23:36
 * @Version 1.0.0
 */
@PersonDefaultAnnotation(userName = "店小二",gender = "女",age = 22)

public class Person {

    /**
     *  //@PersonDefaultAnnotation(userName = "");//编译失败，不能作用于属性
     */

    public String userName;
    public String gender;
    public int age;

    public String getUserName() {
        return userName;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }


}
