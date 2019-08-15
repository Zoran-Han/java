package com.demo.collections;



import java.util.*;

/**
 * @ClassName TestSet
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  16:11:33
 * @Version 1.0.0
 */

public class TestSet {

    public static void main(String[] args) {
       /*
        Set<String> hashSet = new HashSet<>();
        hashSet.add("你好 奔驰");
        hashSet.add(100);//编译报错，泛型指定了类型只能是String型*/
        //创建散列集
       Set hashSet = new HashSet(); //元素插入不保证顺序（无序）,获取元素按照一定规则获取
        //添加元素
       /* hashSet.add("Tom");
        hashSet.add(100);
        hashSet.add("hello");*/

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(8);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(20);
        hashSet.add(50);
        hashSet.add(80);
        hashSet.add(11);
        hashSet.add(22);
        hashSet.add(33);
        hashSet.add(77);
        hashSet.add(9);

        for(Object o :hashSet){
            System.out.print(o+" ");
            System.out.print("\t");
        }
        System.out.println();

        //迭代器
        Iterator it = hashSet.iterator();
        //使用迭代器遍历数组
        while (it.hasNext()){
            System.out.print(it.next());
            System.out.print("\t");
        }
        System.out.println();

        //链式散列集
        Set linkHashSet = new LinkedHashSet();//插入元素保证顺序（元素插入的先后顺序）
        linkHashSet.add(1);
        linkHashSet.add(2);
        linkHashSet.add(3);
        linkHashSet.add(4);
        linkHashSet.add(5);
        linkHashSet.add(8);
        linkHashSet.add(6);
        linkHashSet.add(7);
        linkHashSet.add(20);
        linkHashSet.add(50);
        linkHashSet.add(80);
        linkHashSet.add(11);
        linkHashSet.add(22);
        linkHashSet.add(33);
        linkHashSet.add(77);
        linkHashSet.add(9);
        //遍历集合
        for (Object o : linkHashSet){
            System.out.print(o);
            System.out.print("\t");
        }
        System.out.println();//  输出结果：1  2	3	4	5	8	6	7	20	50	80	11	22	33	77	9


        //创建树形集
        TreeSet treeSet = new TreeSet(hashSet); //插入元素时，以自然顺序对元素进行排序
        treeSet.add(25);
        treeSet.add(0);
        treeSet.add(-10);
       /* treeSet.add("tom"); //运行时报错，原因：不能喝整型值进行比较
        treeSet.add(null);*/
        //遍历集合
        for (Object o :treeSet){
            System.out.print(o);
            System.out.print("\t");
        }
        System.out.println();
    }


}
