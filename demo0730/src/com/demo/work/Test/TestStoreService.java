package com.demo.work.Test;

import com.demo.work.services.IStoreService;
import com.demo.work.services.impl.StoreServicesImpl;

/**
 * @ClassName TestStoreService
 * 测试类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月31日  10:05:56
 * @Version 1.0.0
 */

public class TestStoreService {
    public  static  void main(String[] args){

        try {
            IStoreService iStoreService = new StoreServicesImpl();
            iStoreService.buy("蓝牙耳机",2);
            iStoreService.buy("农夫山泉",6);
            iStoreService.buy("天子牌香烟",7);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
