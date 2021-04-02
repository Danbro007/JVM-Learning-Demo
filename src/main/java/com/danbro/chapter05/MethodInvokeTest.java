package com.danbro.chapter05;

/**
 * @author Danrbo
 * @Classname MethodInvokeTest
 * @Description TODO 方法调用测试
 * @Date 2021/3/14 21:55
 */
public class MethodInvokeTest {
    public static void method1() {
        System.out.println("method1");
    }

    public MethodInvokeTest() {
    }

    public void handleEat(Animal animal) {
        animal.eat();
    }
    public void doSomething(){
        System.out.println("test1");
    }

}

interface Animal {
    void eat();
}
