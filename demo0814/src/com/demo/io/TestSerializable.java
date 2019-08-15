package com.demo.io;

import com.demo.io.pojo.Student;

import java.io.*;

/**
 * @ClassName TestSerializable
 * 临时变量与类变量是否可以被序列化
 *临时变量与类变量均不会被序例化
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  10:55:59
 * @Version 1.0.0
 */

public class TestSerializable {

    public static void main(String[] args) {

        try {
            Student stu1 = new Student();
            System.out.println(stu1.getName()+" "+stu1.getGender()+" "+stu1.getAge());
            //创建对象流

            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream("src/com/demo/io/date.ser"));
            out.writeObject(stu1);
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("src/com/demo/io/date.ser"));
            Student stu2 = (Student)ois.readObject();
            System.out.println(stu2.getName()+" "+stu2.getGender()+" "+stu2.getAge());
            out.close();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
