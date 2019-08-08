package com.demo.genericity;

/**
 * @ClassName GenericityMethod
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  13:46:13
 * @Version 1.0.0
 */

public class GenericityMethod {


    /**
     * 泛型方法
     * @param t
     * @param <T> 调用方法时确定泛型类型，即参数的类型,
     * @return
     */
    public <T> T method(T t){

        return t;
    }

    /**
     * 泛型方法返回值类型有返回值来确定
     * @param t1
     * @param t2
     * @param <T>
     * @return
     */
    public <T> T method(T t1,T t2){

        //return (T)"初到山门，请多关照！";//可以进行强制类型转换
        return t2;
    }

    public static  void main(String[] args){

        GenericityMethod gm = new GenericityMethod();
        System.out.println( gm.method("Tom"));
        System.out.println( gm.method(12));
        System.out.println( gm.method(5.366) );
        System.out.println( gm.method(10,150000) );
        System.out.println( gm.method("jack",5.366) );

    }

}
