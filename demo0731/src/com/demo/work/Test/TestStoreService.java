package com.demo.work.Test;

import com.demo.work.services.IStoreService;
import com.demo.work.services.impl.StoreServiceImpl;

/**
 * 测试类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 10:06:20
 */
public class TestStoreService {

    public static void main(String[] args) {
        try {
            IStoreService iStoreService = new StoreServiceImpl();
            //iStoreService.buy("蓝牙耳机", 1);
            //iStoreService.buy("卫龙辣条", 101);
            iStoreService.buy("可口可乐", 2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
