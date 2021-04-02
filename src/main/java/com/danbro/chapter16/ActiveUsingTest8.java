package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname ActiveUsingTest8
 * @Description TODO
 * @Date 2021/3/29 18:51
 */
public class ActiveUsingTest8 {
    public static void main(String[] args) {
        System.out.println(D.NUM);
    }
}
interface InterfaceC{
    public static final Thread t = new Thread() {
        {
            System.out.println("InterfaceC的初始化");
        }
    };
    default void method(){
        System.out.println("InterfaceC 的 method 方法被调用");
    }
}

class D implements InterfaceC{
    static {
        System.out.println("D的初始化");
    }
    public static int NUM = 2;
}