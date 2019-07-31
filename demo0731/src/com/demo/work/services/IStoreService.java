package com.demo.work.services;

/**
 * 商店服务接口
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 09:28:26
 */
public interface IStoreService {

    /**
     * 顾客购买商品
     * @param name
     * @param total
     * @throws Exception
     */
    public void buy(String name, int total) throws Exception;

}
