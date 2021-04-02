package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname ActiveUsingTest6
 * @Description TODO 父类会在子类之前初始化
 * @Date 2021/3/29 18:31
 */
public class ActiveUsingTest6 {
    public static void main(String[] args) {
        Son son = new Son();
    }
}

class Father{
    static {
        System.out.println("Father的初始化");
    }
}
class Son extends Father{
    static {
        System.out.println("Son的初始化");
    }
}

