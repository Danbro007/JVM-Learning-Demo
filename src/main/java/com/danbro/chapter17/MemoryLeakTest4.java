package com.danbro.chapter17;

import lombok.Data;

import java.util.HashSet;

/**
 * @author Danrbo
 * @Classname MemoryLeakTest4
 * @Description TODO
 * @Date 2021/4/2 13:24
 */
public class MemoryLeakTest4 {
    public static void main(String[] args) {
        Point point = new Point();
        point.setNum(1);
        HashSet<Point> set = new HashSet<>();
        set.add(point);
        point.setNum(2);
        // 删除失败 false
        System.out.println(set.remove(point));
        set.add(point);
        // 打印出 [Point(num=2), Point(num=2)]
        System.out.println(set);
    }
}
@Data
class Point{
    private int num;
}
