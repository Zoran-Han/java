package com.demo.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @ClassName TestDataStream
 * 数据字节输入输出流
 * 读取或写入基本数据类型的数据
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月13日  14:38:38
 * @Version 1.0.0
 */

public class TestDataStream {

    /**
     * 写入数据
     */
    public void read() throws Exception {
        //创建数据输入流
        DataInputStream dis = new DataInputStream
                (new FileInputStream("src/com/demo/io/basic.txt"));
        //读取基本数据类型的数据
        int i = dis.readInt();
        double d = dis.readDouble();
        boolean b = dis.readBoolean();
        char c = dis.readChar();
        System.out.println("i= " + i);
        System.out.println("d= " + d);
        System.out.println("b= " + b);
        System.out.println("c= "+c);
        //关闭流
        dis.close();
    }

    /**
     * 读取数据
     */
    public void write() throws Exception {
        //创建数据输出流
        DataOutputStream dos = new DataOutputStream
                (new FileOutputStream("src/com/demo/io/basic.txt"));
        //写入基本数据类型数据到文件中
        dos.writeInt(9);
        dos.writeDouble(9.25);
        dos.writeBoolean(true);
        dos.writeChar(65);
        //关闭流
        dos.close();
    }

    public static void main(String[] args) {

        try {
            TestDataStream tds = new TestDataStream();
            tds.write();
            tds.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
