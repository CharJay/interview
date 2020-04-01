package com.charjay.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        Executors.defaultThreadFactory();
        Executors.newFixedThreadPool(10);
        new ReentrantLock();
        CountDownLatch countDownLatch = new CountDownLatch(2);
        countDownLatch.countDown();
    }
}
