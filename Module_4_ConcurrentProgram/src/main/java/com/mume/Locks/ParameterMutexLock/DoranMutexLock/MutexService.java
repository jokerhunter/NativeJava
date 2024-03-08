package com.mume.Locks.ParameterMutexLock.DoranMutexLock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.spec.RSAOtherPrimeInfo;

/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description: test MuteFactory service
 * @date: 2024-03-08 02:14
 * @version: 1.0
 */

@Component
public class MutexService {

    @Autowired
    private MutexFactory<String> mutexFactory;

    public void doSomething(String name) throws InterruptedException {
        synchronized(mutexFactory.getMutex(name)) {
            System.out.println("start mutex name:" + name);
            Thread.sleep(5000);
            System.out.println("end mutex name" + name);
        }
    }
}
