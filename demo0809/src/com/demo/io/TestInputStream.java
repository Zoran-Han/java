package com.demo.io;

import com.demo.file.TestFile;

import java.io.File;
import java.io.FileInputStream;

/**
 * 输入流
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月09日 16:29:33
 */
public class TestInputStream {

    public static void main(String[] args) {
        try {
            //创建文件对象
            File file = new File("src/com/demo/io/test.txt");
            //创建文件字节输入流
            FileInputStream fis = new FileInputStream(file);
            //定义缓存数据的数组
            byte[] b = new byte[100*1024];
            //定义记录读取到字节数据的变量
            int len;
            //循环读取文件中数据
            while((len=fis.read(b))!=-1) {
                System.out.println(new String(b, 0, len));
            }
            //关闭流
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
