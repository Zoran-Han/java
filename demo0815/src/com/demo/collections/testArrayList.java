package com.demo.collections;

import java.util.ArrayList;

/**
 * @ClassName testArrayList
 * 数组线性表
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月15日  14:02:10
 * @Version 1.0.0
 */

public class testArrayList {

    public static void main(String[] args) {
        //创建数组线性表集合
        ArrayList list = new ArrayList();
        //添加元素
        list.add("想");
        list.add(200);
        list.add(20.36);
        list.add(true);
        list.add("想");
        list.add(250);
        list.add(20.36);
        list.add(true);
        System.out.println(list);
       /* for (Object o : list) {
            System.out.print(o + "  ");
        }
        System.out.println();*/
        //通过下标获得元素
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        //修改元素
        list.add(2,"CQ");
        System.out.println(list);
        //插入元素
        list.set(3,"渝");
        System.out.println(list);
        //删除元素
        list.remove("想");
        System.out.println(list);
        list.remove(6);
        System.out.println(list);
        //查找元素
        System.out.println(list.indexOf("渝"));
        //删除所有元素
        list.clear();
        System.out.println(list);

    }
}
