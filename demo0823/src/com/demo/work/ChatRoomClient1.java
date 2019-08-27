package com.demo.work;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @ClassName ChatRoomClient
 * 聊天室客户端
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月26日  09:38:55
 * @Version 1.0.0
 */

public class ChatRoomClient1 {

    /**
     * 读取通道数据的线程任务类
     */
    private class ReadRunnable implements Runnable {

        private Selector selector;//选择通道的选择器

        public ReadRunnable(Selector selector) {
            this.selector = selector;
        }

        @Override
        public void run() {
            try {
                //循环选择通道
                while (true) {
                    //选择通道
                    selector.select();
                    //获得通道集合的迭代器
                    Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                    //迭代遍历集合
                    while (iterator.hasNext()) {
                        //获得选择通道的key对象
                        SelectionKey selectionKey = iterator.next();
                        //从选择集合中移除当前通道的key，避免冲突
                        iterator.remove();
                        //判断触发事件类型
                        if (selectionKey.isConnectable()) {//可连接事件
                            //获得客户端与服务器连接通道
                            SocketChannel channel = (SocketChannel) selectionKey.channel();
                            //判断是否正在链接
                            if (channel.isConnectionPending()) {
                                //等待完成链接
                                channel.finishConnect();
                            }
                            //将通道注册给选择器，并绑定可读事件
                            channel.register(selector, SelectionKey.OP_READ);
                            System.out.println("连接成功！");
                        } else if (selectionKey.isReadable()) {//可读事件
                            SocketChannel channel = (SocketChannel) selectionKey.channel();
                            //读取数据
                            ByteBuffer buffer = ByteBuffer.allocate(1024 * 10);
                            int len = channel.read(buffer);
                            String data = new String(buffer.array());
                            System.out.println(data);

                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public ChatRoomClient1() throws Exception {
        init();

    }

    public void init() throws Exception {
        //创建客户端通道
        SocketChannel socketChannel = SocketChannel.open();
        //设置通道为非阻塞
        socketChannel.configureBlocking(false);
        //连接服务器
        socketChannel.connect(new InetSocketAddress("localhost", 16888));

        //创建选择器
        Selector selector = Selector.open();
        //将通道注册给选择器,并绑定“可连接”事件，连接到服务器
        socketChannel.register(selector, SelectionKey.OP_CONNECT);
        //创建线程对象
        Thread thread = new Thread(new ReadRunnable(selector));
        // 开启线程
        thread.start();
        //创建简单的文本扫描器对象
        Scanner scanner = new Scanner(System.in);
        //控制台循环写入数据
        while (true) {
            //读取一行数据
            String data = scanner.nextLine();
            //客户端发送数据到服务器
            ByteBuffer buffer = ByteBuffer.wrap(data.getBytes());
            socketChannel.write(buffer);
        }

    }

    public static void main(String[] args) {

        try {
            ChatRoomClient1 chatRoomClient1 = new ChatRoomClient1();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
