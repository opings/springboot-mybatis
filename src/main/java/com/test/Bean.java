package com.test;

import com.SpringbootMybatisApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import sun.misc.Contended;

import javax.annotation.PostConstruct;

/**
 * Created by Administrator on 2018/9/20.
 */
@Component
public class Bean {
    private String s;
    private Long l;

    @PostConstruct
    public Bean Bean() {
        Bean bean = new Bean();
        bean.setL(55L);
        bean.setS("sssss");
        return bean;
    }

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

//    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ApplicationContext(SpringbootMybatisApplication.main(););
//
//
//
////        System.out.println(3366%32);
//    }
}
