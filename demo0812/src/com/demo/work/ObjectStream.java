package com.demo.work;

import com.demo.work.pojo.Car;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName ObjectStream
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  19:12:40
 * @Version 1.0.0
 */

public class ObjectStream {

    public Object[] read(String path) throws Exception {
        //创建流对象
        ObjectInputStream os = new ObjectInputStream(new FileInputStream(path));
        //创建存放读到对象的数组
        Object[] objects = new Object[100];
        //定义变量，记录读取对象的个数
        int count = 0;
        //定义读取的对象
        Object object ;
        //循环读取对象
        while ((object=os.readObject()) != null) {

            objects[count] = object;
            count++;
        }
        //创建数组，去除对象数组中的空元素
        Object[] objects1 = new Object[count];
        for (int i = 0; i < count; i++) {
            objects1[i] = objects[i];
        }
        os.close();
        return objects1;


    }

    /**
     * 写入对象文件中
     *
     * @param path
     * @param objects
     * @throws Exception
     */
    public void write(String path, Object... objects) throws Exception {
        //创建对象
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path));
        for (Object o : objects) {
            out.writeObject(o);
        }
        out.writeObject(null);
        //关闭流
        out.close();

    }

    public static void main(String[] args) {

        try {
            ObjectStream os = new ObjectStream();
            /*os.write("src/com/demo/work/Car.txt",
                    new Car("凯迪拉克ATS", "2.0", "159888"),
                    new Car("马自达阿特兹", "1.5", "156666"),
                    new Car("奔驰c200L", "2.0", "356699"));*/
            Object[] objects = os.read("src/com/demo/work/Car.txt");
            for (Object o: objects) {
                Car car =(Car) o;
                System.out.println("品牌："+car.getBrand()+" 油耗："+car.getFuel()+" 价格："+car.getPrice());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
