package com.demo.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName TestHashMap
 * 测试应用散列图
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月15日  16:33:22
 * @Version 1.0.0
 */

public class TestHashMap {

    public static void main(String[] args) {
        //创建散列图集合，大小默认是16，超过16*0.75的时候自动扩展一倍的容量
        HashMap<String,Object> hashMap = new HashMap<>();
        //添加元素
        hashMap.put("goodsName","可口可乐");
        hashMap.put("goodsPrice",5);
        hashMap.put("goodsTotal",88);
        //获取元素的值
        System.out.println(hashMap.get("goodsName")+" ,"+hashMap.get("goodsPrice")
                +" ,"+hashMap.get("goodsTotal"));
        //遍历图
       /* for (hashMap.Entry<String,Object> o : hashMap){//遍历失败，图不能使用foreach

        }*/
        //获得键值对集合
        Set<Map.Entry<String,Object>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);
        //遍历键值对集合
        for (Map.Entry<String,Object> entry :entrySet) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }



        //删除元素
        hashMap.remove("goodsTotal");
        //修改元素
        hashMap.put("goodsPrice",4.5);
        System.out.println(hashMap);
    }
}
