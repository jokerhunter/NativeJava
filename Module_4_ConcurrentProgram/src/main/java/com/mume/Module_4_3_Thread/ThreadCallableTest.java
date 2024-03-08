package com.mume.Module_4_3_Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author mume
 */
public class ThreadCallableTest implements Callable {

    @Override
    public Object call() throws Exception {
        // 计算1 ~ 10000之间地累加和并打印返回
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += i;
        }
        System.out.println("计算的累加和是：" + sum);
        return sum;
    }

    public static void main(String[] args) {
        ThreadCallableTest tct = new ThreadCallableTest();
        FutureTask ft = new FutureTask(tct);
        Thread t1 = new Thread(ft);
        t1.start();
        Object obj = null;
        try {
            obj = ft.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("线程处理返回值是：" + obj);
    }
}
