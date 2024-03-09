package com.mume.Module_5_Socket_IO.Module_4_4_Socket.concurrentTransmission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author mume
 */
public class ClientStringTest2 {
    public static void main(String[] args) {
        Socket s = null;
        PrintStream ps = null;
        Scanner sc = null;
        BufferedReader br = null;
        try {
            // 1. 创建Socket类型的对象并提供服务器的主机名和端口号
            s = new Socket("127.0.0.1", 8888);
            System.out.println("连接服务器成功！");
            // 2. 使用输入输出流进行通信
            sc = new Scanner(System.in);
            ps = new PrintStream(s.getOutputStream());
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));

            while(true) {
                // 实现客户端发送的内容由键盘输入
                System.out.println("请输入发送的数据内容：");
                String str = sc.next();

                // 实现客户端像服务器发送字符串内容
                ps.println(str);
                System.out.println("客户端发送数据内容成功");

                String serverStr = br.readLine();
                System.out.println("客户端接收到服务端数据为：" + serverStr);

                if ("bye".equalsIgnoreCase(str)) {
                    System.out.println("聊天结束");
                    break;
                }
            }
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
            if (null != sc) {
                sc.close();
            }
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
