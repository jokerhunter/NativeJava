package com.mume.Module_4_3_Thread;

/**
 * @author mume
 */
public class SubRunnableRun implements Runnable {

    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        System.out.println("this thread's id:" + currentThread.getId() + " name:" + currentThread.getName());
        currentThread.setName("thread-0-0-1");
        System.out.println("after change, thread's id:" + currentThread.getId() + " name:" + currentThread.getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("----------------第" + i + "个-------------------");
        }
    }
}
