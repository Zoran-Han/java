package com.demo.genericity;

class Person{

}

class Empyloyee extends Person{

}

class Manager extends Empyloyee{

}

class Company<T>{

    public void show(T t ){
        System.out.println("Welcome to  GanSu ，甘肃牛皮！");
    }
}
/**
 * @ClassName TestGenericityBound
 * 泛型的上限与下限
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  14:19:45
 * @Version 1.0.0
 */

public class TestGenericityBound {

    /**
     * 上限
     * @param company
     */
    public void method1(Company<? extends Person> company){

        company.show(null);


       /* 编译失败，只能传空值
        company.show(new Person());
        company.show(new Empyloyee());
        company.show(new Manager());
        company.show(new Object());
        */
    }

    /**
     * 下限
     * @param company
     */
    public void method2(Company<? super Person> company){
        company.show(null);

        company.show(new Person());
        company.show(new Empyloyee());
        company.show(new Manager());
        // company.show(new Object()); //编译失败
    }

    public static  void main(String[] args){

        TestGenericityBound te = new TestGenericityBound();

        //子类
        te.method1(new Company<Empyloyee>());
        //子类
        te.method1(new Company<Manager>());
        //本类
        te.method1(new Company<Person>());
        //te.method1(new Company<Object>());//编译失败，超出了泛型类型的范围上限
        //不给参数默认是本类
        te.method1(new Company<>());

        System.out.println("==============================================");

        //不给参数默认是本类
        te.method1(new Company<>());
        //父类
        te.method2(new Company<Object>());
        //本类
        te.method2(new Company<Person>());
        //te.method2(new Company<Empyloyee>());  //编译失败，超出了泛型类型的范围下限
        //te.method2(new Company<Manager>()); // 编译失败，超出了泛型类型的范围下限
    }
}
