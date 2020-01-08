package com.example.demo.io.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * Created by Administrator on 2019/10/14.
 */
public class NioClient {


    private Selector selector;

    private BufferedReader clientInput = new BufferedReader(new InputStreamReader(System.in));

    public void init() throws IOException {
        // 创建选择器
        selector = Selector.open();
        // 创建安SocketChannel
        SocketChannel channel = SocketChannel.open();
        // 非阻塞
        channel.configureBlocking(false);
        // 链接服务器
        channel.connect(new InetSocketAddress("localhost", 8080));
        // 注册connect事件
        channel.register(selector, SelectionKey.OP_CONNECT);
    }


    public void start() throws IOException {
        while (true) {
            // 此方法会阻塞，直到至少有一个已注册的事件发生
            selector.select();
            // 获取发生事件的SelectionKey集合
            Iterator<SelectionKey> iterator = this.selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey selectionKey = iterator.next();
                // 从集合中移除即将要处理的SelectionKey，避免重复处理
                iterator.remove();
                if (selectionKey.isConnectable()) {
                    connect(selectionKey);
                } else {
                    read(selectionKey);
                }
            }
        }
    }


    public void connect(SelectionKey selectionKey) throws IOException {
        SocketChannel channel = (SocketChannel) selectionKey.channel();
        // 如果正在链接
        if (channel.isConnectionPending()) {
            // 完成链接
            if (channel.finishConnect()) {
                // 设置为非阻塞
                channel.configureBlocking(false);
                // 注册读事件
                channel.register(this.selector, SelectionKey.OP_READ);
                // 客户端输入请求
                String request = clientInput.readLine();
                // 发送到服务端
                channel.write(ByteBuffer.wrap(request.getBytes()));
            } else {
                // 取消该键
                selectionKey.cancel();
            }
        }
    }


    public void read(SelectionKey selectionKey) throws IOException {
        SocketChannel channel = (SocketChannel) selectionKey.channel();
        // 创建读取缓存区
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);

        String response = new String(buffer.array());
        System.out.println("服务器响应：" + response);
        // 客户端输入请求
        String nextRequest = clientInput.readLine();
        // 发送到服务端
        channel.write(ByteBuffer.wrap(nextRequest.getBytes()));
    }

    public static void main(String[] args) throws IOException {
        NioClient nioClient = new NioClient();
        nioClient.init();
        nioClient.start();
    }


}
