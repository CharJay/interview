package com.charjay.thread.base;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadLocalDate {
    private static ThreadLocal<SimpleDateFormat> dateFormatThreadLocal = new ThreadLocal<SimpleDateFormat>() {
        @Override
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Date date = new Date();
                System.out.println(dateFormatThreadLocal.get().format(date));
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Date date = new Date();
                System.out.println(dateFormatThreadLocal.get().format(date));
            }
        });
        thread1.start();
        thread2.start();
    }

}
