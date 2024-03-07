package com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Client;

import java.util.Scanner;

/**
 * 实现扫描工具类的封装
 */

public class ClientScanner {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 自定义成员方法实现扫描器的获取
     * @return
     */
    public static Scanner getScanner() {
        return scanner;
    }

    /**
     * 自定义成员方法实现扫描器的关闭
     */
    public static void closeScanner() {
        scanner.close();
    }
}
