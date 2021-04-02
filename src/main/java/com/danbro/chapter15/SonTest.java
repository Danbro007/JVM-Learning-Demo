package com.danbro.chapter15;


/**
 * @author Danrbo
 * @Classname SonTest
 * @Description TODO
 * @Date 2021/3/24 12:15
 */
public class SonTest {
    public static void main(String[] args) {
        Father f = new Son();
        System.out.println(f.x);
    }
}

class Father {

    int x = 10;

    public Father() {
        this.print();
        x = 20;
    }

    public void print() {
        System.out.println("Father.x = " + x);
    }
}

class Son extends Father {
    {
        System.out.println("son代码块");
    }
    int x = 30;

    public Son() {
        this.print();
        x = 40;
    }

    @Override
    public void print() {
        System.out.println("Son.x = " + x);
    }
}