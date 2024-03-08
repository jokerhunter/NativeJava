package com.mume.Module_4_ConcurrentProgram.Module_4_3_Thread;

public class SynchronizedStaticTest implements Runnable {
    private int balance;
    private Demo dm;

    public SynchronizedStaticTest(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void run() {
        test();
    }

    public /*synchronized*/ static void test() { // 锁定静态方法
        synchronized (SynchronizedStaticTest.class) { // 该类型对应的Class对象，由于类型是固定的，因此Class对象也是唯一的，
            // 所以通过这种方式可以实现同步
            int temp = 1000;
            // 2. 模拟取款200
            if (temp >= 200) {
                System.out.println("正在出钞，请稍后...");
                temp -= 200;
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("请取走你的钞票");
            } else {
                System.out.println("余额不足");
            }
//            setBalance(temp);
        }
    }

    public static void main(String[] args) {
        SynchronizedStaticTest account = new SynchronizedStaticTest(1000);
        Thread t1 = new Thread(account);
        Thread t2 = new Thread(account);
        t1.start();
        t2.start();

        try {
            // t1调用joint函数，因此只有当t1任务结束，t1.join()才能得到返回
            // t1 在主线程中调用了join()函数，因此主线程要等待t1线程工作完，否则主线程一直在block状态，
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("final balance:" + account.getBalance());
    }
}

