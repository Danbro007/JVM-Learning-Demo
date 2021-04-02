package com.danbro.chapter08;

/**
 * @author Danrbo
 * @Classname EscapeAnalysis
 * @Description TODO 逃逸分析
 * @Date 2021/3/17 9:45
 */
public class EscapeAnalysis {

    public EscapeAnalysis obj;

    /**
     * 方法返回 EscapeAnalysis 对象，发生逃逸
     */
    public EscapeAnalysis getInstance() {
        return obj == null ? new EscapeAnalysis() : obj;
    }

    /**
     * 为成员变量赋值，发生逃逸
     */
    public void setObj() {
        this.obj = new EscapeAnalysis();
    }

    /**
     * 对象的作用域仅在当前方法，没有发生逃逸。
     */
    public void useEscapeAnalysis() {
        EscapeAnalysis e = new EscapeAnalysis();
    }

    /**
     * 引用了成员变量，发生了逃逸。
     */
    public void useEscapeAnalysis2() {
        EscapeAnalysis e = getInstance();
    }


}
