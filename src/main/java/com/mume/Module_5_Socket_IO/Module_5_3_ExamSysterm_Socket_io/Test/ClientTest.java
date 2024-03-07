package com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Test;

import com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Client.ClientInitClose;
import com.mume.Module_5_Socket_IO.Module_5_3_ExamSysterm_Socket_io.Client.ClientScanner;

import java.io.IOException;

public class ClientTest {
    public static void main(String[] args) {
        ClientInitClose clientInitClose = new ClientInitClose();
        try {
            clientInitClose.clientInit();
            ClientView cv = new ClientView(clientInitClose);
            cv.clientMainPage();
        } catch (IOException | ClassNotFoundException e) {
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
