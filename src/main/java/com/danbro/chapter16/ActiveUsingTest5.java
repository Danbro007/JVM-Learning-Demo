package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname ActiveUsingTest5
 * @Description TODO
 * @Date 2021/3/29 18:28
 */
public class ActiveUsingTest5 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.danbro.chapter16.ReflectClass");
    }
}

class ReflectClass {
    static {
        System.out.println("ReflectClass的初始化");
    }
}