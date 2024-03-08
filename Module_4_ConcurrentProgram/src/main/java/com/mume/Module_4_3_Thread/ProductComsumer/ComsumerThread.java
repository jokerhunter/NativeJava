package com.mume.Module_4_3_Thread.ProductComsumer;

public class ComsumerThread extends Thread {
    // 声明一个仓库类型地引用作为成员变量，是为了能调用仓库类地生产方法  合成复用原则
    private StoreHouse storeHouse;

    // 为了确保两个线程共用同一个仓库
    public ComsumerThread(StoreHouse storeHouse) {
        this.storeHouse = storeHouse;
    }

    @Override
    public void run() {
        while (true) {
            storeHouse.comsumer();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
