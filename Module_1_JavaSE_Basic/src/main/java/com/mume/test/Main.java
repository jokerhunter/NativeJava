package com.mume.test;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(10);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        new Main().operation1(random.toString(), false);
    }

    private static void operation1(String userid, boolean selectMock) {
//        boolean selectMock = false;
        Object lock = new Object();
        MybatisUtils table_a = new MybatisUtils();
        synchronized (lock) {
            if (table_a.selectData(userid, selectMock)) {
                table_a.updateData(userid, true);
            } else {
                table_a.insertData(userid, true);
            }
        }
    }

    private void operation2() {
//        LinkedList
    }

}

class MybatisUtils {

    public boolean selectData(String userid, boolean mockData) {
        System.out.println("select 1 from A where userid = " + userid);
        return mockData;
    }

    public boolean insertData(String userid, boolean mockData) {
        System.out.println("insert into A from A values (" + userid + "," + 0 + ")");
        return mockData;
    }

    public boolean updateData(String userid, boolean mockData) {
        System.out.println("update A set num = num + 1 where userid=" + userid);
        return mockData;
    }
}

class A {
    private String userid;
    private Integer num;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
}
