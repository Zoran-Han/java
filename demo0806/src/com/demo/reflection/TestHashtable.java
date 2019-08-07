package com.demo.reflection;

import java.util.Hashtable;

/**
 * @ClassName TestHashtable
 * 测试哈希表
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月06日  15:33:51
 * @Version 1.0.0
 */

public class TestHashtable {

    public static void main(String[] args){
        //创建一个哈希表对象
        Hashtable ht=new Hashtable();
        //设值
        ht.put("name","张三");
        ht.put("age",23);
        ht.put("sex","女");
        ht.put("weight",158);
        ht.put("high",172);
        //取值
        System.out.println("姓名:"+ht.get("name")+" 年龄:"+ht.get("age")+" 性别："
                +ht.get("sex")+" 体重："+ht.get("weight")+" 身高："+ht.get("high"));

    }
}
