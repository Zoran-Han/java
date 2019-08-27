package com.demo.socket;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @ClassName NIOClient
 * 非阻塞io客户端
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月23日  10:20:31
 * @Version 1.0.0
 */

public class NIOClient {


    /**
     * 负责读取数据的线程
     */
    private class ReadRunnable implements Runnable {

        private Selector selector;

        public ReadRunnable(Selector selector) {
            this.selector = selector;
        }

        @Override
        public void run() {

            //以轮循的方式访问选择器
            while (true) {
                try {
                    //选择通道
                    selector.select();
                    //获得选择到通道的集合，返回迭代器
                    Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                    //迭代遍历集合
                    while (iterator.hasNext()) {
                        //获得选择器选择的通道信息相关的对象
                        SelectionKey selectionKey = iterator.next();
                        iterator.remove();
                        //判断事假
                        if (selectionKey.isConnectable()) {//已连接（连接就绪）事件
                            //获得通道（该通道连接上了客户端与服务端）
                            SocketChannel channel = (SocketChannel) selectionKey.channel();
                            //判断连接是否正在链接
                            if (channel.isConnectionPending()) {
                                //完成链接
                                channel.finishConnect();
                            }
                            //将选择器的监听事件修改为可读事件
                            channel.register(selector, SelectionKey.OP_READ);

                        } else if (selectionKey.isReadable()) {//可读事件
                            //获得通道
                            SocketChannel channel = (SocketChannel) selectionKey.channel();
                            //读取服务器响应数据
                            ByteBuffer buffer = ByteBuffer.allocate(10 * 1024);
                            channel.read(buffer);
                            int len = channel.read(buffer);
                            String data = new String(buffer.array(), 0, len);
                            //输出服务器相应数据
                            System.out.println(data);
                            //发生数据到服务器
                            channel.write(ByteBuffer.wrap("Hello".getBytes()));

                        }
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void main(String[] args) {


        try {
            //创建socket通道
            SocketChannel socketChannel = SocketChannel.open();
            //设置通道为非阻塞
            socketChannel.configureBlocking(false);
            //连接服务器
            socketChannel.connect(new InetSocketAddress("localhost", 1688));
            //创建选择器
            Selector selector = Selector.open();
            //通道注册给选择器，绑定监听事件为“ 已连接就绪事件”
            socketChannel.register(selector, SelectionKey.OP_CONNECT);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
