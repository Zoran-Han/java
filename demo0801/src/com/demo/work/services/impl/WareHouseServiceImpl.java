package com.demo.work.services.impl;

import com.demo.work.pojo.Product;
import com.demo.work.pojo.WareHouse;
import com.demo.work.services.IWareHouseService;

/**
 * 仓库服务实现类
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月01日 09:59:51
 */
public class WareHouseServiceImpl implements IWareHouseService {

    private WareHouse wareHouse;

    public WareHouseServiceImpl() {
        this.wareHouse = new WareHouse("1号仓库", "重庆渝北");
    }

    @Override
    public void inStore(Product product) throws Exception {
        //查找产品
        Product storeProduct = null;
        //获得可以存放"新增产品"的位置
        int index = -1;
        //元素的下标
        int i = -1;
        for(Product p: wareHouse.getProducts()) {
            if(index==-1&&p==null) {
                index = i;
            }
            if(product.equals(p)) {
                storeProduct = p;
                break;
            }
            i++;
        }
        //判断仓库中是否找到产品
        if(storeProduct!=null) { //查找到
            storeProduct.setTotal(storeProduct.getTotal()+product.getTotal());
        } else { //未找到
            storeProduct = product;
            wareHouse.getProducts()[index] = product;
        }
        System.out.println(storeProduct.getNumber()+" "+storeProduct.getName()+" "+storeProduct.getTotal());
    }

    @Override
    public void outStore(Product product) throws Exception {
        //查找产品
        Product storeProduct = null;
        for(Product p: wareHouse.getProducts()) {
            if(product.equals(p)) {
                storeProduct = p;
                break;
            }
        }
        //判断是否未到找产品
        if(storeProduct==null) {
            throw new Exception("错误: 仓库中未查找产品!");
        }
        //判断库存是否不足
        if(storeProduct.getTotal()<product.getTotal()) {
            throw new Exception("错误: 产品库存不足!");
        }
        storeProduct.setTotal(storeProduct.getTotal()-product.getTotal());
        System.out.println(storeProduct.getNumber()+" "+storeProduct.getName()+" "+storeProduct.getTotal());
    }
}
