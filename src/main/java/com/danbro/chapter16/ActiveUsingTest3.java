package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname ActiveUsingTest3
 * @Description TODO 使用类的静态方法会导致类的初始化
 * @Date 2021/3/29 18:10
 */
public class ActiveUsingTest3 {
    public static void main(String[] args) {
        TestClass.method();
    }
}

class TestClass{
    static {
        System.out.println("TestClass的初始化");
    }

    public static void method(){
        System.out.println("TestClass的静态方法");
    }
}
