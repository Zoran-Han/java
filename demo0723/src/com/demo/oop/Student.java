package com.demo.oop;

/**
 * @ClassName Student
 * 应用封装性
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  14:42:29
 * @Version 1.0.0
 */

public class Student {
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        if (!"男".equals(gender) && !"女".equals(gender)){
            System.out.println("请输入正确的性别信息！取值：男|女");
            return ;
        }
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ( age < 0 || age >120){
            System.out.println("请输入正确的年龄信息！取值：0-120");
            return ;
        }
        this.age = age;
    }

}
