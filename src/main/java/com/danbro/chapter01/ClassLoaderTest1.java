package com.danbro.chapter01;

/**
 * @author Danrbo
 * @Classname ClassLoaderTest
 * @Description TODO 获取类加载器
 * @Date 2021/3/12 12:25
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        ClassLoader appClassLoader = ClassLoader.getSystemClassLoader();
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(appClassLoader);
        ClassLoader extClassLoader = appClassLoader.getParent();
        //sun.misc.Launcher$ExtClassLoader@7a7b0070
        System.out.println(extClassLoader);
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        // null
        System.out.println(bootStrapClassLoader);
        ClassLoader classLoader = ClassLoaderTest1.class.getClassLoader();
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(classLoader);
    }
}
