package com.mume.Module_5_Socket_IO.Module_4_4_Socket.udpTransmission;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerStringTest {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        try {
            // 1. 创建DatagramSocket类型的对象并提供端口号
            ds = new DatagramSocket(8888);
            // 2. 创建DatagramPacket类型的对象并提供缓冲区
            byte[] bArr = new byte[20];
            DatagramPacket dp = new DatagramPacket(bArr, bArr.length);
            // 3. 通过Socket接收数据内容存放到Packet里面，调用receive()方法
            System.out.println("等待数据的到来...");
            ds.receive(dp);
            System.out.println("接收到的数据内容是：" + new String(bArr, 0, dp.getLength()) + "!");

            // 实现字符串内容"I received!" 回发过去
            byte[] bArr2 = "I recieved!".getBytes();
            DatagramPacket dp2 = new DatagramPacket(bArr2, bArr2.length, dp.getAddress(), dp.getPort());
            ds.send(dp2);
            System.out.println("回发数据成功！");
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭Socket并释放有关的资源
            if (null != ds) {
                ds.close();
            }
        }
    }
}
