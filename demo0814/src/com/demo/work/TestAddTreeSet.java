package com.demo.work;

import com.demo.work.impl.Cat;
import com.demo.work.impl.Dog;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName TestAddTreeSet
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  20:34:19
 * @Version 1.0.0
 */

public class TestAddTreeSet {

    public static void main(String[] args) {

    //创建树形集并指定比较器
    Set<IAnimal> set = new TreeSet<>(new Comparator<IAnimal>() {
        @Override
        public int compare(IAnimal o1, IAnimal o2) {
            return 1;
        }
    });
        set.add(new Dog("小黄","米黄色"));
        set.add(new Cat("小包子","米白色"));
        set.add(new Cat("迪迪","黑白色"));
        set.add(new Dog("小咪","黑色"));

        for(IAnimal i : set){
            System.out.println(i);
        }

    }
}
