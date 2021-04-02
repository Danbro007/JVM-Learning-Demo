package com.danbro.chapter16;

/**
 * @author Danrbo
 * @Classname SwitchTest
 * @Description TODO
 * @Date 2021/3/28 12:55
 */
public class SwitchTest {
    public void switch1(int select) {
        int num;
        switch (select) {
            case 1:
                num = 10;
                break;
            case 2:
                num = 20;
            case 3:
                num = 30;
                break;
            default:
                num = 40;
        }
    }
    public void switch2(int select) {
        int num;
        switch (select) {
            case 200:
                num = 10;
                break;
            case 100:
                num = 20;
            case 500:
                num = 30;
                break;
            default:
                num = 40;
        }
    }

    public void switch3(String season) {
        switch (season) {
            case "SPRING": break;
            case "SUMMER":break;
            case "AUTUMN":break;
            case "WINTER":break;
        }
    }
}
