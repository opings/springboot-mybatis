package com.example.demo.stateDesign;

/**
 * Created by yongzhen.zhao on 2018/8/20.
 */
public class ThirdStateImpl implements IPackageState {
    @Override
    public void next(Package pkg) {
        System.out.println("我是第三状态，后面没有状态了");
    }

    @Override
    public void previous(Package pkg) {
        pkg.setState(new SecondStateImpl());
    }

    @Override
    public void print() {
        System.out.println("我是第三个状态");
    }
}
