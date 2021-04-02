package com.danbro.chapter11;

/**
 * @author Danrbo
 * @Classname StringIntern02
 * @Description TODO
 * @Date 2021/3/21 0:11
 */
public class StringIntern02 {
    public static void main(String[] args) {
        // 此时只有堆中有“11”对象，s3指向堆中的 “11”对象
        String s3 = new String("1") + new String("1");
        // 在常量池中创建了 "11"对象 ，s4 指向常量池中的“11”对象
        String s4 = "11";
        // 这个指令无效，因为常量池中已经有了"11"
        s3.intern();
        // s3 指向堆中的"11",s4指向常量池中的"11"所以为false
        System.out.println(s3 == s4);//false
    }
}
