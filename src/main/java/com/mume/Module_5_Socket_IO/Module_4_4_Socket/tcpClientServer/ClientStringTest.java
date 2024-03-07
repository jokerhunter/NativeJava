package com.mume.Module_5_Socket_IO.Module_4_4_Socket.tcpClientServer;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @author mume
 */
public class ClientStringTest {
    public static void main(String[] args) {
        Socket s = null;
        PrintStream ps = null;
        try {
            // 1. 创建Socket类型的对象并提供服务器的主机名和端口号
            s = new Socket("127.0.0.1", 8888);
            System.out.println("连接服务器成功！");
            // 2. 使用输入输出流进行通信
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 实现客户端像服务器发送字符串内容"hello"
            ps = new PrintStream(s.getOutputStream());
            ps.println("hello");
            System.out.println("客户端发送数据内容成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭Socket并释放有关资源
            if (null != ps) {
                ps.close();
            }
            if (null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
