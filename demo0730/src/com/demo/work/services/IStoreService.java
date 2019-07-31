package com.demo.work.services;

/**
 * @InterfaceName IStoreService
 * 商店服务接口
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月31日  09:32:41
 * @Version 1.0.0
 */
public interface IStoreService {

    //顾客购买商品
    public void buy(String name,int count) throws  Exception;
}
