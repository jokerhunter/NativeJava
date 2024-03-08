package com.mume.Locks.ParameterMutexLock.DoranMutexLock;

import org.springframework.stereotype.Component;
import org.springframework.util.ConcurrentReferenceHashMap;

/**
 * @projectName: NativeJAVA
 * @author: Lucas
 * @description: MutexFactory
 * @date: 2024-03-07 23:38
 * @version: 1.0
 */

@Component
public class MutexFactory<K> {
    private ConcurrentReferenceHashMap<K, Object> map;

    public MutexFactory() {
        this.map = new ConcurrentReferenceHashMap<>();
    }

    public Object getMutex(K key) {
        return this.map.compute(key, (k, v) -> v == null ? new Object() : v);
    }
}
