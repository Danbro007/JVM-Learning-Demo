package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname InitializationTest
 * @Description TODO 演示哪些场景下不会执行类的初始化
 * @Date 2021/3/29 12:54
 */
public class InitializationTest1 {
    /**
     * 对于非静态变量，不管有没有显式的赋值都不会不会执行类的<clinit>方法
     */
    public int i = 1;

    /**
     * 静态字段没有显式的赋值不会执行类的<clinit>方法
     */
    public static int j;

    /**
     * 被 final 修饰的静态基本数据类型字段在准备阶段就被赋值了，所以也不会在类的<clinit>方法里执行。
     */
    public static final int a = 1;

}
