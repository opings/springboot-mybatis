package com.test.example.demo.stateDesign;

/**
 * Created by yongzhen.zhao on 2018/8/20.
 */
public class FirstStateImpl implements IPackageState{
    @Override
    public void next(Package pkg) {
        pkg.setState(new SecondStateImpl());
    }

    @Override
    public void previous(Package pkg) {
        System.out.println("我是第一个状态，没有上一个状态了");
    }

    @Override
    public void print() {
        System.out.println("我是第一个状态");
    }
}
