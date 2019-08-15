<<<<<<< HEAD
package com.demo.io.pojo;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  10:58:36
 * @Version 1.0.0
 */

public class Student implements Serializable {

    private String name  = "张一山";
    private static String gender = "男";
    private transient Integer age = 20;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }
}
=======
package com.demo.io.pojo;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  10:58:36
 * @Version 1.0.0
 */

public class Student implements Serializable {

    private String name  = "张一山";
    private static String gender = "男";
    private transient Integer age = 20;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }
}
>>>>>>> e366ada85f330a71896bda1991d88c84cf56984e
