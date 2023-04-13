package com.mume.Module_5_3_ExamSysterm.Test;

import com.mume.Module_5_3_ExamSysterm.Server.ServerInitClose;

import java.io.IOException;

public class ServerTest {
    public static void main(String[] args) {
        ServerInitClose sic = new ServerInitClose();
        try {
            sic.serverInit();
        } catch (IOException e) {
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
