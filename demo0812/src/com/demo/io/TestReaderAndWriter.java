package com.demo.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.sql.Timestamp;


/**
 * @ClassName TestReaderAndWriter
 * 测试字符流
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  15:50:02
 * @Version 1.0.0
 */

public class TestReaderAndWriter {

    /**
     * 读取数据
     *
     * @param path
     * @throws Exception
     */
    public void read(String path) throws Exception {
       /* //创建一个文件字符输入流
        FileReader fr = new FileReader(path);
        //定义一个缓存数据的字符数组
        char[] c = new char[1024 * 1024];
        //定义记录读取到字符数的变量
        int len;
        while ((len = fr.read(c)) != -1) {
            System.out.println(new String(c, 0, len));

        }
        //关闭流
        fr.close();*/
       FileReader ff = new FileReader(path);
       char[] cc = new char[1024];
       int len;
       while ((len = ff.read(cc))!=-1){
           System.out.println(new String(cc,0,len));
       }
    }

    /**
     * 写入数据
     *
     * @param path
     * @param content
     * @throws Exception
     */
    public void write(String path, String content) throws Exception {
        //创建文件字符输出流
        FileWriter fw = new FileWriter(path, true);
        //输出字符串数据
        fw.write("#" + new Timestamp(System.currentTimeMillis()) + "\r\n");
        fw.append(content);
        fw.append("\r\n");
        //关闭流
        fw.close();
    }

    public static void main(String[] args) {

            try {
                TestReaderAndWriter traw = new TestReaderAndWriter();
                //traw.write("src/com/demo/io/test.txt","你好！中软国际");
                traw.read("src/com/demo/io/test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
