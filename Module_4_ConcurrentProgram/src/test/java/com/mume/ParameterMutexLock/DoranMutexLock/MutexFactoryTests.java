package com.mume.ParameterMutexLock.DoranMutexLock;

import com.mume.Locks.ParameterMutexLock.DoranMutexLock.MutexFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import static org.awaitility.Awaitility.await;


/**
 * @projectName: NativeJava
 * @author: Lucas
 * @description: TODO
 * @date: 2024-03-08 02:33
 * @version: 1.0
 */
public class MutexFactoryTests {
    private final int THREAD_COUNT = 16;

    @Test
    public void singleKeyTest() {
        MutexFactory<String> mutexFactory = new MutexFactory<>();
        String id = UUID.randomUUID().toString();
        final int[] count = {0};

        IntStream.range(0, THREAD_COUNT)
                .parallel()
                .forEach(i -> {
                    synchronized (mutexFactory.getMutex(id)) {
                        count[0]++;
                    }
                });
        await().atMost(5, TimeUnit.SECONDS)
                .until(() -> count[0] == THREAD_COUNT);
        Assert.assertEquals(count[0], THREAD_COUNT);
    }
}
