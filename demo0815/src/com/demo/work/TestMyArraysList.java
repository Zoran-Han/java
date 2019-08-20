package com.demo.work;

/**
 * @ClassName TestMyArraysList
 * 测试自定义的线性表
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月16日  10:21:38
 * @Version 1.0.0
 */

public class TestMyArraysList {

    public static void main(String[] args) {
        MyArraysList<String> list = new MyArraysList<String>();
        list.add("TOM");
        list.add("Jack");
        list.add("Rose");
        System.out.println(list.get(1));
        System.out.println(list.size());
        for (String str : list){
            System.out.println(str);
        }
        System.out.println("程序执行完毕");
    }

}
