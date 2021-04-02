package com.danbro.chapter05;

/**
 * @author Danrbo
 * @Classname ReturnAddressTest
 * @Description TODO
 * @Date 2021/3/14 21:45
 */
public class ReturnAddressTest {
    public void method1(){
        System.out.println("method1");
    }

    public void method2(){
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
