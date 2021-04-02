package com.danbro.chapter11;

/**
 * @author Danrbo
 * @Classname StringIntern01
 * @Description TODO intern() 方法测试1
 * @Date 2021/3/20 23:35
 */
public class StringIntern01 {
    public static void main(String[] args) {
        // 此时堆中和常量池中都有 "1"，不是同一个地址。
        // s1 指向的是堆中类型为String的“1”对象
        String s1 = new String("1");
        s1.intern();
        // s2 指向常量池中的 "1"
        String s2 = "1";
        // s1 指向的是堆中对象地址，s2指向的是常量池中 "1"的地址，不是同一个内存地址。
        System.out.println(s1 == s2);//false
        // 创建了两个String对象，但是由于这两个都是变量，由编译器使用StringBuilder
        // 使用 toString()相当于newString("11")返回给 s3,注意此时只有堆中有"11"，常量池还没有
        String s3 = new String("1") + new String("1");
        // 由于常量池中没有“11”，所以在常量池中创建“11”,但是由于堆中已经有"11"了，
        // 为了节约内存空间，加快字符串操作任务的执行速度，所以
        //把常量池的"11"把内存地址指向了堆中的"11"
        s3.intern();
        // s4 直接指向常量池中的"11"，由于之前我们已经把常量池中的"11"指向了堆中的"11"，
        // 所以 s3 == s4为true
        String s4 = "11";
        System.out.println(s3 == s4);//true
    }
}
