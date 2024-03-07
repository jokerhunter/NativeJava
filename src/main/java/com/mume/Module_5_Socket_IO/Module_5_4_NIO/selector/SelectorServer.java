package com.mume.Module_5_Socket_IO.Module_5_4_NIO.selector;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

public class SelectorServer {
    public static void main(String[] args) throws IOException {
        // 通道注册到选择器上

        // 1、获取Selector选择器
        Selector selector = Selector.open();

        // 2、获取通道
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        ServerSocketChannel serverSocketChannel1 = ServerSocketChannel.open();
        ServerSocketChannel serverSocketChannel2 = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(8899));
        serverSocketChannel1.bind(new InetSocketAddress(8888));
        serverSocketChannel2.bind(new InetSocketAddress(7777));

        // 3、设置为非阻塞  （与Selector一起使用时，channel必须要处在非阻塞模式下，如果阻塞会抛出异常）
        serverSocketChannel.configureBlocking(false);
        serverSocketChannel1.configureBlocking(false);
        serverSocketChannel2.configureBlocking(false);

        // 4、将通道注册到选择器上  制定监听事件为“接收”事件
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        serverSocketChannel1.register(selector, SelectionKey.OP_ACCEPT);
        serverSocketChannel2.register(selector, SelectionKey.OP_ACCEPT);

        // select():查询已经就绪的通道操作  返回值：表示有多少通道已经就绪
        // 阻塞：阻塞至少有一个通道上事件就绪
//        System.out.println("select 阻塞");
//        int select = selector.select();
//        System.out.println("select num:" + select);

        // 5、采用轮询的方式，查询准备就绪的事件
        while (selector.select() > 0) {
            // 6、集合中就是所有已经准备就绪的操作/事件集合
            Set<SelectionKey> set = selector.selectedKeys();
            Iterator<SelectionKey> selectionKeys = set.iterator();
            while (selectionKeys.hasNext()) {
                // 7、已经准备就绪的单个操作/事件
                SelectionKey selectionKey = selectionKeys.next();
                // 8、判断事件的类型 --- ACCEPT
//                if (selectionKey.isAcceptable()) {
//                } else if (selectionKey.isConnectable()) {
//                }
                // 9、通过selectionKey.channel()方法获取channel
                ServerSocketChannel channel = (ServerSocketChannel) selectionKey.channel();

                // 10、接收客户端发送过来的数据
                SocketChannel accept = channel.accept();

                // 11、读取数据
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                int len = accept.read(byteBuffer);

                // 12、打印
                System.out.println(new String(byteBuffer.array(), 0, len));

                // 13、资源关闭
                accept.close();
                channel.close();
            }
            selectionKeys.remove();
        }
        serverSocketChannel.close();
        serverSocketChannel1.close();
        serverSocketChannel2.close();
    }
}
