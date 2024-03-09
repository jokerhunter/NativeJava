package com.mume.Module_5_Socket_IO.Module_5_4_NIO.socket.NIO;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class NIOClientTest {
    public static void main(String[] args) throws IOException {

        // 1. 创建SocketChannel对象
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8888));

        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        // 设置数据
        byteBuffer.put("Hello".getBytes());
        byteBuffer.flip();
        // 输出数据
        socketChannel.write(byteBuffer);

        socketChannel.close();
    }
}
