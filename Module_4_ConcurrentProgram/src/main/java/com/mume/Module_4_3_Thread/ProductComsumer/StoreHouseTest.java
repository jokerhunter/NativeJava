package com.mume.Module_4_3_Thread.ProductComsumer;

/**
 * @author mume
 */
public class StoreHouseTest {
    public static void main(String[] args) {
        // 创建仓库类对象
        StoreHouse storeHouse = new StoreHouse();
        // 创建线程类对象并启动
        ProduceThread t1 = new ProduceThread(storeHouse);
        ComsumerThread t2 = new ComsumerThread(storeHouse);
        t1.start();
        t2.start();
    }
}
