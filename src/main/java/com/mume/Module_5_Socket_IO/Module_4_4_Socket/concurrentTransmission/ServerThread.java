package com.mume.Module_5_Socket_IO.Module_4_4_Socket.concurrentTransmission;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author mume
 */
public class ServerThread extends Thread {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        PrintStream ps = null;
        BufferedReader br = null;
        try {
            ps = new PrintStream(socket.getOutputStream());
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (true) {
                // 3. 使用输入流输出流进行通信
                // 实现对客户端发来的字符串内容的接收并打印
                String s1 = br.readLine();
                InetAddress inetAddress = socket.getInetAddress();
                System.out.println("客户端" + inetAddress + "发送的字符串内容为：" + s1);
                // 当客户端发来内容"bye",则聊天结束
                if ("bye".equalsIgnoreCase(s1)) {
                    System.out.println("客户端" + inetAddress + "已下线！");
                    break;
                }

                // 实现服务器往客户端回发字符串内容
                ps.println("I received");
                System.out.println("服务端发送数据成功");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != ps) {
                ps.close();
            }
            if (null != br) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != socket) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
