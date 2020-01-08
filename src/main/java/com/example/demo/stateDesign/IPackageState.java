package com.example.demo.stateDesign;

/**
 * Created by yongzhen.zhao on 2018/8/20.
 */
public interface IPackageState {

    /**
     *  转换成包裹的下一状态
     * @param pkg 包裹
     */
    void next(Package pkg);

    /**
     * 转换成包裹的下一状态
     * @param pkg 包裹
     */
    void previous(Package pkg);

    /**
     * 打印包裹状态
     */
    void print();
}
