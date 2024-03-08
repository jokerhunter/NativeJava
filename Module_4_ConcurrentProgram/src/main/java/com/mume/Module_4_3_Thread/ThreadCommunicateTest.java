package com.mume.Module_4_3_Thread;

public class ThreadCommunicateTest implements Runnable {
    private int cnt = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                // 唤醒一个等待的线程，由于有锁，所以另一个线程变为就绪状态
                notify();
                if (cnt <= 50) {
                    System.out.println("Thread:" + Thread.currentThread().getName() + "cnt value = " + cnt);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    cnt++;
                    // 当线程打印完毕一个整数后，为了防止打印下一个数据，调用wait()方法
                    try {
                        wait(); // 当前线程进入阻塞状态，自动释放对象锁，必须再锁定的代码中调用
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadCommunicateTest tct = new ThreadCommunicateTest();
        Thread t1 = new Thread(tct);
        t1.start();

        Thread t2 = new Thread(tct);
        t2.start();
    }
}
