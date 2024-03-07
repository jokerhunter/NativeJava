package com.mume.Module_5_Socket_IO.Module_4_4_Socket.tcpClientServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerStringTest {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket s = null;
        BufferedReader br = null;
        try {
            // 1. 创建ServerSocket类型的对象并提供端口号
            ss = new ServerSocket(8888);
            // 2. 等待客户端的连接请求，调用accept方法
            System.out.println("等待客户端的连接请求");
            // 当没有客户端连接时，则服务器阻塞在accept方法的调用这里
            s = ss.accept();
            System.out.println("客户端连接成功");
            // 3. 使用输入流输出流进行通信
            // 实现对客户端发来的字符串内容的接收并打印
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String s1 = br.readLine();
            System.out.println("客户端发送的字符串内容为：" + s1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭Socket并释放有关资源
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != s) {
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != ss) {
                try {
                    ss.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
