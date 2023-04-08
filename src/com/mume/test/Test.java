package com.mume.test;

import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
//        Deque
        DelayQueue delayQueue = new DelayQueue();
        ConcurrentLinkedDeque concurrentLinkedDeque = new ConcurrentLinkedDeque();

//        BlockingDeque
        BlockingDeque blockingDeque = new LinkedBlockingDeque();


//        Queue
        DelayQueue  delayQueue1 = new DelayQueue();
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        SynchronousQueue synchronousQueue = new SynchronousQueue();

//        BlockingDeque
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(2);
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();

        LinkedTransferQueue linkedTransferQueue = new LinkedTransferQueue();
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();



        SynchronousQueue<Integer> queue = new SynchronousQueue<Integer>();
        BlockingDeque eBlockingDeque = new LinkedBlockingDeque();
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        ConcurrentLinkedDeque concurrentLinkedDeque2 = new ConcurrentLinkedDeque();
//        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
    }
}
