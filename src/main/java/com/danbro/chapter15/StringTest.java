package com.danbro.chapter15;

/**
 * @author Danrbo
 * @Classname StringTest
 * @Description TODO
 * @Date 2021/3/24 12:09
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("hello") +new String("world");
        String str2 = "helloworld";
        System.out.println(str1 == str2);
    }
}
