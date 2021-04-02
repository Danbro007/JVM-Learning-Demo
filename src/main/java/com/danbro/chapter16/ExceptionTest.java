package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname ExceptionTest
 * @Description TODO
 * @Date 2021/3/28 14:02
 */
public class ExceptionTest {
    public void throwZero(int i) throws RuntimeException {
        if (i == 0) {
            throw new RuntimeException("i为0");
        }
    }

    public static String func() {
        String str = "hello";
        try {
            // 返回的还是"hello"的内存地址
            return str;
        } finally {
            // 在这里会复制一份str指向的字符串内存地址，然后把这个内存地址修改为"java"的地址
            str = "java";
        }
    }

    public static void main(String[] args) {
        String func = func();
        System.out.println(func);
    }
}
