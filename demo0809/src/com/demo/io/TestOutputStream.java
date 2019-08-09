package com.demo.io;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 输出流
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月09日 16:11:44
 */
public class TestOutputStream {

    public static void main(String[] args) {
        try {
            //创建文件对象
            File file = new File("src/com/demo/io/test.txt");
            //创建文件字节输出流
            //FileOutputStream fos = new FileOutputStream(file); //创建输出流时，会创建一个没有数据的文件（文件不存时）
            FileOutputStream fos = new FileOutputStream(file, true); //允许在文件中追加数据，而不是替换文件数据
            //写入数据到文件中
            fos.write("Hello World!\r\n你好世界!!!\r\n".getBytes());
            //关闭流
            fos.close();
            System.out.println("写入数据到文件完毕!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
