package com.test.example.demo.producerAndCustomer;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by yongzhen.zhao on 2018/8/21.
 */
public class Storage {

    // 仓库最大存储量
    private final int MAX_SIZE = 100;

    // 仓库存储的载体
    private LinkedBlockingQueue<Object> queue = new LinkedBlockingQueue<>(10);

    // 生产产品
    public  void produce(String producer) {
        // 如果仓库已满
        if (queue.size() == MAX_SIZE) {
            System.out.println("仓库已满，【" + producer + "】： 暂时不能执行生产任务!");
        }

        // 生产产品
        try {
            queue.put(new Object());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("【" + producer + "】：生产了一个产品\t【现仓储量为】:" + queue.size());
    }

    // 消费产品
    public  void consume(String consumer) {
        // 如果仓库存储量不足
        if (queue.size() == 0) {
            System.out.println("仓库已空，【" + consumer + "】： 暂时不能执行消费任务!");
        }

        try {
            queue.take();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("【" + consumer + "】：消费了一个产品\t【现仓储量为】:" + queue.size());

    }

    public LinkedBlockingQueue<Object> getList() {
        return queue;
    }

    public void setList(LinkedBlockingQueue<Object> list) {
        this.queue = list;
    }
    public int getMAX_SIZE() {
        return MAX_SIZE;
    }
}
