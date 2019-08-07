package com.demo.reflection;

import com.demo.pojo.Student;

/**
 * @ClassName TestClassLoader
 * 类加载器
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月06日  17:44:12
 * @Version 1.0.0
 */

public class TestClassLoader {

    public static  void main(String[] args){
        ClassLoader classLoader = ClassLoader .getSystemClassLoader();
        //应用程序加载器(系统类加载器)
        System.out.println(classLoader);
        //扩展类加载器
        System.out.println(classLoader.getParent());
        //启动类加载器
        System.out.println(classLoader.getParent().getParent());
        //使用类加载器加载类
        try {
            Class studentClass = classLoader.loadClass("com.demo.pojo.Student");
            Student student = (Student)studentClass.newInstance();
            student.setName("恶霸");
            System.out.println(student.getName()+","+student.getGender()+","+student.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

