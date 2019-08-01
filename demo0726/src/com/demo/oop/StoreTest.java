package com.demo.oop;

/**
 * @ClassName StoreTest
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月26日  10:05:50
 * @Version 1.0.0
 */

public class StoreTest {

    public void printMsg(){
        //依赖
        Store store = new Store();
        store.setName("罗森便利店");
        System.out.println("名称："+store.getName());
    }
    public  static void main(String[] args){
        //组合
        //创建店主对象，同时创建商店对象
        StoreOwner so = new StoreOwner();

        //聚合
        //聚合的情况之一，先创建商店对象，再创建店主对象
        Store store = new Store();
        StoreAssis sa = new StoreAssis();

        //店员设置商店对象
        sa.setStore(store);
        //解除店员与商店的绑定
        sa.setStore(null);
    }

}
