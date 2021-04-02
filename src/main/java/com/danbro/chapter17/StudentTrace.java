package com.danbro.chapter17;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author Danrbo
 * @Classname StudentTrace
 * @Description TODO 浅堆和深堆的测试案例分析 JVM 参数：-XX:+HeapDumpBeforeFullGC -XX:HeapDumpPath=d:/studentTrace.hprof
 * @Date 2021/4/2 10:15
 */
public class StudentTrace {
    static List<WebPage> webPages = new Vector<>();

    public static void createWebPages() {
        for (int i = 0; i < 100; i++) {
            WebPage wp = new WebPage();//新网页
            wp.setUrl("http://www." + Integer.toString(i) + ".com");//seturl
            wp.setContent(Integer.toString(i));//内容i
            webPages.add(wp);//增加网页
        }
    }

    public static void main(String args[]) {
        createWebPages();
        Student st3 = new Student(3, "Lily");
        Student st5 = new Student(5, "Tom");
        Student st7 = new Student(7, "Jack");
        for (int i = 0; i< webPages.size(); i++) {
            if (i % st3.getId() == 0) st3.visit(webPages.get(i));
            if (i % st5.getId() == 0) st5.visit(webPages.get(i));
            if (i % st7.getId() == 0) st7.visit(webPages.get(i));
        }
        webPages.clear();
        System.gc();
    }
}
@Data
class Student {
    private int id;
    private String name;
    private List<WebPage> history = new ArrayList<>();

    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public void visit(WebPage webPage){
        history.add(webPage);
    }
}
@Data
class WebPage{
    private String url;
    private String content;
}