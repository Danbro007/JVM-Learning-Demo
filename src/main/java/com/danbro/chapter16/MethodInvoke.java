package com.danbro.chapter16;

import org.junit.Test;

import java.util.Date;

/**
 * @author Danrbo
 * @Classname MethodInvoke
 * @Description TODO
 * @Date 2021/3/26 14:28
 */
public class MethodInvoke {

    @Test
    public void test1() {
        // 执行init犯法
        Date date = new Date();
        Thread t1 = new Thread();
        // 调用父类方法
        super.toString();
        // 调用私有方法
        privateMethod1();
    }

    private void privateMethod1() {
    }

    @Test
    public void test2() {
        staticMethod1();
    }

    public static void staticMethod1() {
    }

    @Test
    public void test3() {
        // init方法
        Thread t1 = new Thread();
        // 执行接口的方法
        ((Runnable) t1).run();

        Comparable<Integer> com = null;
        // 执行接口的方法
        com.compareTo(123);
    }

    @Test
    public void test4(){
        Thread t1 = new Thread();
        t1 = null;
        ((Runnable)t1).run();
    }

}
