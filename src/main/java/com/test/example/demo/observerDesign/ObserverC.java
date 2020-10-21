package com.test.example.demo.observerDesign;

public class ObserverC implements Observer {
    //观察者状态
    private String observerState;

    @Override
    public void update(String newState) {
        //更新观察者状态，让它与目标状态一致
        observerState = newState;
        System.out.println("接收到消息：" + newState + "；我是C模块，快来抢吧！！");
//        Log.e("SZH", "接收到消息：" + newState + "；我是C模块，快来抢吧！！");
    }
}