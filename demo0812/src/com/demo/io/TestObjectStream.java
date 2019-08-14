package com.demo.io;

import com.demo.io.pojo.Student;

import java.io.*;

/**
 * @ClassName TestObjectStream
 * 测试对象流
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  16:59:16
 * @Version 1.0.0
 */

public class TestObjectStream {


    /**
     * 读取文件中的对象
     * @param path
     * @return
     * @throws Exception
     */
    public Object[] read(String path) throws Exception {
        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        //创建数组，用于存放读取到的对象
        Object[] objects = new Object[100];
        //定义变量读取到对象的个数
        int count = 0;
        //定义变量缓存每次读取到的对象
        Object object;
        //循环读取对象
        while ((object = ois.readObject()) != null) {
            objects[count] = object;
            count++;
        }

        //创建数组，去除对象数组中的空元素
        Object[] reobject = new Object[count];
        for (int i = 0; i < reobject.length; i++) {
            reobject[i] = objects[i];
        }
        ois.close();
        return reobject;
    }

    /**
     * 写入对象在文件中
     *
     * @param path
     * @param objects
     * @return
     * @throws Exception
     */
    public void write(String path, Object... objects) throws Exception {
        //创建对象流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        //循环写出对象
        for (Object o : objects) {
            oos.writeObject(o);
        }
        oos.writeObject(null);
        oos.close();

    }

    public static void main(String[] args) {

        try {
            TestObjectStream tos = new TestObjectStream();
           /* tos.write("src/com/demo/io/data.ser",
                    new Student("张三","男",22),
                    new Student("李四","男",32),
                    new Student("王小妹","女",24));*/
           Object[] students =   tos.read("src/com/demo/io/data.ser");
           for (Object o :students){
               Student stu = (Student)o;
               System.out.println(stu.getName()+" "+stu.getGender()+" "+stu.getAge());
           }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
