package com.demo.oop;

/**
 * @ClassName TestStudent
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  14:45:50
 * @Version 1.0.0
 */

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        /*stu.name = "丹尼";
        stu.age = "200";   //取值不收限制，会影响代码的安全性问题
        stu.gender = "男";
        System.out.println(stu.name+" "+stu.gender+" "+stu.age);*/
        stu.setName("王璐");
        stu.setGender("女");
        stu.setAge(130);
        System.out.println(stu.getName()+" "+stu.getGender()+" "+stu.getAge());
    }
}
