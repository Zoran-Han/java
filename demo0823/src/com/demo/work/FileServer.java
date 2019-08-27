package com.demo.work;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName FileServer
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月26日  09:05:20
 * @Version 1.0.0
 */

public class FileServer {
    /**
     * 创建存储所有链接的集合
     */
    public List<Socket> socketList = new LinkedList<>();

    public class SocketServerRunnable implements Runnable{

        /**
         * 链接上客户端的套接字
         */
        private Socket socket;

        public SocketServerRunnable(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                // 添加套接字到集合中
                socketList.add(socket);

                DataInputStream dis = new DataInputStream(socket.getInputStream());

                // 文件名和长度
                String fileName = dis.readUTF();
                long fileLength = dis.readLong();
                File directory = new File("D:\\FTCache");

                if(!directory.exists()) {
                    directory.mkdir();
                }
                // File.separatorChar是系统默认的分隔符
                File file = new File(directory.getAbsolutePath() + File.separatorChar + fileName);
                FileOutputStream fos = new FileOutputStream(file);

                // 开始接收文件
                byte[] bytes = new byte[1024];
                int length = 0;
                while((length = dis.read(bytes, 0, bytes.length)) != -1) {
                    fos.write(bytes, 0, length);
                    fos.flush();
                }

                System.out.println("======== 文件接收成功 [File Name：" + fileName);

                for (Socket socket1 : socketList) {
                    // 判断是否为当前的链接
                    if (socket1 == this.socket) {
                        System.out.println("________");
                    }
                }

            } catch (SocketException e){
                socketList.remove(socket);
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
                // 关闭流
            }
        }
    }

    public static void main(String[] args) {
        try {
            FileServer fileServer = new FileServer();
            ServerSocket serverSocket = new ServerSocket(1688);

            System.out.println("链接到服务器");

            while (true) {
                Socket socket = serverSocket.accept();
                Thread thread = new Thread(fileServer.new SocketServerRunnable(socket));
                thread.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
