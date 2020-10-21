package com.test.example.demo.concurrentTool;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *  如果有其中一个线程没有执行 exgr.exchange(A);，另一个线程会等待。
 *
 * Created by yongzhen.zhao on 2018/8/20.
 */
public class ExchangerTest4Me {

    private static final Exchanger<String> exgr = new Exchanger<>();
    private static ExecutorService threadPool = Executors.newFixedThreadPool(2);


    public static void main(String[] args) {

        threadPool.execute(new Runnable() {     // execute没有返回值，submit有返回值
            @Override
            public void run() {
                String A = "银行流水A";     // A录入银行流水数据
                try {
                    Thread.sleep(1000);
                    System.out.println("AAA");
                    exgr.exchange(A);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadPool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("BBB");
                    String B = "银行流水B";         // B录入银行流水数据
                    String A = exgr.exchange("B");
                    System.out.println("A和B数据是否一致：" + A.equals(B) + "，A录入的是："
                            + A + "，B录入是：" + B);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        threadPool.shutdown();
    }

}
