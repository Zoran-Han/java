package com.demo.work.services.impl;

import com.demo.work.exceptions.InventoryException;
import com.demo.work.exceptions.NotFindGoodsException;
import com.demo.work.pojo.Goods;
import com.demo.work.pojo.Store;
import com.demo.work.services.IStoreService;

/**
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 09:37:17
 */
public class StoreServiceImpl implements IStoreService {

    private static Store store;

    public StoreServiceImpl() {
        Goods[] goodses = {
                new Goods("可口可乐", 4, 50),
                new Goods("卫龙辣条", 3.5, 100),
                new Goods("小包纸巾", 1, 2000)
        };
        this.store = new Store("罗什便利店", "重庆渝北", goodses);
    }

    @Override
    public void buy(String name, int total) throws Exception {
        //搜索商品
        Goods goods = null;
        for(Goods g: store.getGoodses()) {
            if(name.equals(g.getName())) {
                goods = g;
                break;
            }
        }
        //判断是否搜索到商品
        if(goods==null) {
            throw new NotFindGoodsException();
        }
        //判断库存是否充足
        if(goods.getTotal()<total) {
            throw new InventoryException();
        }
        //购买商品，库存减去购买的数量
        goods.setTotal(goods.getTotal()-total);
        System.out.println("购买商品成功，共花费: ￥"+goods.getPrice()*total);
    }
}
