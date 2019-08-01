package com.demo.apis;

/**
 * 栈帧
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月01日 11:20:14
 */
public class TestMethodStack {

    public void fun() {

    }

    public void method() {
        fun();
    }

    public static void main(String[] args) {
        TestMethodStack tms = new TestMethodStack();
        tms.method();
    }

}
