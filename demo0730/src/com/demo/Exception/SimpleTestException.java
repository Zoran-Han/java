package com.demo.Exception;

/**
 * @ClassName SimpleTestException
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月30日  15:54:33
 * @Version 1.0.0
 */

public class SimpleTestException {

    public  void method(){

        //简单的try……catch的使用
        try {
            int[] intArr = {1, 2 , 3};
            intArr[5] = 8;

            for(int a :intArr){
                System.out.println(a);
            }
        }catch (RuntimeException e){
            e.printStackTrace();  //堆栈打印输出,有里向外逐步输出“出错代码”的位置
            //System.out.println("");

        }

    }

    public  void method2(){

       /* try{

            int i = 8/0;
        }catch (ArithmeticException e ){
            e.printStackTrace( );
        }catch(NullPointerException e){
            e.printStackTrace();
        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
        }*/

        //等价写法，JDK1.7的写法
        try{

            int i = 8/0;
        }catch (ArithmeticException | NullPointerException | IndexOutOfBoundsException e){//异常类型不能存在继承关系
            e.printStackTrace();
        }


    }
    //throws子句

    public void method3() throws Exception,RuntimeException {

    }


    public void method4() throws RuntimeException,Exception {//无顺序关系

        String str = null;
        System.out.println("字符串长度："+str.length());
    }

    public void method5() throws RuntimeException  {

        String str = null;
        System.out.println("字符串长度："+str.length());
    }
    public static  void main(String[] args){

        SimpleTestException ste = new SimpleTestException();
        ste.method();
        ste.method2();

        try{//Exception 异常包含了运行时异常和非运行时异常，非运行时异常要求在编译时必须处理
            ste.method4();
        }catch (Exception e){

        }
        ste.method5();//处理后会执行，若不处理则不会调用执行该代码

    }
}
