package com.demo.api;

/**
 * @ClassName TestWrapper
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月01日  14:36:31
 * @Version 1.0.0
 */
public class TestWrapper {

    public static void main(String[] args) {
        /*Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);
        Integer i3 = new Integer(200);
        Integer i4 = new Integer(200);
        System.out.println(i1==i2); //false      手动装箱
        System.out.println(i3==i4); //false*/

        Short s1 = 100;
        Short s2 = 100;
        Short s3 = 200;
        Short s4 = 200;
        System.out.println(s1==s2); //true     整型Wraper类（Byte、Short、Integer、Long）中存在内部类（***Cache类）
                                    //          该内部类的作用：整型封装类加载时，创建-128...127范围的数的对象，共256个,
                                    //          缓存在内存中；自动装箱时，数的范围在-128...127范围中，不会创建对象，
                                    //          而是从缓存中获取对象。
        System.out.println(s3==s4); //false

        System.out.println("----------------------------");
        Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i1==i2); //true
        System.out.println(i3==i4); //false

        System.out.println("----------------------------");
        Long l1 = 100l;
        Long l2 = 100L;
        Long l3 = 200L;
        Long l4 = 200L;
        System.out.println(l1==l2); //true
        System.out.println(l3==l4); //false

        System.out.println("----------------------------");
        Float f1 = 100f;
        Float f2 = 100f;
        System.out.println(f1==f2);

        System.out.println("----------------------------");
        Double d1 = new Double(100); //手动装箱
        Double d2 = new Double(100);
        System.out.println(d1==d2); //false
        Double d3 = 100d; //自动装箱
        Double d4 = 100d;
        System.out.println(d3==d4); //false
        Double d5 = 200d; //自动装箱
        Double d6 = 200d;
        System.out.println(d5==d6); //false
    }

}
