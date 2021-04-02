package com.danbro.chapter08;

/**
 * @author Danrbo
 * @Classname ScalarReplace
 * @Description TODO 标量替换
 * 关闭标量替换并开启逃逸分析
 * -Xms100m -Xmx100m -XX:+PrintGC -XX:+DoEscapeAnalysis -XX:-EliminateAllocations
 * 开启标量替换并开启逃逸分析
 * -Xms100m -Xmx100m -XX:+PrintGC -XX:+DoEscapeAnalysis -XX:+EliminateAllocations
 *
 * @Date 2021/3/17 10:48
 */
public class ScalarReplace {
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
        user.id = 5;
        user.name="danbro";
    }

    static class User {
        public int id;
        public String name;
    }
}
