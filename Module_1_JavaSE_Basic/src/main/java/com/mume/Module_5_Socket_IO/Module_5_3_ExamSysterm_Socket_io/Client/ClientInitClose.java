package com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class ClientInitClose {
    private Socket s;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public ObjectInputStream getOis() {
        return ois;
    }

    public void setOis(ObjectInputStream ois) {
        this.ois = ois;
    }

    public ObjectOutputStream getOos() {
        return oos;
    }

    public void setOos(ObjectOutputStream oos) {
        this.oos = oos;
    }

    /**
     * 自定义成员方法实现客户端的初始化操作
     */
    public void clientInit() throws IOException {
        // 1.创建Socket类型的对象并指定服务器的通信地址
        s = new Socket(InetAddress.getLocalHost(), 8888);
        System.out.println(InetAddress.getLocalHost());
//        s = new Socket("127.0.0.1", 8888);
        // 2.使用输入输出流通信
        oos = new ObjectOutputStream(s.getOutputStream());
        ois = new ObjectInputStream(s.getInputStream());
        System.out.println("连接服务器成功！");
    }

    /**
     * 自定义成员方法实现客户端的关闭操作
     */
    public void clientClose() throws IOException {
        // 3.关闭Socket并释放有关资源
        ois.close();
        oos.close();
        s.close();
        System.out.println("客户端成功关闭");
    }

}
