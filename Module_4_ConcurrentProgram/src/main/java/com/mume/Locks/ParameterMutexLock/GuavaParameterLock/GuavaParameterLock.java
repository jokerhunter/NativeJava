package com.mume.Locks.ParameterMutexLock.GuavaParameterLock;

import com.google.common.util.concurrent.Striped;

import java.util.concurrent.locks.Lock;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description: how-to-acquire-a-lock-by-a-key
 * https://stackoverflow.com/questions/11124539/how-to-acquire-a-lock-by-a-key
 * @date: 2024-03-09 01:55
 * @version: 1.0
 */
public class GuavaParameterLock {

    public static void main(String[] args) {
//        Striped<Lock> locks = Striped.lock(stripes);
//        Lock l = locks.get(string);
//        l.lock();
//        try {
//            // do stuff
//        } finally {
//            l.unlock();
//        }
    }

    private void lockByKey(String key) {
        Striped<Lock> locks = Striped.lock(Integer.parseInt(key));
        Lock l = locks.get(key);
        l.lock();
        try {
            // do stuff
        } finally {
            l.unlock();
        }
    }

}
