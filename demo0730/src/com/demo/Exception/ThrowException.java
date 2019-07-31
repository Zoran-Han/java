package com.demo.Exception;

/**
 * @ClassName ThrowException
 * throw语句引发异常
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月30日  16:45:26
 * @Version 1.0.0
 */

public class ThrowException {

    public int  sum(int x, int y) throws Exception{
       //限制是十以内加法运算
        if(x>=10||y>=10){
            throw new Exception("超出运算范围！只能做十以内加法运算");
        }
        return x + y;

    }

    public  int  except(int a, int b) throws Exception{
        //限制除数不为0
        if (b==0){
            throw new Exception("除数不能为0！");
        }
        return a / b;
    }
    public  double multiply(double x,double y) throws Exception {
        if (x==0||y==0){
            throw new Exception("两个乘数都不可以为0");
        }
        return x * y;
    }

    public static  void main(String[] args){

        ThrowException te = new ThrowException();
        try {
            System.out.println("result=" + te.sum(5, 8));
            System.out.println("result=" + te.sum(5, 15));
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            System.out.println(te.except(15,2));
            System.out.println(te.except(15,0));

        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            System.out.println(te.multiply(52,60.5));
            System.out.println(te.multiply(52,0));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
