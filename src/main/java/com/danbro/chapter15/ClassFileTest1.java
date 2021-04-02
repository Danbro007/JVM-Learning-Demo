package com.danbro.chapter15;

/**
 * @author Danrbo
 * @Classname ClassFileTest1
 * @Description TODO
 * @Date 2021/3/24 11:49
 */
public class ClassFileTest1 {
    public static void main(String[] args) {
        Integer x = 5;
        int y = 5;
        System.out.println(x == y);// 自动拆箱 true
        Integer i1 = 10;
        Integer i2 = 10;
        System.out.println(i1 == i2);// 在128~127范围内 true
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);// false
    }
}
