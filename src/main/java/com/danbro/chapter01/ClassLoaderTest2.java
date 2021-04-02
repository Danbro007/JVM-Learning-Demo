package com.danbro.chapter01;

import sun.misc.Launcher;
import sun.misc.URLClassPath;

import java.net.URL;

/**
 * @author Danrbo
 * @Classname ClassLoaderTest2
 * @Description TODO 获取 BootstrapClassLoader 的加载类的路径
 * @Date 2021/3/12 12:32
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        URLClassPath path = Launcher.getBootstrapClassPath();
        /**
         * file:/C:/Program%20Files/Java/jdk1.8.0_211/jre/lib/resources.jar
         * file:/C:/Program%20Files/Java/jdk1.8.0_211/jre/lib/rt.jar
         * file:/C:/Program%20Files/Java/jdk1.8.0_211/jre/lib/sunrsasign.jar
         * file:/C:/Program%20Files/Java/jdk1.8.0_211/jre/lib/jsse.jar
         * file:/C:/Program%20Files/Java/jdk1.8.0_211/jre/lib/jce.jar
         * file:/C:/Program%20Files/Java/jdk1.8.0_211/jre/lib/charsets.jar
         * file:/C:/Program%20Files/Java/jdk1.8.0_211/jre/lib/jfr.jar
         * file:/C:/Program%20Files/Java/jdk1.8.0_211/jre/classes
         */
        for (URL url : path.getURLs()) {
            System.out.println(url);
        }
    }
}
