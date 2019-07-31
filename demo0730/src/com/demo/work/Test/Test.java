package com.demo.work.Test;

import com.demo.work.pojo.Commodity;
import com.demo.work.pojo.Shopping;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月30日  22:33:20
 * @Version 1.0.0
 */

public class Test {

    public void list (Shopping shopping){

        Commodity[] commodity = shopping.getCommodity();
        for(int i = 0;i<commodity.length-1;i++){
            System.out.println("商品名称："+commodity[i].getName()+" 商品价格："+commodity[i].getPrice()+
                    " 商品个数："+commodity[i].getCount());

        }

    }
    public  int   buy(String name,int a,Shopping shopping) throws Exception {
        Commodity[] commodity = shopping.getCommodity();
        for(int i = 0; i<commodity.length-1; i++)
            /*try{
            if(commodity[i].name.equals(name) && a <= commodity[i].count ) {
                System.out.println("商品存在，请扫码购买！");
                int result = commodity[i].count - a;
                commodity[i].setCount(result);
                return commodity[i].getCount();
            }
            }catch (Exception e){
            System.out.println("--------商品不存在或者数量不足！---------");
            throw new Exception("商品不存在或者数量不足！" );
                //e.printStackTrace();
                }
*/

           /* if (commodity[i].name.equals(name) && a <= commodity[i].count) {
                System.out.println("商品存在，请扫码购买！");
                int result = commodity[i].count - a;
                commodity[i].setCount(result);
                return commodity[i].getCount();
            } else if (!commodity[i].name.equals(name) || a > commodity[i].count){
                System.out.println("商品不存在或者数量不足！");
                throw new Exception();
            }
*/
            if (!commodity[i].name.equals(name) ) {
                throw new Exception();
                /*System.out.println("商品存在，请扫码购买！");
                int result = commodity[i].count - a;
                commodity[i].setCount(result);
                return commodity[i].getCount();*/
            } else if ( a > commodity[i].count) {
                throw new Exception();
            }else {
                System.out.println("商品存在，请扫码购买！");
                int result = commodity[i].count - a;
                commodity[i].setCount(result);
                return commodity[i].getCount();
            }



       return 0;

    }

    public static  void main(String[] args){

        Test test = new Test();
        //this.shopping = new Shopping(commodities,"罗森便利店","重庆渝北区");
        Shopping shopping = new Shopping();
        Commodity[] commodity ={
                new Commodity("老坛酸菜牛肉面",4.5,5),
                new Commodity("农夫山泉",2,5),
                new Commodity("保温杯",41,0),
                new Commodity("天子牌香烟",45,8),
        };
        shopping.setCommodity(commodity);//将商品存入商店中
        test.list(shopping);
        try{
            System.out.println(test.buy("农夫山泉",1,shopping) );

        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            System.out.println(test.buy("保温杯",2,shopping) );

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    }

