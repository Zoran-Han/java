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

    public static  void main(String[] args){

        SimpleTestException ste = new SimpleTestException();
        ste.method();

    }
}
