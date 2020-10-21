package com.test.example.demo.stateDesign;

/**
 * Created by yongzhen.zhao on 2018/8/20.
 */
public class StateDesignTest {

    public static void main(String[] args) {
        Package aPackage = new Package();
        aPackage.printState();

        aPackage.nextState();
        aPackage.printState();

        aPackage.nextState();
        aPackage.printState();

        aPackage.nextState();
        aPackage.printState();



      /* ******************************************* */


        aPackage.previousSate();
        aPackage.printState();

        aPackage.previousSate();
        aPackage.printState();

        aPackage.previousSate();
        aPackage.printState();

        aPackage.previousSate();
        aPackage.printState();




    }
}
