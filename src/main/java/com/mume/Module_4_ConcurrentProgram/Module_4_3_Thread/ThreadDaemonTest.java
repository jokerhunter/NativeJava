package com.mume.Module_4_ConcurrentProgram.Module_4_3_Thread;

public class ThreadDaemonTest extends Thread {
    @Override
    public void run() {
//        System.out.println(isDaemon() ? "This thread is daemon thread" : "This thread is not a daemon thread");
        // 当子线程不是守护线程时，虽然主线程先结束了，但是子线程依然会继续执行，直到打印完毕所有数据为止
        // 当子线程是守护线程时，当主线程结束后，则子线程随之结束
        for (int i = 0; i < 100; i++) {
            System.out.println("sub thread : i = " + i);
        }
    }

    public static void main(String[] args) {
        ThreadDaemonTest tdt = new ThreadDaemonTest();
        // 必须在线程启动之前设置子线程为守护线程
        tdt.setDaemon(true);
        tdt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main thread : i = " + i);
        }
    }
}
