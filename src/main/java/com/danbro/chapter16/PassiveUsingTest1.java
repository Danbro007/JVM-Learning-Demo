package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname PassiveUsingTest1
 * @Description TODO 被动使用
 * @Date 2021/3/29 19:51
 */
public class PassiveUsingTest1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 子类引用父类的静态变量
        System.out.println(Child.num);

        //此时类不会初始化
        Parent[] parents = new Parent[10];
        // 此时会进行类的初始化
        parents[0] = new Parent();
        ClassLoader.getSystemClassLoader().loadClass("com.danbro.chapter16.Parent");
    }
}

class Parent{
    static {
        System.out.println("Parent的初始化");
    }
    public static int num =1;
}

class Child extends Parent{
    static {
        System.out.println("Son的初始化");
    }
}