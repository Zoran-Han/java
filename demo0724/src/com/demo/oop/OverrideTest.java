package com.demo.oop;

/**
 * @ClassName OverrideTest 测试重写
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  10:48:25
 * @Version 1.0.0
 */

public class OverrideTest  {

    public static void main(String[] args) {
       /* OverrideSub sub = new OverrideSub();
        System.out.println(sub.i);
        sub.method(0);
        sub.function(0);//访问的是父类的方法
        System.out.println("-------------------------------");

        //上转型
        OverrideParent parent = new OverrideSub();
        System.out.println(parent.i);
        parent.method(0);
         //parent.method2(2);  /无法访问子类自定义的属性与方法，找不打方法，父类中没有访问的入口（接口）
        parent.function(0);*/

       //运行时多态(发生的条件，继承、重写)
        //上转型，一种父类类型的变量，对应多种子类对象
        OverrideParent parent1 = new OverrideSub();
        OverrideParent parent2 = new OverrideSub2();
        parent1.method(0);
        parent2.method(0);
        System.out.println("-------------------------------");

        //下转型,先上转型，再下转型
        //OverrideSub sub = (OverrideSub) new OverrideParent();//编译时没错，但运行时出错
        OverrideParent parent = new OverrideSub();
        OverrideSub sub = (OverrideSub) parent;
        sub.method(0);
        sub.method2(0);

    }
}
