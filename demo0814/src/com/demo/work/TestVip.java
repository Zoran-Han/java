<<<<<<< HEAD
package com.demo.work;

import com.demo.work.pojo.Vip;

import java.util.*;

/**
 * @ClassName TestVip
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  19:11:16
 * @Version 1.0.0
 */

public class TestVip {


    public static void main(String[] args) {

        Set<Vip> set = new HashSet<>();

        set.add(new Vip("201908140226","张三疯",50));
        set.add(new Vip("201908140023","张疯",30));
        set.add(new Vip("201908140020","张三",20));
        set.add(new Vip("201908140226","张天",10));

        //采用迭代遍历对象
        Iterator it = set.iterator();
        //循环遍历数组
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }

}
=======
package com.demo.work;

import com.demo.work.pojo.Vip;

import java.util.*;

/**
 * @ClassName TestVip
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  19:11:16
 * @Version 1.0.0
 */

public class TestVip {


    public static void main(String[] args) {

        Set<Vip> set = new HashSet<>();

        set.add(new Vip("201908140226","张三疯",50));
        set.add(new Vip("201908140023","张疯",30));
        set.add(new Vip("201908140020","张三",20));
        set.add(new Vip("201908140226","张天",10));

        //采用迭代遍历对象
        Iterator it = set.iterator();
        //循环遍历数组
        while(it.hasNext()){
            System.out.println(it.next());
        }



    }

}
>>>>>>> e366ada85f330a71896bda1991d88c84cf56984e
