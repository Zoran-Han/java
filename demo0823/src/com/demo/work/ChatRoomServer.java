package com.demo.work;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ChatRoomServer
 * 聊天室服务器
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月26日  09:39:08
 * @Version 1.0.0
 */

public class ChatRoomServer {

    /**
     * 封装通道的集合
     */
    public List<SocketChannel> channelList = new ArrayList<>();

    /**
     * 构造函数
     *
     * @throws Exception
     */
    public ChatRoomServer() throws Exception {

        init();
    }


    /**
     * 初始化聊天室的方法
     *
     * @throws IOException
     */
    public void init() throws Exception {
        //创建服务器通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        //设置成非阻塞
        serverSocketChannel.configureBlocking(false);
        //绑定服务器端口号
        serverSocketChannel.bind(new InetSocketAddress(16888));

        //打开并创建选择器
        Selector selector = Selector.open();
        //将服务器通道注册给选择器，同时绑定“可接受请求”事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        System.out.println("启动服务器成功！");

        //循环去选择通道并处理
        while (true) {
            //定义变量，记录处理数据的通道的key
            SelectionKey currentKey = null;
            try {
                //选择器选择通道
                selector.select(2000);//两秒钟来选择一次
                //若选择到通道，获得通道的迭代器
                Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();

                //迭代遍历集合
                while (iterator.hasNext()) {
                    //获得选择键对象
                    SelectionKey selectionKey = iterator.next();
                    //记录当前的key对象
                    currentKey = selectionKey;
                    //从选择集合中移除当前通道的key，避免冲突
                    iterator.remove();
                    //判断触发的事件类型
                    if (selectionKey.isAcceptable()) {//可接受请求事件

                        //获得服务器通道
                        ServerSocketChannel serverChannel = (ServerSocketChannel) selectionKey.channel();
                        //获得服务器与客户端链接的通道
                        SocketChannel socketChannel = serverChannel.accept();
                        //设置通道 的阻塞模式为非阻塞
                        socketChannel.configureBlocking(false);
                        //通道注册给选择器并绑定可读事件
                        socketChannel.register(selector, SelectionKey.OP_READ);

                        //添加通道到集合中
                        channelList.add(socketChannel);
                    } else if (selectionKey.isReadable()) {//接受可读事件
                        //获得服务器与客户端的连接通道
                        SocketChannel socketChannel = (SocketChannel) selectionKey.channel();
                        //创建缓存区
                        ByteBuffer buffer = ByteBuffer.allocate(1024 * 10);
                        System.out.println(socketChannel.isOpen());
                        //读取数据
                        int len = socketChannel.read(buffer);
                        //提取缓冲区中的数据
                        String data = new String(buffer.array());
                        //遍历通道集合
                        for (SocketChannel channel : channelList) {
                            if (channel != socketChannel) {
                                buffer = ByteBuffer.wrap(data.getBytes());
                                //输出数据到某个客户端
                                channel.write(buffer);
                            }
                        }

                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
                //关闭通道,q取消绑定的事件
                currentKey.cancel();
                //从通道集合中移除通道
                channelList.remove(currentKey.channel());
            }

        }
    }


    public static void main(String[] args) {

        try {
            ChatRoomServer server = new ChatRoomServer();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
