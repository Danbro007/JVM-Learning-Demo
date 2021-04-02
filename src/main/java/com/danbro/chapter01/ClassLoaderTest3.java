package com.danbro.chapter01;

/**
 * @author Danrbo
 * @Classname ClassLoaderTest3
 * @Description TODO 获取扩展类加载器的加载路径
 * @Date 2021/3/12 13:42
 */
public class ClassLoaderTest3 {
    public static void main(String[] args) {
        // C:\WINDOWS\Sun\Java\lib\ext
        String path = System.getProperty("java.ext.dirs");
        for (String s : path.split(";")) {
            System.out.println(s);
        }
    }
}
