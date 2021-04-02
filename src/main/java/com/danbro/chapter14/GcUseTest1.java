package com.danbro.chapter14;

import java.util.ArrayList;

/**
 * @author Danrbo
 * @Classname GcUseTest1
 * @Description TODO -XX:+PrintCommandLineFlags -XX:+UseSerialGC
 * @Date 2021/3/23 11:23
 */
public class GcUseTest1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<byte[]> arrayList = new ArrayList<>();
        while (true){
            byte[] bytes = new byte[100];
            arrayList.add(bytes);
            Thread.sleep(10);
        }
    }
}
