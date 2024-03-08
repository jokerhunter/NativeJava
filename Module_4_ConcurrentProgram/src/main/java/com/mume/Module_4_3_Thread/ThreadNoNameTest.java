package com.mume.Module_4_3_Thread;

/**
 * @author mume
 */
public class ThreadNoNameTest {
    public static void main(String[] args) {
        // 匿名内部类
//        Thread t1 = new Thread() {
//            @Override
//            public void run() {
//                System.out.println("create threads by extending Thread");
//            }
//        };
//        t1.start();

        new Thread() {
            @Override
            public void run() {
                System.out.println("create threads by extending Thread");
            }
        }.start();

        /*Runnable ra = new Runnable() {
            @Override
            public void run() {
                System.out.println("create threads by implementing Thread");
            }
        };
        Thread t2 = new Thread(ra);
        t2.start();*/

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("create threads by implementing Runnable");
//            }
//        }).start();

        new Thread(() -> {
                System.out.println("create threads by implementing Runnable");
        }).start();
    }
}
