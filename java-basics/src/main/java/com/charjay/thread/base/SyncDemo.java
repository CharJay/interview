package com.charjay.thread.base;

/**
 * 全局锁
 * 对象锁
 * 代码块
 */
public class SyncDemo {
    public synchronized void demo(){
        synchronized (this){//对象锁

        }
    }

    public static void main(String[] args) {
        synchronized (SyncDemo.class){//SyncDemo静态变量是放在永久区域，所以是全局锁

        }
    }
}
