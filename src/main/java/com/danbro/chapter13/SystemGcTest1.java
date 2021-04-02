package com.danbro.chapter13;

/**
 * @author Danrbo
 * @Classname SystemGcTest1
 * @Description TODO 测试 SystemGC
 * @Date 2021/3/22 15:07
 */
public class SystemGcTest1 {
    public static void main(String[] args) {
        new SystemGcTest1();
        // 手动GC，可能不会执行GC
        System.gc();
        // 一定会调用失去引用的finalize()方法
        System.runFinalization();
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("执行了finalize方法");
    }
}
