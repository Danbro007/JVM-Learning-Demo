package com.danbro.chapter16;

import java.util.Random;

/**
 * @author Danrbo
 * @Classname ActiveUsingTest7
 * @Description TODO
 * @Date 2021/3/29 18:34
 */
public class ActiveUsingTest7 {
    public static void main(String[] args) {
        // 只会让InterfaceB接口初始化不会让父类接口也初始化
        System.out.println(InterfaceB.NUM);
    }
}

interface InterfaceA {

    public static final Thread t = new Thread() {
        {
            System.out.println("InterfaceA的初始化");
        }
    };
}

interface InterfaceB extends InterfaceA {
    public static final Thread t = new Thread() {
        {
            System.out.println("InterfaceB的初始化");
        }
    };

    static int NUM = new Random().nextInt();
}
