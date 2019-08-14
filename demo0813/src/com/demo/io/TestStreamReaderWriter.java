package com.demo.io;


import java.io.*;

/**
 * @ClassName TestStreamReaderWriter
 * 字符字节转换输入输出流
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月13日  15:17:24
 * @Version 1.0.0
 */

public class TestStreamReaderWriter {

    /**
     * 读取数据
     * @throws Exception
     */
    public void read() throws Exception {
        //创建字符字节转换输入流
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src/com/demo/io/test.txt"));
        //创建存储数组
        char[] c = new char[1024];
        //定义记录读取到字符数的变量
        int len;
        while ((len = isr.read(c)) != -1) {
            System.out.println(new String(c, 0, len));
        }
        //关闭流
        isr.close();
    }

    /**
     * 写入数据
     * @throws Exception
     */
    public void write() throws Exception {

        //创建爱你字符字节转换输出流
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src/com/demo/io/test.txt"));
        osw.write("How are you! \r\n");
        osw.write("加油，你是最棒的！\r\n");
        osw.close();
    }

    public static void main(String[] args) {

        try {
            TestStreamReaderWriter tsr = new TestStreamReaderWriter();
            tsr.write();
            tsr.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}