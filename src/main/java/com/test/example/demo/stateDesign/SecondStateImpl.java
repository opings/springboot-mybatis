package com.test.example.demo.stateDesign;

/**
 * Created by yongzhen.zhao on 2018/8/20.
 */
public class SecondStateImpl implements IPackageState {
    @Override
    public void next(Package pkg) {
        pkg.setState(new ThirdStateImpl());
    }

    @Override
    public void previous(Package pkg) {
        pkg.setState(new FirstStateImpl());
    }

    @Override
    public void print() {
        System.out.println("我是第二个状态");
    }
}
