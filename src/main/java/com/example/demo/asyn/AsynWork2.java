package com.example.demo.asyn;

/**
 * Created by Administrator on 2018/12/18.
 */
public class AsynWork2 implements Runnable {
    @Override
    public void run() {
        System.out.println("AsynWork start");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("AsynWork end");

    }
}
