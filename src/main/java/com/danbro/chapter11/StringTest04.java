package com.danbro.chapter11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Danrbo
 * @Classname StringTest4
 * @Description TODO 测试使用 + 符号和StringBuilder的append追加字符串的效率
 * @Date 2021/3/20 23:26
 */
public class StringTest04 {
    private long startTime = 0l;

    @Before
    public void doStart() {
        startTime = System.currentTimeMillis();
    }

    @Test
    public void test1() {
        String src = "";
        for (int i = 0; i < 100000; i++) {
            src = src + "a";//5660
        }
    }

    @Test
    public void test2() {
        StringBuilder src = new StringBuilder("");
        for (int i = 0; i < 100000; i++) {
            src = src.append("a");// 13
        }
    }

    @After
    public void doEnd() {
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
