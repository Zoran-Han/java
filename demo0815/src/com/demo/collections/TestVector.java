package com.demo.collections;

import java.util.Vector;

/**
 * @ClassName TestVector
 * 测试应用向量
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月15日  15:31:20
 * @Version 1.0.0
 */

public class TestVector {

    public static void main(String[] args) {

        //定义向量
        Vector v = new Vector();
        v.add("大哥😀");
        v.add(100202);
        System.out.println(v);
        //插入元素
        v.add(0,222);
        v.insertElementAt("大姐 \uD83D\uDE0A",3);
        System.out.println(v);
        //删除元素
        v.remove(1);
        v.removeElementAt(1);
        System.out.println(v);

    }
}
