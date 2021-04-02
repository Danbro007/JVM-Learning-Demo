package com.danbro.chapter11;


import org.junit.Test;

/**
 * @author Danrbo
 * @Classname StringTest02
 * @Description TODO
 * @Date 2021/3/20 22:20
 */
public class StringTest02 {
    @Test
    public void test1() {
        String str1 = "a" + "b" + "c";
        String str2 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

    @Test
    public void test2() {
    }
}
