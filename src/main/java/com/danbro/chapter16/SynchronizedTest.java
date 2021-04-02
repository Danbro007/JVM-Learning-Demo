package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname SynchronizedTest
 * @Description TODO
 * @Date 2021/3/29 11:13
 */
public class SynchronizedTest {


    public synchronized void method1() {
    }


    private int i = 0;
    private Object object = new Object();

    public void method2() {
        synchronized (object) {
            i++;
        }
    }
}
