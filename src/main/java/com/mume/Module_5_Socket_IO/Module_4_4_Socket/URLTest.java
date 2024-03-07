package com.mume.Module_5_Socket_IO.Module_4_4_Socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest {
    public static void main(String[] args) {
//        BufferedReader br = null;
        try {
            // 1. 使用参数指定的字符串来构造对象
            URL url = new URL("https://www.lagou.com/");
            // 2. 获取相关信息并打印出来
            System.out.println("获取到的协议名称是：" + url.getProtocol());
            System.out.println("获取到的主机名称是：" + url.getHost());
            System.out.println("获取到的端口号是：" + url.getPort());

            // 3. 建立连接并获取相关信息打印出来
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String str = null;
            while (null != (str = br.readLine())) {
                System.out.println(str);
            }
            br.close();
            // 4. 断开连接
            urlConnection.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
