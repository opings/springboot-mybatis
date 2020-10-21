package com.test.example.execl.bug;

import com.alibaba.fastjson.JSON;

/**
 * Created by Administrator on 2019/2/28.
 */
public class B extends A{
    private String id1;

    private String name1;

    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public static void main(String[] args) {

        B b = new B();
        b.setId("1");
        b.setName("2");
        b.setId1("3");
        b.setName1("4");
        Object o = JSON.toJSON(b);

        System.out.println(o);


    }

}
