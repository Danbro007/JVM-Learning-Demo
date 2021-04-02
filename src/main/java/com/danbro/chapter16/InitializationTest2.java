package com.danbro.chapter16;

import java.util.Random;

/**
 * @author Danrbo
 * @Classname InitializationTest2
 * @Description TODO
 * @Date 2021/3/29 13:02
 */
public class InitializationTest2 {
    // 在初始化阶段被赋值
    public static int a = 1;
    // 在准备阶段被赋值
    public static final int INT_CONSTANT = 10;

    //在初始化阶段赋值
    public static final Integer INTEGER_CONSTANT1 = Integer.valueOf(100);
    //在初始化阶段赋值
    public static Integer INTEGER_CONSTANT2 = Integer.valueOf(200);

    //在准备阶段赋值
    public static final String str1 = "java";
    //在初始化阶段赋值
    public static final String str2 = new String("hello");
    // 在初始化阶段赋值
    public static final int m = new Random().nextInt();
}
