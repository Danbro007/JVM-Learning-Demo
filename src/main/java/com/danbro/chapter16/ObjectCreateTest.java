package com.danbro.chapter16;

import com.danbro.chapter05.Father;
import org.junit.Test;

import java.io.File;

/**
 * @author Danrbo
 * @Classname ObjectCreateTest
 * @Description TODO
 * @Date 2021/3/26 13:37
 */
public class ObjectCreateTest {
    @Test
    public void createTest() {
        Object o = new Object();
        File file = new File("danbro");
    }

    @Test
    public void arrayTest() {
        int[] intArray = new int[10];
        Object[] objArray = new Object[10];
        int[][] mintArray = new int[10][10];
        String[][] strArray = new String[10][];
    }

    /**
     * 字段访问指令
     */
    @Test
    public void filedTest() {
        System.out.println("hello");
    }

    @Test
    public void setArray() {
        int[] array = new int[10];
        array[3] = 20;
        System.out.println(array[1]);
    }

    @Test
    public String checkCast(Object o) {
        if (o instanceof String) {
            return (String) o;
        } else {
            return null;
        }
    }
}


