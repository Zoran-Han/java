package com.demo.apis;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * 测试Properties类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月05日 11:26:18
 */
public class TestProperties {

    public static void main(String[] args) {
        try {
            //创建属性列表对象
            Properties props = new Properties();
            //加载Properties文件中的数据
            props.load(new FileInputStream("src/com/demo/apis/test.properties"));
            //获取属性值
            System.out.println(props.getProperty("goodsName"));
            System.out.println(props.getProperty("goodsPrice"));
            System.out.println(props.getProperty("goodsTotal"));
            //设置属性
            /*String goodsName = "卫龙辣条";
            StringBuffer stuff = new StringBuffer();
            for(int i=0; i<goodsName.length(); i++){
                stuff.append("\\u");
                stuff.append(Integer.toHexString(goodsName.charAt(i)));
                stuff.append(",");
            }
            //System.out.println("---->"+stuff);
            props.setProperty("goodsName", stuff.toString());
            props.setProperty("goodsNumber", "0000001");*/
            props.setProperty("goodsName", "卫龙辣条ABC");
            props.setProperty("goodsNumber", "0000001");
            //保存属性到文件中
            props.store(new FileOutputStream("src/com/demo/apis/test.properties"), "商品信息");
            System.out.println("修改属性列表数据成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
