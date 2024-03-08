package com.mume.Module_4_3_Thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author mume
 */
public class ThreadSleepTest extends Thread {
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            System.out.println(dtf.format(dateTime));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadSleepTest tst = new ThreadSleepTest();
        tst.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tst.flag = false;
    }
}
