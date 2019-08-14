package com.demo.io;

import java.io.*;
import java.sql.Timestamp;

/**
 * @ClassName TestBufferedStream
 * 缓冲字节输入输出流
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月13日  14:15:21
 * @Version 1.0.0
 */

public class TestBufferedStream {

    /**
     * 读取数据
     */
    public void read() throws  Exception {
        //创建缓冲输入流,默认缓冲区大小是: 8*1024=9192KB
        BufferedInputStream bis = new BufferedInputStream
                (new FileInputStream("src/com/demo/io/test.txt"));
        //定义数组，存放读取到的数据
        byte[] bytes = new byte[1024*1024];
        //定义记录读取字节数的变量
        int len;
        //循环读取并输出文件中的数据
        while((len=bis.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        //关闭流
        bis.close();
    }

    /**
     * 写入数据
     */
    public void write() throws Exception {
        //创建缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream
                (new FileOutputStream("src/com/demo/io/test.txt"));
        //输出数据
        bos.write("Hello Wrold!\r\n".getBytes());
        bos.write("你好，世界！\r\n".getBytes());

        // 关闭流
        bos.close();

    }

    public static void main(String[] args) {

        try {
            TestBufferedStream tbs = new TestBufferedStream();
            tbs.write();
            tbs.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
