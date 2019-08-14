package com.demo.io;

import com.demo.io.pojo.Class;
import com.demo.io.pojo.Student;
import sun.management.counter.ByteArrayCounter;

import java.io.*;

/**
 * @ClassName TestByteArrayStream
 * 字节数组输入输出流
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月13日  16:14:28
 * @Version 1.0.0
 */

public class TestByteArrayStream {
   /* public void read() throws Exception{
        ByteArrayInputStream
    }
    public void read() throws Exception{
        ByteArrayOutputStream baos = new ByteArrayOutputStream()
    }*/

    public static void main(String[] args) {

        try {
            //创建班级对象
            Class  classz = new Class("三年级十班");
            //创建学生类对象
            Student student = new Student("张一山","男",27,classz);
            System.out.println(student);
            System.out.println(student.getName()+" "+student.getGender()+
                    " "+student.getAge()+" "+student.getClassz().getName());
            System.out.println(student.getClassz());
            System.out.println("------------------------------");
            //创建字节数组输出流
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            //创建对象输出流
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            //克隆对象
            oos.writeObject(student);
            //创建对象输入流
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bao.toByteArray()));
            //读取出对象
            Student stu = (Student) ois.readObject();
            System.out.println(stu);
            System.out.println(stu.getName()+" "+stu.getGender()
                    +" "+stu.getAge()+" "+stu.getClassz().getName());
            System.out.println(stu.getClassz());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
