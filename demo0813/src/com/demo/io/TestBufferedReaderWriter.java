package com.demo.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @ClassName TestBufferedReaderWriter
 * 缓冲字符输入输出流
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月13日  15:40:29
 * @Version 1.0.0
 */

public class TestBufferedReaderWriter {

    /**
     * 读取数据
     * @throws Exception
     */
    public void read() throws Exception{
        //创建缓冲字符输入流
        BufferedReader br = new BufferedReader(new FileReader("src/com/demo/io/test.txt"));
        //创建字符串变量，存储每次读取到字符串数据
        String line;
        while((line=br.readLine())!=null){
            System.out.println(line); //每次读取一行
        }
        br.close();
    }

    /**
     * 写入数据
     * @throws Exception
     */
    public void write() throws Exception{

        //创建缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/demo/io/test.txt"));
        bw.write("Welcome to GanSu，甘肃牛皮");
        bw.newLine();  //新建行
        bw.write("羌笛何须怨杨柳，春风不度玉门关。");
        //关闭流
        bw.close();
    }

    public static void main(String[] args) {
        try {
            TestBufferedReaderWriter trw = new TestBufferedReaderWriter();
            trw.write();
            trw.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
