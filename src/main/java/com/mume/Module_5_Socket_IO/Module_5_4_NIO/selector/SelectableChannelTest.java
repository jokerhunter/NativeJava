package com.mume.Module_5_Socket_IO.Module_5_4_NIO.selector;

import java.nio.channels.*;

/**
 * 并不是所有channel都可以被Selector复用的，比如FileChannel
 * 因为只有继承SelectableChannel的类，才能被复用，否则不能
 *
 * SelectableChannel可以被注册到Selector对象上，注册的时候需要指定通道的操作
 * 一个通道可以注册到多个选择器上，但对于每个选择器而言只能被一个通道注册一次
 */
public class SelectableChannelTest {
    public static void main(String[] args) {
        // Channel.register(Selector sel, int ops)
        // SellectionKey.OP_ACCEPT 接受连接进行事件，表示服务器监听到了客户连接，那么服务器可以接收这个连接了
        // SelectionKey.OP_CONNECT 连接就绪事件，标识客户端和服务端的连接已经成功建立
        // SelectionKey.OP_WRITE; 写就绪事件，表示可以向通道写数据了
        // SelectionKey.OP_READ;  读就绪事件，标识通道有可读的数据，可以执行读操作了
        // 如果Selector需要通道的多操作，则使用位或操作符来实现 int key = SellectionKey.OP_ACCEPT | SelectionKey.OP_WRITE;

    }
}
