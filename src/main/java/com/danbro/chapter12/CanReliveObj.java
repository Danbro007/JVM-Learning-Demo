package com.danbro.chapter12;

/**
 * @author Danrbo
 * @Classname CanReliveObj
 * @Description TODO 演示收集对象，当被回收时会执行 finalize() 方法
 * @Date 2021/3/22 11:27
 */
public class CanReliveObj {
    /**
     * 类变量，属于 GcRoots 一部分
     */
    public static CanReliveObj obj;

    public static void main(String[] args) {
        try {
            obj = new CanReliveObj();
            System.out.println("第一次GC");
            obj = null;
            // 第一次GC时会执行 finalize() 方法
            System.gc();
            // finalizer 线程优先级很低，等待finalizer线程执行。
            Thread.sleep(2000);
            if (obj == null) {
                System.out.println("obj 已经被回收了");
            } else {
                System.out.println("obj 又复活了");
            }
            System.out.println("第二次GC");
            obj = null;
            // 第二次GC时由于之前执行过 finalize() 方法了，则这次直接被回收掉了。
            System.gc();
            if (obj == null) {
                System.out.println("obj 已经被回收了");
            } else {
                System.out.println("obj 又复活了");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * finalize() 方法
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("执行finalize方法");
        obj = this;
    }
}
