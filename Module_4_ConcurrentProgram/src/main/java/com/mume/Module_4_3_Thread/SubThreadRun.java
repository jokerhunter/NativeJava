package com.mume.Module_4_3_Thread;

/**
 * @author mume
 */
public class SubThreadRun extends Thread {
    @Override
    public void run() {
        System.out.println("this sub thread's id:" + getId() + " name:" + getName());
        setName("thread-0-0-1");
        System.out.println("after change, the sub thread's id:" + getId() + " name:" + getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("----------------第" + i + "个-------------------");
        }
    }
}
