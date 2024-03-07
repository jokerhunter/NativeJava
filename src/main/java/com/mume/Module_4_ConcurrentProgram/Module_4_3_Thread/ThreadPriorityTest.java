package com.mume.Module_4_ConcurrentProgram.Module_4_3_Thread;

public class ThreadPriorityTest extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("sub thread: i = " + i);
        }
    }

    public static void main(String[] args) {
        ThreadPriorityTest tpt = new ThreadPriorityTest();
        tpt.setPriority(Thread.MAX_PRIORITY);
        tpt.start();

        Thread  t1 = Thread.currentThread();
        for (int i = 0; i < 20; i++) {
            System.out.println("main thread: i = " + i);
        }
    }
}
