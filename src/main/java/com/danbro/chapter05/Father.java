package com.danbro.chapter05;

/**
 * @author Danrbo
 * @Classname MethodInvokeTest2
 * @Description TODO
 * @Date 2021/3/14 22:08
 */
public class Father {
    public void showFinal(){
        System.out.println("father show");
    }
}


class Son extends Father{
    public void show(){
        showFinal();
    }
}

