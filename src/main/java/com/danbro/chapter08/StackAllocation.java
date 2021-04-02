package com.danbro.chapter08;

/**
 * @author Danrbo
 * @Classname StackAllocation
 * @Description TODO 栈上分配
 *
 * 未开启逃逸分析
 * -Xmx1G -Xms1G -XX:+PrintGCDetails -XX:-DoEscapeAnalysis
 *
 * 开启逃逸分析
 * -Xmx1G -Xms1G -XX:+PrintGCDetails -XX:+DoEscapeAnalysis
 *
 * 堆空间变小并开启逃逸分析
 * -Xmx256M -Xms256M -XX:+PrintGCDetails -XX:+DoEscapeAnalysis
 * 堆空间变小并关闭逃逸分析
 * -Xmx256M -Xms256M -XX:+PrintGCDetails -XX:-DoEscapeAnalysis
 * @Date 2021/3/17 10:01
 */
public class StackAllocation {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            alloc();
        }
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为：" + (end - start) + "ms");
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void alloc() {
        // 未发生逃逸，在栈上分配。
        User user = new User();
    }

    static class User {
    }


}
