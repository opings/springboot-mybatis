package com.example.demo.stateDesign;

/**
 * Created by yongzhen.zhao on 2018/8/20.
 */
public class Package {
    IPackageState state = new FirstStateImpl();

    public IPackageState getState() {
        return state;
    }

    public void setState(IPackageState state) {
        this.state = state;
    }


    /**
     * 转换成包裹的下一状态
     */
    public void nextState() {
        state.next(this);
    }

    /**
     *  转换成包裹的上一状态
     */
    public void previousSate() {
        state.previous(this);
    }

    /**
     * 打印包裹状态
     */
    public void printState() {
        state.print();
    }



}
