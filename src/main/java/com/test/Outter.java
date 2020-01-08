package com.test;

/**
 * Created by Administrator on 2019/1/29.
 */
public class Outter {

    public static void main(String[] args) {
        Outter outter = new Outter();

        outter.qqq("123");

    }

    public void qqq(String str) {
        new Runnable() {
            @Override
            public void run() {
                System.out.println(str);

            }
        };
    }



}
