package com.demo.oop;

/**
 * @ClassName MultiCalc
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月30日  08:55:43
 * @Version 1.0.0
 */

public class MultiCalc  extends SimpleCalc{

    public void calculate(){
        System.out.println(value);
        value -= 3;
    }
    public void calculate(int multilier){
        calculate(  );
        System.out.println(value);
        super. calculate();
        System.out.println(value);
        value *= multilier;
        System.out.println(value);
    }
    public static void main(String[]args){
        MultiCalc c=new MultiCalc();
        c. calculate(2);
        System.out.println("Value is " + c.value);
    }


}
