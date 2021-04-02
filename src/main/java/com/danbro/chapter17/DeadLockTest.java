package com.danbro.chapter17;

/**
 * @author Danrbo
 * @Classname DeadLockTest
 * @Description TODO
 * @Date 2021/3/31 16:23
 */
public class DeadLockTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        new Thread(() -> {
            synchronized (s1) {
                s1.append("1");
                s1.append("2");

                try {
                    Thread.sleep(1000);
                    synchronized (s2) {
                        s2.append("3");
                        s2.append("4");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            synchronized (s2) {
                s1.append("1");
                s1.append("2");
                try {
                    Thread.sleep(1000);
                    synchronized (s1) {
                        s2.append("3");
                        s2.append("4");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
