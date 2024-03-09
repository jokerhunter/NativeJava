package com.mume.Module_5_Socket_IO.Module_4_4_Socket.UserMessage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ClientTest {
    public static void main(String[] args) {
        Socket socket = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            socket = new Socket("127.0.0.1", 8888);
            System.out.println("连接成功");

            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());

            List<UserMessage> userMessageList = new ArrayList(3);
            userMessageList.add(new UserMessage(new User("admin", "123456")));
            userMessageList.add(new UserMessage(new User("admin1", "123456")));
            userMessageList.add(new UserMessage(new User("admin", "1234561")));
            for (Object userMessage : userMessageList) {
                oos.writeObject(userMessage);
            }
            System.out.println("传输数据成功：" + userMessageList);
            List<UserMessage> userMessageList2 = new ArrayList(3);
            for (Object o : userMessageList) {
                UserMessage userMessage = (UserMessage) ois.readObject();
                System.out.println("aa" + userMessage);
                userMessageList2.add(userMessage);
            }
            System.out.println("接收数据" + userMessageList2);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != socket) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
