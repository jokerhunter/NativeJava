package com.mume.Module_5_Socket_IO.Module_4_4_Socket.UserMessage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerTest {
    public static void main(String[] args) {
        ServerSocket ss = null;
        Socket socket = null;
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            ss = new ServerSocket(8888);
            System.out.println("启动服务端成功");
            socket = ss.accept();
            System.out.println("连接成功");

            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());

            List<UserMessage> userMessageList = new ArrayList(3);
            userMessageList.add((UserMessage) ois.readObject());
            userMessageList.add((UserMessage) ois.readObject());
            userMessageList.add((UserMessage) ois.readObject());
            UserMessage userMessage = null;
            for (Object o : userMessageList) {
                userMessage = (UserMessage) o;
                if (userMessage.getUser().equals(new User("admin", "123456"))) {
                    userMessage.setMessageType("success");
                } else {
                    userMessage.setMessageType("fail");
                }
                System.out.println(userMessage);
                oos.writeObject(userMessage);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != oos) {
                    oos.close();
                }
                if (null != ois) {
                    ois.close();
                }
                if (null != socket) {
                    socket.close();
                }
                if (null != ss) {
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
