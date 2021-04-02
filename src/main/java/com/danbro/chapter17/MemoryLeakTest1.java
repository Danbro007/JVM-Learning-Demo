package com.danbro.chapter17;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Danrbo
 * @Classname MemoryLeakTest1
 * @Description TODO 静态集合类的内存泄露
 * @Date 2021/4/2 12:08
 */
public class MemoryLeakTest1 {
    static List<Object> list = new ArrayList();

    public static void main(String[] args) {
        Object o = new Object();
        list.add(o);
    }
}
