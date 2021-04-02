package com.danbro.chapter16;

import org.junit.Test;

import java.util.Random;

/**
 * @author Danrbo
 * @Classname ActiveUsingTest4
 * @Description TODO
 * @Date 2021/3/29 18:13
 */
public class ActiveUsingTest4 {
    static {
        System.out.println("类的初始化");
    }

    public static int i = 1;
    public static final int j = 2;

    //静态变量 i 在准备阶段是被初始化赋值，在初始化阶段才会赋值。
    @Test
    public void test1() {
        System.out.println(ActiveUsingTest4.i);
    }

    // 静态变量j在准备阶段就被赋值了，不会导致类的初始化。
    @Test
    public void test2() {
        System.out.println(ActiveUsingTest4.j);
    }

    @Test
    public void test3() {
        // 不会执行类的初始化
        System.out.println(Do.num1);
    }

    @Test
    public void test4() {
        // 会执行类的初始化
        System.out.println(Do.num2);
    }


}


interface Do {
    public static final Thread t = new Thread() {
        {
            System.out.println("接口初始化");
        }
    };
    public final static int num1 = 1;
    public final static int num2 = new Random().nextInt(10);
}