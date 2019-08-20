package com.demo.work;


import java.util.*;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月15日  18:24:57
 * @Version 1.0.0
 */

public class Test {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("绿箭","2001",50));
        products.add(new Product("面包","2002",62));
        products.add(new Product("牛奶","2003",40));

        HashMap<String, ArrayList<Product>> warehouse1 = new HashMap< >();
        warehouse1.put("仓库1",products);
        warehouse1.put("仓库2",products);
        HashMap<String, ArrayList<Product>> warehouse2 = new HashMap< >();
        warehouse1.put("仓库1",products);
        warehouse2.put("仓库2",products);

        HashMap<String,HashMap<String, ArrayList<Product>>> citiesCQ = new HashMap<>();
        citiesCQ.put("重庆市",warehouse1);
        citiesCQ.put("重庆市",warehouse2);

        HashMap<String,HashMap<String, ArrayList<Product>>> citiesHK = new HashMap<>();
        citiesCQ.put("香港特别行政区",warehouse1);
        citiesCQ.put("香港特别行政区",warehouse2);

        HashMap<String,HashMap<String,HashMap<String, ArrayList<Product>>> > company = new HashMap<>();
        company.put("沃尔玛",citiesCQ);
        company.put("沃尔玛",citiesHK);


        //获得键值对集合
        Set<Map.Entry<String,HashMap<String,HashMap<String, ArrayList<Product>>> >> entrySet = company.entrySet();
        //遍历键值对集合
        for (Map.Entry<String,HashMap<String,HashMap<String, ArrayList<Product>>> > entry :entrySet) {
            //System.out.println(entry.getKey()+" : "+entry.getValue());
            System.out.println(entry.getKey());

              Set<Map.Entry<String,HashMap<String,ArrayList<Product>>>> entrySet1 = citiesCQ.entrySet();
              for (Map.Entry<String,HashMap<String,ArrayList<Product>>> entry1 :entrySet1) {
                  //System.out.println("  "+entry1.getKey()+" "+entry1.getValue());
                  System.out.println("  "+entry1.getKey());

                  Set<Map.Entry<String,ArrayList<Product>>> entrySet2 = warehouse1.entrySet();
                  for (Map.Entry<String,ArrayList<Product>> entry2 :entrySet2) {
                      //System.out.println("    "+entry2.getKey()+" : "+entry2.getValue());
                      System.out.println("    "+entry2.getKey());

                      for (Product p:products){
                          System.out.println("      商品名称："+p.getGoodsName()+" 商品编号："+p.getGoodsNum()
                                  +" 商品数量："+p.getGoodsTotal());
                      }

                  }

            }
        }





    }

}
