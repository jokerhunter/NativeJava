package com.mume.Module_5_Socket_IO.Module_5_4_NIO.socket.BIO;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * BIO：同步阻塞  NIO：同步非阻塞（并发支持高）
 *
 * @author mume
 */
public class ClientTest {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("Hello".getBytes());
        outputStream.close();
        socket.close();
    }
}
