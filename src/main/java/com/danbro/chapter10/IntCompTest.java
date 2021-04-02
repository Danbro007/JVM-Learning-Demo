package com.danbro.chapter10;

/**
 * @author Danrbo
 * @Classname IntCompTest
 * @Description TODO 测试编译器和解释器的执行效率
 * @Date 2021/3/20 13:56
 */
public class IntCompTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        test(1000000);
        long end = System.currentTimeMillis();
        System.out.println("花费时间为：" + (end - start));
    }

    private static void test(int count) {
        for (int i = 0; i < count; i++) {
            // 计算100以内的质数
            label:
            for (int j = 2; j <= 100; j++) {
                for (int k = 2; k <= Math.sqrt(j); k++) {
                    if (j % k == 0) {
                        continue label;
                    }
                }
            }
        }
    }
}
