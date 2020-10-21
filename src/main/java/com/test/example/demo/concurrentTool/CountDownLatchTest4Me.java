package com.test.example.demo.concurrentTool;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch可以让等待多线程完成
 *
 * Created by yongzhen.zhao on 2018/8/20.
 */
public class CountDownLatchTest4Me {

    public static void main(String[] args) throws InterruptedException {
//        joinTest();
        countDownLatchTest();
    }


    /**
     * 1，2线程完成后，主线程才能完成
     *
     * @throws InterruptedException
     */
    public static void joinTest() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            System.out.println("thread1");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("thread2");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("finish");

    }


    /**
     * CountDownLatch为0时，主线程才能完成
     *
     * @throws InterruptedException
     */
    public static void countDownLatchTest() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Thread thread1 = new Thread(() -> {
            System.out.println("thread1");
            countDownLatch.countDown();     // countDownLatch会减一
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("thread2");
            countDownLatch.countDown();     // countDownLatch会减一
        });

        thread1.start();
        thread2.start();

        countDownLatch.await();

        System.out.println("finish");
    }

}
