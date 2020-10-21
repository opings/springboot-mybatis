package com.test.example.demo.io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;

/**
 * Created by Administrator on 2019/10/15.
 */
public class NioServer {

    private Selector selector;

    public void init() throws IOException {
        // 创建选择器
        selector = Selector.open();
        // 创建SocketChannel
        ServerSocketChannel channel = ServerSocketChannel.open();
        // 非阻塞
        channel.configureBlocking(false);

        ServerSocket serverSocket = channel.socket();
        // 绑定端口
        serverSocket.bind(new InetSocketAddress(8080));
        // 注册accept事件
        channel.register(selector, SelectionKey.OP_ACCEPT);
    }


    public void start() throws IOException {
        while (true) {
            // 此方法会阻塞，直到至少有一个已注册的事件发生
            this.selector.select();
            // 获取发生事件的SelectionKey集合
            Iterator<SelectionKey> iterator = this.selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                // 从集合中移除即将要处理的SelectionKey，避免重复处理
                iterator.remove();
                if (selectionKey.isAcceptable()) {
                    accept(selectionKey);
                } else if (selectionKey.isReadable()) {
                    read(selectionKey);
                }
            }
        }
    }


    public void accept(SelectionKey selectionKey) throws IOException {
        ServerSocketChannel server = (ServerSocketChannel) selectionKey.channel();
        SocketChannel channel = server.accept();
        channel.configureBlocking(false);
        channel.register(this.selector, SelectionKey.OP_READ);
    }

    public void read(SelectionKey selectionKey) throws IOException {
        SocketChannel channel = (SocketChannel) selectionKey.channel();
        // 创建读取缓存区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 读取数据
        channel.read(buffer);

        String request = new String(buffer.array());
        System.out.println("客户端请求：" + request);
        // 消息回送客户端
        channel.write(ByteBuffer.wrap("收到请求".getBytes()));
    }

    public static void main(String[] args) throws IOException {
        NioServer nioServer = new NioServer();
        nioServer.init();
        nioServer.start();
    }


}
