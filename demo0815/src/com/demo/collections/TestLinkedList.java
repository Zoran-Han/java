package com.demo.collections;

import java.util.LinkedList;

/**
 * @ClassName TestLinkedList
 * 测试链表
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月15日  14:28:30
 * @Version 1.0.0
 */

public class TestLinkedList {

    public static void main(String[] args) {
        //创建链表
        LinkedList  list = new LinkedList();
        //添加元素
        list.add(1);
        list.add(1);
        list.add("大侠");
        list.add(true);
        list.add(5233.5555);
        list.add("饶命！");
        //输出集合
        System.out.println(list);
        //添加头部元素
        list.addFirst("我是杨过！");
        System.out.println(list);
        //添加尾部元素
        list.addLast("我是小龙女");
        System.out.println(list);
        //通过索引添加
        list.add(2,10000);
        //删除元素
        list.remove(1);
        list.removeFirst();
        System.out.println(list);
        //修改元素
        list.set(2,200);
        System.out.println(list);
        System.out.println("---------------------------------------------------------------");
        //元素的获取
        System.out.println(list.get(4));
        /*for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.print(o+" ");
        }
        System.out.println();*/




    }
}
