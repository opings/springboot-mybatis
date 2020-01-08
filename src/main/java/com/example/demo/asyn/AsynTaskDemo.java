package com.example.demo.asyn;

import com.example.demo.asyn.AsynWork1;
import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2018/12/18.
 */
public class AsynTaskDemo {

    private static ExecutorService threadPool = Executors.newFixedThreadPool(10);

    public String asynWork1() throws ExecutionException, InterruptedException {
        Future<String> submit = threadPool.submit(new AsynWork1());
        System.out.println("asynWork1");
        return submit.get();
    }

    public void asynWork2() throws ExecutionException, InterruptedException {
        threadPool.execute(new AsynWork2());

    }


    @Test
    public void test1() throws InterruptedException, ExecutionException {

        String s = asynWork1();
//        if ("111".equalsIgnoreCase(s)) {
//            System.out.println("ok");
//        }
//        Thread.sleep(1000);
        System.out.println("end");
    }

    @Test
    public void test2() throws ExecutionException, InterruptedException {
        asynWork2();
        System.out.println("end");

    }

}
