package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname StackOperateTest
 * @Description TODO
 * @Date 2021/3/28 10:16
 */
public class StackOperateTest {

    public void print() {
        Object obj = new Object();
        String info = obj.toString();
        obj.toString();
    }

    public void foo() {
        bar();
    }

    public long bar() {
        return 0;
    }

    private long index = 0;

    public long nextIndex() {
        return index++;
    }
}
