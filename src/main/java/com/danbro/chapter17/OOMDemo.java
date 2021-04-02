package com.danbro.chapter17;

import lombok.Data;

import java.util.ArrayList;
import java.util.Properties;
import java.util.Random;

/**
 * @author Danrbo
 * @Classname JstatDemo
 * @Description TODO -Xms20m -Xmx20m
 * @Date 2021/3/31 10:10
 */
public class OOMDemo {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Picture> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            byte[] data = new byte[new Random().nextInt(100 * 50)];
            list.add(new Picture(data));
            Thread.sleep(200);
        }
    }
}
@Data
class Picture {
    private byte[] data;

    public Picture(byte[] data) {
        this.data = data;
    }
}