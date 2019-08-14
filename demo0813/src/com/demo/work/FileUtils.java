package com.demo.work;

import java.io.*;

/**
 * @ClassName FileUtils
 * 定义文件处理类，定义方法，实现文件的拷贝，（用字节流）
 * 限制文件的大小，默认是2M，
 * 限制文件类型，默认是任意文件’
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月13日  17:25:22
 * @Version 1.0.0
 */

public class FileUtils {
    //定义常量
    private static final int CAPACITY = 1024 * 1024 * 2;

    private int fileSize;//文件大小
    private String fileType;//文件类型

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }


    public void copyFile(String fromPath, String toPath) throws Exception {


        //创建文件
        File from = new File(fromPath);
        //创建存放的文件
        File to = new File(toPath);
        //判断文件大小

        //判断文件类型
        if (fileType != null && fromPath.endsWith(fileType) && from.length() < CAPACITY) {


        //创建缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(from));
        //创建缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(to));

        //定义缓存数据的数组
        byte[] b = new byte[CAPACITY];
        //定义变量，记录读取的字节数
        int len;
        while ((len = bis.read(b)) != -1) {
            bos.write(b, 0, len);
        }

        //关闭流
        bis.close();
        bos.close();
        }else{
            System.out.println("文件过大或者文件类型不存在！");
        }

    }

    public static void main(String[] args) {

        try {
            FileUtils f = new FileUtils();
            f.setFileType(".png");
            f.copyFile("E:\\Filefrom\\22.png", "E:\\Fileto\\101.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
