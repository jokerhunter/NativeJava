package com.mume.Module_4_ConcurrentProgram.Module_4_3_Thread.ProductComsumer;

/**
 * 编程实现一个仓库类
 * @author mume
 */
public class StoreHouse {
    // 用于记录产品的数量
    private int cnt = 0;

    public synchronized void produce() {
        notify();
        if (cnt < 10) {
            System.out.println("Thread:" + Thread.currentThread().getName() + "is producing NO " + (cnt + 1) + " product");
            cnt++;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void comsumer() {
        notify();
        if (cnt > 0) {
            System.out.println("Thread:" + Thread.currentThread().getName() + "is comsumering NO " + (cnt) + " product");
            cnt--;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
