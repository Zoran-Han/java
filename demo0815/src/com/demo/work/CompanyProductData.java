package com.demo.work;


import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CompanyProductData
 * 使用集合封装下列情况的数据结构（用集合模拟对象）
 * 要求：
 *    公司 多个城市  多个仓库  仓库有多个商品
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月16日  09:17:04
 * @Version 1.0.0
 */

public class CompanyProductData {

    public static void main(String[] args) {

        //创建封装公司数据的图集合
        Map<String,Object> companyMap = new HashMap<>();
        //添加属性
        companyMap.put("name","京东");
        //创建线性集合封装不同的城市数据
        List cityList = new ArrayList();
        //创建封装城市数据的图集合
        Map<String, Object> cityMap = new HashMap<>();
        cityMap.put("name","上海分布");
        //创建线性集合，封装仓库数据
        List warehouseList = new ArrayList();
        //创建封装仓库的图集合
        Map<String,Object> warehouseMap = new HashMap<>();
        //设置仓库名称
        warehouseMap.put("name","上海分部浦东区仓库");
        //创建线形集合，封装产品集合
        List productList = new ArrayList();

        //创建封装产品数据的图集合
        Map<String,Object> productMap= new HashMap<>();
        productMap.put("name","康师傅矿泉水");
        productMap.put("price",4.5);
        productMap.put("total",100);
        productList.add(productMap);

        productMap= new HashMap<>();
        productMap.put("name","乐事薯片");
        productMap.put("price",6);
        productMap.put("total",200);



        productList.add(productMap);
        warehouseMap.put("productList",productList);
        warehouseList.add(warehouseMap);
        cityMap.put("warehouseList",warehouseList);
        cityList.add(cityMap);


        cityMap = new HashMap<>();
        cityMap.put("name","重庆分部");
        cityList.add(cityMap);

        companyMap.put("cityList",cityList);

         // 提取公司到产品数据
        System.out.println("公司："+companyMap.get("name"));
        //遍历城市分部集合
        for (Map<String,Object> city :(List<Map<String, Object>>) companyMap.get("cityList")){
            //提取城市分布数据
            System.out.println("  "+city.get("name"));
            //遍历仓库集合
            for (Map<String,Object> warehouse:(List<Map<String,Object>>)
                    (city.get("warehouseList")==null?new ArrayList<>():city.get("warehouseList"))){
                //提取仓库数据
                System.out.println("    "+warehouse.get("name"));
                //遍历产品集合
                for (Map<String,Object> product :(List<Map<String,Object>>)
                        (warehouse.get("productList")==null?new ArrayList<>():warehouse.get("productList"))){
                    System.out.println("    "+product.get("name")+","+product.get("price")+","+
                            product.get("total"));
                }
            }
        }



    }
}
