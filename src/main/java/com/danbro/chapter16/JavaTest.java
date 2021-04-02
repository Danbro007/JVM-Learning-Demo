package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname JavaTest
 * @Description TODO
 * @Date 2021/3/25 14:25
 */
public class JavaTest {
    private int num;
    boolean flag;
    protected char gender;
    public String info;
    public static final int COUNTS = 1;

    static {
        String url = "www.danbro.com";
    }

    {
        info = "java";
    }

    public JavaTest() {
    }

    private JavaTest(boolean flag) {
        this.flag = flag;
    }

    private void methodPrivate() {
    }

    int getNum(int i) {
        return num + i;
    }

    protected char showGender() {
        return gender;
    }

    public void showInfo() {
        int i = 10;
        System.out.println(info + i);
    }




}
