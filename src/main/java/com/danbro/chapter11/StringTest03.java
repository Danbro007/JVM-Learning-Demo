package com.danbro.chapter11;

import org.junit.Test;

/**
 * @author Danrbo
 * @Classname StringTest03
 * @Description TODO
 * @Date 2021/3/20 22:50
 */
public class StringTest03 {
    @Test
    public void test1() {
        // “a”、"b"和"c" 都是常量，所以编译器在编译的时候会优化成"abc"
        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
    }

    @Test
    public void test2() {
        String s1 = "Java";
        String s2 = "Hadoop";
        String s3 = "JavaHadoop";
        String s4 = "Java" + "Hadoop";
        String s5 = s1 + "Hadoop";
        String s6 = "Java" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4);// true
        System.out.println(s3 == s5);// false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println(s6 == s7);//false
    }

    @Test
    public void test3() {
        String s1 = "a";
        String s2 = "b";
        String s3 = "ab";
        // 两个变量的拼接底层是StringBuilder,
        // 拼接完毕后通过使用StringBuilder.toString()创建String对象返回给s4
        String s4 = s1 + s2;
        System.out.println(s3 == s4);//false
    }

    @Test
    public void test4() {
        final String s1 = "a";
        final String s2 = "b";
        String s3 = "ab";
        String s4 = s1 + s2;
        System.out.println(s3 == s4);//true
    }
}
