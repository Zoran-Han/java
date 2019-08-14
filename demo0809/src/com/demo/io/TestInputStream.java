package com.demo.io;

import java.io.File;
import java.io.FileInputStream;


/**
 * @ClassName TestInputStream
 * 输入流
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月09日  16:29:07
 * @Version 1.0.0
 */

public class TestInputStream {


    public static void main(String[] args) {

        try {
            //创建文件
            File file = new File("src/com/demo/io/test.txt");
            //创建文件字节输入流
            FileInputStream fis = new FileInputStream(file);
            //定义缓存数据的数组
            byte[] b = new byte[1024*1024];
            //定义记录读取到字节数的变量
            int len;
            //循环读取文件中数据，并打印输出
            while ((len=fis.read(b))!=-1){
                System.out.println(new String(b,0,len));
                System.out.println(len);
            }
            //关闭流
            fis.close();
            

        } catch ( Exception e) {
            e.printStackTrace();
        }
    }
}
