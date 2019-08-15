package com.demo.collections;



interface ICalculator{
    public int sum(int x,int y);

    @Override
    public boolean equals(Object o);

    @Override
    public String toString();

    //public float substract(int x);
    //public int sum(int x,int y,int z);
}
/**
 * @ClassName TestLambda
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  17:36:14
 * @Version 1.0.0
 */

public class TestLambda  {

    public static void main(String[] args) {
        ICalculator ical = (x,y) ->x+y;   //Lambda目标类型必须是接口,且接口中只能有自定义的一个抽象方法,但是重写方法可以
        System.out.println(ical.sum(10,20));
    }
}
