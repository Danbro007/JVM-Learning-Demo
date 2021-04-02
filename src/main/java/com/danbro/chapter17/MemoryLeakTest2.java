package com.danbro.chapter17;

import lombok.Data;

/**
 * @author Danrbo
 * @Classname MemoryLeakTest2
 * @Description TODO 内部类对象被外部类引用
 * @Date 2021/4/2 12:45
 */
public class MemoryLeakTest2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.setInnerClass(new OutterClass().getInner());
        System.gc();
        // GC后 由于test对象还是持有inner对象的引用，导致 Outter 实例对象内存泄露，无法被回收。
        System.out.println(test.getInnerClass());
    }
}
class OutterClass {
    public InnerClass getInner(){
        return new InnerClass();
    }
    class InnerClass {}
}
@Data
class Test{
    private OutterClass.InnerClass innerClass;
}