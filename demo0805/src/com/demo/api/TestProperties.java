package com.demo.api;

import com.sun.xml.internal.stream.writers.UTF8OutputStreamWriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName TestProperties
 * 测试properties类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月05日  11:25:57
 * @Version 1.0.0
 */

public class TestProperties {

    public static void main(String[]  args) {


        try {
            //创建属性列表的对象
            Properties properties = new Properties();
            //加载properties文件的数据
            properties.load(new FileInputStream("src/com/demo/api/Test.properties"));
            //获取属性值
            System.out.println(properties.getProperty("goodsName"));
            System.out.println(properties.getProperty("goodsPrice"));
            System.out.println(properties.getProperty("goodsTotal"));
            properties.setProperty("goodsName","卫龙辣条");
            properties.setProperty("goodsNumber", "1001");
            //保存到属性文件中
            properties.store( new FileOutputStream("src/com/demo/api/Test.properties") ,"商品信息");
            System.out.println("修改属性列表数据成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
