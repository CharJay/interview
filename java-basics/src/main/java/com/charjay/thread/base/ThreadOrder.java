package com.charjay.thread.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 如何控制线程的执行顺序
 * 1.通过join方法去保证多线程的顺序性的特性
 *   join的原理：调用Object()的wait方法 阻塞主线程！不是阻塞t1线程！
 * 2. Executors.newSingleThreadExecutor(); 把线程按队列 FIFO 方式执行
 */
public class ThreadOrder {

    static class Thread1 extends Thread{
        @Override
        public void run() {
            System.out.println("Thread1");
        }
    }
    static class Thread2 extends Thread{
        @Override
        public void run() {
            System.out.println("Thread2");
        }
    }
    static class Thread3 extends Thread{
        @Override
        public void run() {
            System.out.println("Thread3");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //方法1 join
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();

        //方法2 Executors.newSingleThreadExecutor()
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(t1);
        executorService.submit(t2);
        executorService.submit(t3);
        executorService.shutdown();
    }



}
