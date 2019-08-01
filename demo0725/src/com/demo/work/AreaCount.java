package com.demo.work;

/**
 * @ClassName AreaCount
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月25日  20:23:50
 * @Version 1.0.0
 */

public class AreaCount {
    public  static  final double PI = 3.14;

    /**
     * 计算机基础图形的面积
     * @param x
     */
    public   void  method(double...x){
        double s;
        if(x.length==1){

            s = PI * x[0] * x[0];
            System.out.println("该图形为圆,面积为："+s);

        }else if(x.length==2){
            s =  x[0] * x[1];
            System.out.println("该图形为平行四边形,面积为："+s);

        }else if (x.length==3){
            s = ( x[0] +x[1])* x[2] / 2;
            System.out.println("该图形为梯形,面积为："+s);

        }else{
            System.out.println("对不起，不在能力范围之内！");
        }

    }
    public  static void main(String[] args){
        AreaCount areaCount = new AreaCount();
        areaCount.method();
        areaCount.method(2);
        areaCount.method(9,5);
        areaCount.method(5,6,8);
        areaCount.method(3,9,6,7);
        //AreaCount.method(1);  若方法为静态的，直接类名.方法名调用


    }

}
