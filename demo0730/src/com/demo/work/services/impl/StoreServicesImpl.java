package com.demo.work.services.impl;

import com.demo.work.exception.InventoryException;
import com.demo.work.exception.NotFindCommodityException;
import com.demo.work.pojo.Commodity;
import com.demo.work.pojo.Shopping;
import com.demo.work.services.IStoreService;

/**
 * @ClassName StoreServicesImpl
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月31日  09:52:24
 * @Version 1.0.0
 */

public class StoreServicesImpl implements IStoreService {


    private  static Shopping shopping;
    public StoreServicesImpl(){
        Commodity[] commodities ={
                new Commodity("老坛酸菜牛肉面",4.5,5),
                new Commodity("农夫山泉",2,5),
                new Commodity("保温杯",41,0),
                new Commodity("天子牌香烟",45,8),
        };
        this.shopping = new Shopping(commodities,"罗森便利店","重庆渝北区");
    }
    @Override
    public void buy(String name, int count) throws Exception {
        Commodity commodity = null;
        for(Commodity c:shopping.getCommodity()){
            if(name.equals(c.getName())){
                commodity = c;
                break;
            }
        }
        //判断是否搜索到商品
        if (commodity == null){
            throw  new NotFindCommodityException();
        }
        //判断库存是否充足
        if (commodity.getCount() < count){
            throw  new InventoryException();
        }

        //购买商品，库存中减去购买的数量
        commodity.setCount(commodity.getCount()-count);
        System.out.println("购买成功，总计花费："+count * commodity.price);

    }
}
