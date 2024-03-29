package com.mume.Module_4_3_Thread.ProductComsumer;

/**
 * 编程实现生产者线程，不断地生产产品
 * @author mume
 */
public class ProduceThread extends Thread {
    // 声明一个仓库类型地引用作为成员变量，是为了能调用仓库类地生产方法  合成复用原则
    private StoreHouse storeHouse;

    // 为了确保两个线程共用同一个仓库
    public ProduceThread(StoreHouse storeHouse) {
        this.storeHouse = storeHouse;
    }

    @Override
    public void run() {
        while (true) {
            storeHouse.produce();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
