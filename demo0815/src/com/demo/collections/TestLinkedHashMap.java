package com.demo.collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName TestLinkedHashMap
 * 测试应用链式散列图
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月16日  10:55:29
 * @Version 1.0.0
 */

public class TestLinkedHashMap {

    public static void main(String[] args) {
        //创建链式散列图集合
       // LinkedHashMap<String,Object> linkedHashMap = new LinkedHashMap();//插入顺序
        LinkedHashMap<String,Object> linkedHashMap = new LinkedHashMap<>
                (16,0.75f,true);//元素最后一次被访问的顺序————访问顺序

        //添加元素
        linkedHashMap.put("name","Tom");
        linkedHashMap.put("sex","men");
        linkedHashMap.put("age",15);
        linkedHashMap.put("mobile","15682825555");
        System.out.println(linkedHashMap.get("age"));
        System.out.println(linkedHashMap.get("name"));

        //遍历集合
        /*for (String key : linkedHashMap.keySet()){
            System.out.println(key+"= "+linkedHashMap.get(key));
        }*/
        for (Map.Entry<String,Object> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" = "+ entry.getValue());
        }
    }

}
