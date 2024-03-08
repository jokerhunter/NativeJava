package com.mume.Module_4_3_Thread;

/**
 * @author mume
 */
public class SubThreadRunTest {
    public static void main(String[] args) {
        Thread t1 = new SubThreadRun();
        t1.start();

        Thread currentThread = Thread.currentThread();
        System.out.println("current main thread's id:" + currentThread.getId() + " name:" + currentThread.getName());

        for (int i = 0; i < 10; i++) {
            System.out.println("********Main方法中：" + i + "*********");
        }
    }
}
