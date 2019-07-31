package com.demo.api;

/**
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 10:36:19
 */
public class TestObject {

    public void method(Object o) {

    }

    public static void main(String[] args) {
        TestObject to = new TestObject();
        to.method(new int[]{1, 2});
    }

}
