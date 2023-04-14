package com.mume.Module_5_3_ExamSysterm.Test;

import com.mume.Module_5_3_ExamSysterm.Client.ClientInitClose;
import com.mume.Module_5_3_ExamSysterm.Client.ClientScanner;

import java.io.IOException;

public class ClientTest {
    public static void main(String[] args) {
        ClientInitClose clientInitClose = new ClientInitClose();
        try {
            clientInitClose.clientInit();
            ClientView cv = new ClientView();
            cv.clientMainPage();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                clientInitClose.clientClose();
                ClientScanner.closeScanner();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
