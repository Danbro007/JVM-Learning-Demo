package com.danbro.chapter16;

import org.junit.Test;

/**
 * @author Danrbo
 * @Classname ArithmeticTest
 * @Description TODO
 * @Date 2021/3/25 22:13
 */
public class ArithmeticTest {

    @Test
    public void test1() {
        double d = 0.0;
        System.out.println(1 / d);//Infinity
    }

    @Test
    public void test2() {
        double d1 = 0.0;
        double d2 = 0.0;
        System.out.println(d1 / d2);//not a number
    }


}
