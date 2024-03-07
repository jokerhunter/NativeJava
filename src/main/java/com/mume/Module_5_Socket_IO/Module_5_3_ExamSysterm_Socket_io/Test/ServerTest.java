package com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Test;

import com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Server.ServerInitClose;
import com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Server.ServerView;

import java.io.IOException;

public class ServerTest {
    public static void main(String[] args) {
        ServerInitClose sic = null;
        try {
            // 1.声明ServerInitClose类型地引用指向该类型地对象
            sic = new ServerInitClose();
            sic.serverInit();
            ServerView sv = new ServerView(sic);
            sv.serverReceive();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                sic.serverClose();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
