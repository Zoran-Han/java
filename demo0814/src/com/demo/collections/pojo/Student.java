<<<<<<< HEAD
package com.demo.collections.pojo;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  16:45:42
 * @Version 1.0.0
 */

public class Student implements Serializable ,Comparable<Student>{

    private String name;
    private String number;
    public Student(){

    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int compareTo(Student o) {
        return this.number.compareTo(o.number);
    }
}
=======
package com.demo.collections.pojo;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  16:45:42
 * @Version 1.0.0
 */

public class Student implements Serializable ,Comparable<Student>{

    private String name;
    private String number;
    public Student(){

    }

    public Student(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public int compareTo(Student o) {
        return this.number.compareTo(o.number);
    }
}
>>>>>>> e366ada85f330a71896bda1991d88c84cf56984e
