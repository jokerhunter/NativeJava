package com.mume.Module_5_Socket_IO.Module_5_4_NIO.socket.NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NIOServerTest {
    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSocketChannel = null;
        SocketChannel socketChannel = null;

        // 1.创建服务器端对象，监听对应端口
        serverSocketChannel = ServerSocketChannel.open();
        // 绑定要监听的端口号
        serverSocketChannel.bind(new InetSocketAddress(8888));

        // 设置为非阻塞连接
        serverSocketChannel.configureBlocking(false);

        while (true) {
            // 2.连接客户端 阻塞状态
            socketChannel = serverSocketChannel.accept();

            if (null != socketChannel) {
                // 3.读取数据
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

                // 读取字符长度
                int len = socketChannel.read(byteBuffer);
                byteBuffer.clear();

                System.out.println(new String(byteBuffer.array(), 0, len));
                break;
            } else {
                // 没有连接到服务器的客户端
                System.out.println("do something else!");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (null != socketChannel) {
                socketChannel.close();
            }
        }
        if (null != serverSocketChannel) {
            serverSocketChannel.close();
        }

    }
}
