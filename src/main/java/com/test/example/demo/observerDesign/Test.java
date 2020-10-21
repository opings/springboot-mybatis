package com.test.example.demo.observerDesign;

/**
 * Created by Administrator on 2019/8/9.
 */
public class Test {

    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();

        concreteSubject.attach(new ObserverA());
        concreteSubject.attach(new ObserverB());
        concreteSubject.attach(new ObserverC());

        concreteSubject.change("ok");

        concreteSubject.change("no ok");

    }

}
