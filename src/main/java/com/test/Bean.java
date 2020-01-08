package com.test;

/**
 * Created by Administrator on 2018/9/20.
 */
public class Bean {
    private String s;
    private Long l;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Long getL() {
        return l;
    }

    public void setL(Long l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "s='" + s + '\'' +
                ", l=" + l +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(3366%32);
    }
}
