package com.danbro.chapter16;

import org.junit.Test;

import java.io.*;

/**
 * @author Danrbo
 * @Classname ActiveUsingTest2
 * @Description TODO 反序列化导致类的初始化
 * @Date 2021/3/29 17:51
 */
public class ActiveUsingTest2 {

    /**
     * 先把类序列化到磁盘上
     */
    @Test
    public void serialization() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Order.txt"));
        oos.writeObject(new Order());
    }

    /**
     * 从磁盘文件反序列化
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void deserialization() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Order.txt"));
        Order order = (Order) ois.readObject();
    }
}

class Order implements Serializable{
    static {
        System.out.println("order的初始化");
    }
}