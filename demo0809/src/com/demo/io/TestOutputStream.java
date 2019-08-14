package com.demo.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * @ClassName TestOutputStream
 * 输出流
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月09日  16:11:16
 * @Version 1.0.0
 */

public class TestOutputStream {


    public static void main(String[] args) {
        try {
            //创建文件对象
            File file = new File("src/com/demo/io/test.txt");
            //创建文件字节输出流，
            //创建输出流的时候会自动创建一个空的文件（文件不存在）
            //FileOutputStream fos = new FileOutputStream(file);
            //true 表示允许在文件中追加数据，而不是替换数据
            FileOutputStream fos = new FileOutputStream(file,true);
            //使用输出流写入数据在文件中
            fos.write("Welcome to GanSu! 甘肃 牛皮！\r\n".getBytes());
            //关闭流
            fos.close();
            System.out.println("成功写入数据");
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

}
