package com.mume.Locks.ParameterMutexLock.WeakMapParameterLock;

import java.util.Map;
import java.util.concurrent.locks.Lock;


/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description: TODO
 * @date: 2024-03-08 23:32
 * @version: 1.0
 */
public class WeakMapParameterLock {
    private static Map locks = ParameterLock.locks;

    public static void main(String[] args) {
        Runnable run1 = new Runnable() {

            @Override
            public void run() {
                sync(new Integer(5));
                System.gc();
            }
        };
        Runnable run2 = new Runnable() {

            @Override
            public void run() {
                sync(new Integer(5));
                System.gc();
            }
        };
        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            while (!locks.isEmpty()) {
                System.gc();
                System.out.println(locks);
            }
            System.out.println("FINISHED!");
        } catch (InterruptedException ex) {
            // those threads won't be interrupted
        }
    }

    private static void sync (Object param) {
        Lock lock = ParameterLock.getCanonicalParameterLock(param);
        lock.lock();
        try {
            System.out.println("Thread="+Thread.currentThread().getName()+", lock=" + ((ParameterLock) lock).getLock());
            // do some work while having the lock
        } finally {
            lock.unlock();
        }
    }
}
