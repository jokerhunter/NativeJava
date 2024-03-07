package com.mume.Module_5_2_Java8.FunctionalInterface;

import java.io.*;

public class Java9_InputStreamTest {
    public static void main(String[] args) {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("d:/a.txt");
            outputStream = new FileOutputStream("d:/b.txt");
            inputStream.transferTo(outputStream); //实现数据的复制，底层是read和write的调用
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != inputStream) {
                    inputStream.close();
                }
                if (null != outputStream) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
