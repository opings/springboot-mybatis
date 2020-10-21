package com.test.example.demo.observerDesign;


import java.util.ArrayList;
import java.util.List;

public class Subject {


    //保存注册的观察者对象
    private List<Observer> mObervers = new ArrayList<>();

    //注册观察者对象
    public void attach(Observer observer) {
        mObervers.add(observer);
        System.out.println("attach an observer");
//        Log.e("SZH", "attach an observer");
    }

    //注销观察者对象
    public void detach(Observer observer) {
        mObervers.remove(observer);
        System.out.println("detach an observer");
//        Log.e("SZH", "detach an observer");
    }

    //通知所有注册的观察者对象
    public void notifyEveryOne(String newState) {
        for (Observer observer : mObervers) {
            observer.update(newState);
        }
    }
}