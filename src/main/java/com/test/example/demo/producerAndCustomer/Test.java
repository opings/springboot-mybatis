package com.test.example.demo.producerAndCustomer;

/**
 * Created by yongzhen.zhao on 2018/8/21.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Storage storage = new Storage();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                storage.produce("thread1");
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                storage.produce("thread2");
            }
        });

        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                storage.consume("thread3");
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();


//        Thread.sleep(5000);
//        System.out.println("finish");
    }
}
