package com.mume.Module_5_Socket_IO.Module_5_4_NIO.channel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 本地资源的处理：
 * FileChannel:用于读取、写入、映射、操作文件的通道。
 *
 * 网络资源处理：
 * DatagramChannel:通过UDP读写网络中的数据通道。
 * SocketChannel：通过TCP读写网络中的数据
 * ServerSocketChannel：可以监听新进来的TCP连接，对于每一个新进来的连接都会创建一个SocketChannel
 *
 * @author mume
 */
public class NIO_Channel_CopyFile {

    /**
     * 需求：将file\file.jpg复制到destination中
     * @param args
     */
    public static void main(String[] args) throws IOException {
        // 创建输入流和输出流（依赖于IO流获取channel）
        System.out.println(NIO_Channel_CopyFile.class.getResource("file/file.jpg"));
        FileInputStream fileInputStream = new FileInputStream(NIO_Channel_CopyFile.class.getResource("file/file.jpg").getFile());
        System.out.println(new File(NIO_Channel_CopyFile.class.getResource("destination/copyfile.jpg").getFile()));
        FileOutputStream fileOutputStream = new FileOutputStream(NIO_Channel_CopyFile.class.getResource("destination/copyfile.jpg").getFile());
//        FileOutputStream fileOutputStream = new FileOutputStream("D:\\Code\\NativeJAVA\\src\\com\\mume\\Module_5_4_NIO\\channel\\destination\\copyfile.jpg");

        // 通过IO流获取channel通道
        FileChannel channelIn = fileInputStream.getChannel();
        FileChannel channelOut = fileOutputStream.getChannel();

        // 创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        // 循环读写
        while(channelIn.read(byteBuffer) != -1) {
            byteBuffer.flip();
            channelOut.write(byteBuffer);
            byteBuffer.clear();
        }

        // 关闭流
        fileOutputStream.close();
        fileInputStream.close();

    }

}
