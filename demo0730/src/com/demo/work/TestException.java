package com.demo.work;

/**
 * @ClassName TestException
 * 验证try、catch、finally的用法，验证数学异常，空指针、数字格式化异常、索引越界异常、类型转换异常
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月30日  19:09:30
 * @Version 1.0.0
 */

public class TestException {




    //测试数学异常
    public void method1(){
        try{
            int i = 5/0;
        }catch (Exception e ){
            e.printStackTrace( );
        }

    }

    //测试空指针异常
    public void method2( ){
        try {
            String[] arr2 =null;
            System.out.println("数组的长度："+arr2.length);
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch(ArithmeticException e){
            e.printStackTrace();
        }finally {
            System.out.println("异常");
        }

    }

    //测试数字格式异常,把不是数字的字符串转换成数字
    public void  method3(){

        String str = "String";
        System.out.println(Integer.parseInt(str));

    }

    //测试索引越界异常
    public void method4(){
        try{
        int[] arr4 = {1,58,9,0};
           arr4[5] = 5;

        }catch(Exception e){
            e.printStackTrace();
        }

    }

    //测试类型转换异常
    public String method5( ){
         Object o = new Object();
         String s =(String) o;
         return s;

    }
    //测试throw
    public  int  method6(int a, int b) throws Exception{
        //限制除数不为0
        if (b==0){
            throw new Exception("除数不能为0！");
        }
        return a / b;
    }


    public static void main(String[] args){
        TestException te = new TestException();
        te.method1();
        te.method2();
        te.method3();
        te.method4();
        te.method5();
        try{
            System.out.println(te.method6(5, 6));
        }catch (Exception e){
            e.printStackTrace();
        }



    }


}
