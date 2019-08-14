package com.demo.work;

import com.demo.io.pojo.Class;
import com.demo.io.pojo.Student;

import java.io.*;

/**
 * @ClassName ObjectClone
 * 定义类，定义公共方法实现对任意对象的深度克隆
 * 使用泛型方法（可选）
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月13日  17:26:36
 * @Version 1.0.0
 */

public class ObjectClone {

    public <T> T clone(T t) throws Exception {
        //创建字节输出流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        //创建对象字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        //克隆对象
        oos.writeObject(t);
        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        //读取对象
        T t1 = (T)ois.readObject();
        //返回对象
        return t1;
    }

    public static void main(String[] args) {


        try {
            ObjectClone oc = new ObjectClone();
            //创建班级对象
            Class classz = new Class("三年级十班");
            //创建学生类对象
            Student stu = new Student("张一山","男",27,classz);
            System.out.println(stu);
            System.out.println(stu.getName()+" "+stu.getGender()+
                    " "+stu.getAge()+" "+stu.getClassz().getName());
            System.out.println(stu.getClassz());


            Student stu1 = oc.clone(stu);
            System.out.println(stu1);
            System.out.println(stu1.getName()+" "+stu1.getGender() + " "
                            +stu1.getAge()+" "+stu1.getClassz().getName());
            System.out.println(stu1.getClassz());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
