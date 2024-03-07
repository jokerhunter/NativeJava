package com.mume.Module_4_ConcurrentProgram.Module_4_3_Thread;

/**
 * @author mume
 */
public class SubRunnableRunTest {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("current main thread's id:" + currentThread.getId() + " name:" + currentThread.getName());

        SubRunnableRun srr = new SubRunnableRun();
        Thread t1 = new Thread(srr);
        t1.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("********Main方法中：" + i + "*********");
        }
    }
}
