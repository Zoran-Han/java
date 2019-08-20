package com.demo.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName TestTreeMap
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月16日  11:17:35
 * @Version 1.0.0
 */

public class TestTreeMap {
    public static void main(String[] args) {
        //创建属性图集合
        TreeMap<String, Object> map = new TreeMap<>();
        //添加元素
        map.put("name", "Tom");
        map.put("sex", "men");
        map.put("age", 15);
        map.put("mobile", "15682825555");

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
