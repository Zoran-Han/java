package com.demo.Exception;

/**
 * @ClassName ExceptionStructure
 * 测试异常处理的机制语法结构
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月30日  15:10:24
 * @Version 1.0.0
 */

public class ExceptionStructure {


    public int sum(int x,int y){
        try {

            return  x+y++;

        }catch (Exception e){
            System.out.println("catch中的返回值"); //不报错不会执行此段代码
            return 10;

        }finally {
            System.out.println("y= "+ y);
            System.out.println("异常处理完毕！");
            return 55;
        }

        //return 0;
    }

    public static void main(String[] args){

       /* try{
            int i = 8/0;
        }catch(RuntimeException e){
            System.out.println("异常信息1："+e.getMessage());

        }catch ( Exception e){
            System.out.println("异常信息2："+e.getMessage());

        }finally {

            System.out.println("异常处理完毕！");
        }*/

       //语法出现格式

    /*  try{

      }catch (Exception e){

      }

       try{

       }catch (Exception e){

       }finally {

       }


        try{

        }finally {
            System.out.println("程序运行结束！");

        }

*/
    ExceptionStructure es = new ExceptionStructure();
        System.out.println( es.sum(10,20));


    }

}
