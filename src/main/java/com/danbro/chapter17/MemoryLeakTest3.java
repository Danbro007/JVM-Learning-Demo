package com.danbro.chapter17;

/**
 * @author Danrbo
 * @Classname MemoryLeakTest3
 * @Description TODO 变量的作用域
 * @Date 2021/4/2 12:54
 */
public class MemoryLeakTest3 {
    private String message;

    public void receiveMsg(){
        readFrmNet();//从网络中接收数据保存到message里
        saveDb();// 把message保存到数据库中
    }

    private void saveDb() {
    }

    private void readFrmNet() {
    }
}
