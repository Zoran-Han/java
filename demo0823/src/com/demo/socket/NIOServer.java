package com.demo.socket;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @ClassName NIOServer
 * 非阻塞io服务器
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月23日  10:20:20
 * @Version 1.0.0
 */

public class NIOServer {

    public static void main(String[] args) {
        try {
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            //设置通道是非阻塞通道
            serverSocketChannel.configureBlocking(false);
            serverSocketChannel.bind(new InetSocketAddress(16888));
            //创建一个选择器
            Selector selector = Selector.open();
            //注册通道给选择器，并指定选择器监听该通道的事件，共用四种事件
            //SelectionKey.OP_ACCEPT
            // SelectionKey.OP_CONNECT
            // SelectionKey.OP_READ
            // SelectionKey.OP_WRITE
            serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
            System.out.println("服务器启动成功...");
            //循环去选择通道获取数据以及处理
            while (true) {
                //选择器选择通道
                selector.select();
                //获得“选取到通道”集合的迭代器
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
                //迭代遍历通道集合
                while (iterator.hasNext()) {
                    //获得与通道相关的key对象
                    SelectionKey selectionKey = iterator.next();
                    //从迭代器的底层集合中删除当前的selectionKey对象，防止重复处理
                    iterator.remove();
                    //判断事件
                    if (selectionKey.isAcceptable()) {//可接受连接请求， 判断是否是第一次连接到服务器
                        //获取服务器通道
                        ServerSocketChannel serverChannel = (ServerSocketChannel) selectionKey.channel();
                        //获得客户端与服务器连接的通道
                        SocketChannel socketChannel = serverChannel.accept();
                        //设置通道是非阻塞通道
                        socketChannel.configureBlocking(false);
                        //返回相应数据到客户端
                        socketChannel.write(ByteBuffer.wrap("连接成功...".getBytes()));
                        //注册通道给选择器，并绑定事件为可读事件
                        socketChannel.register(selector, SelectionKey.OP_READ);

                    } else if (selectionKey.isReadable()) {//可读数据事件
                        //获得连接通道
                        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                        //读取通道中的数据
                        ByteBuffer buffer = ByteBuffer.allocate(10 * 1024);
                        //读取通道中数据
                        int len = socketChannel.read(buffer);
                        //提取缓冲区中的字节数据
                        byte[] b = buffer.array();
                        //输出客户端传递过来的数据
                        System.out.println(new String(b));
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
