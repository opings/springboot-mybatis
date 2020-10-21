package com.test.example.demo.asyn;

import java.util.concurrent.Callable;

/**
 * Created by Administrator on 2018/12/18.
 */
public class AsynWork1 implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("AsynWork start");
        Thread.sleep(1000);
        System.out.println("AsynWork end");
        return "111";
    }
}
