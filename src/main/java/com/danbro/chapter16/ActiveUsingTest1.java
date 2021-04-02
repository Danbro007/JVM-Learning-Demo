package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname ActiveUsingTest1
 * @Description TODO new关键字导致类的初始化
 * @Date 2021/3/29 17:48
 */
public class ActiveUsingTest1 {
    public static void main(String[] args) {
        Test test = new Test();
    }

}

class Test {
    static {
        System.out.println("Test的初始化");
    }
}
