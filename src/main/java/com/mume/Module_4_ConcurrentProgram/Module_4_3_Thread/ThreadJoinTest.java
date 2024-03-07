package com.mume.Module_4_ConcurrentProgram.Module_4_3_Thread;

public class ThreadJoinTest extends Thread {
    @Override
    public void run() {
        System.out.println("CountDown start");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Happy New Year");
    }

    public static void main(String[] args) {
        ThreadJoinTest tjt = new ThreadJoinTest();
        tjt.start();

        System.out.println("main thread is waiting...");
        try {
            // 表示当前正在执行的线程对象等待调用线程对象，也就是主线程等待子线程终止
//            tjt.join();
            tjt.join(5000); // 最多等5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==============end============");
    }
}
