package com.demo.work;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;

/**
 * @ClassName FileClient
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月26日  09:05:42
 * @Version 1.0.0
 */

public class FileClient {
    public static void main(String[] args) {
        try {
            // 创建客户端套接字对象
            Socket socket = new Socket("localhost", 1688);
            // 获得文件对象
            File file = new File("E:\\From\\11.txt");

            if(file.exists()) {
                // 获得文件输入流
                FileInputStream fis = new FileInputStream(file);
                // 获得基本数据输出流
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

                // 文件名和长度
                dos.writeUTF(file.getName());
                dos.flush();
                System.out.println(file.length());

                dos.writeLong(file.length());
                dos.flush();

                // 开始传输文件
                System.out.println("======== 开始传输文件 ========");
                byte[] bytes = new byte[1024];
                int length = 0;
                long progress = 0;
                while((length = fis.read(bytes, 0, bytes.length)) != -1) {
                    dos.write(bytes, 0, length);
                    dos.flush();
                    progress += length;
                    System.out.print("| " + (100*progress/file.length()) + "% |");
                }
                System.out.println();
                System.out.println("======== 文件传输成功 ========");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
