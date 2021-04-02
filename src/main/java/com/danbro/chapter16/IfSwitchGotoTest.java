package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname IfSwitchGotoTest
 * @Description TODO
 * @Date 2021/3/28 12:10
 */
public class IfSwitchGotoTest {

    public void compare1() {
        int a = 0;
        if (a == 0) {
            a = 10;
        } else {
            a = 20;
        }
    }

    public boolean compareNull(String str) {
        if (str == null) {
            return true;
        } else {
            return false;
        }
    }

    public void ifCompare1() {
        int i = 10;
        int j = 20;
        System.out.println(i < j);
    }

    public void ifCompare2() {
        short s1 = 9;
        byte b1 = 10;
        System.out.println(s1 > b1);
    }

    public void ifCompare3() {
        Object o1 = new Object();
        Object o2 = new Object();
        System.out.println(o1 == o2);
        System.out.println(o1 != o2);
    }
}
