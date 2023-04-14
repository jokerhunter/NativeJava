package com.mume.Module_5_3_ExamSysterm.Test;

import com.mume.Module_5_3_ExamSysterm.Client.ClientScanner;
import com.mume.Module_5_3_ExamSysterm.model.User;
import com.mume.Module_5_3_ExamSysterm.model.UserMessage;

import javax.management.loading.PrivateClassLoader;
import java.util.Scanner;

public class ClientView {
    /**
     * 自定义成员方法实现客户端主界面的绘制
     */
    public void clientMainPage() {
        while (true) {
            System.out.println(" \t 在线考试系统");
            System.out.println("-------------------------------");
            System.out.println("    [1] 学员系统");
            System.out.println("    [2] 管理员系统");
            System.out.println("    [0] 退出系统");
            System.out.println("-------------------------------");
            System.out.println("请选择要进行的业务编号：");
            int choice = ClientScanner.getScanner().nextInt();
            switch (choice) {
                case 1:
                    System.out.println("进入学员系统");
                    break;
                case 2:
                    System.out.println("进入管理员系统");

                    break;
                case 0:
                    System.out.println("退出系统");
                    return;
                default:
                    System.out.println("输入错误，重新选择");
            }
        }
    }

    /**
     * 自定义成员方法实现客户端管理员登录的功能
     */
    private void clientManagerLogin() {
        System.out.println("请输入管理员的账户信息：");
        String userName = ClientScanner.getScanner().next();
        System.out.println("请输入管理员的密码信息：");
        String password = ClientScanner.getScanner().next();
        UserMessage userMessage = new UserMessage("managerCheck", new User(userName, password));
    }
}
