package com.demo.work.services;

import com.demo.work.pojo.Product;

/**
 * 仓库服务接口
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月01日 09:55:40
 */
public interface IWareHouseService {

    /**
     * 产品入库
     * @param product
     * @throws Exception
     */
    public void inStore(Product product) throws Exception;

    /**
     * 产品出库
     * @param product
     * @throws Exception
     */
    public void outStore(Product product) throws Exception;

}
