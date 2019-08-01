package com.demo.basic;

/**
 * @ClassName TestVarAndMethod
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月22日  16:31:44
 * @Version 1.0.0
 */

public class TestVarAndMethod {
    //类变量
    static String name;
    static  double weight;
    //实例变量
    int age;
    double high;

    //类方法
    public static void setName(String name ){
        // 类方法中不能使用this关键字
        // this.name = name;
        TestVarAndMethod.name = name;
    }

    public static void getWeight(double weight){
        TestVarAndMethod.weight = weight;
    }

    //实例方法
    public   void setAge(int age){
        //实例才能使用this关键字，也可以使用this关键字访问类方法、类方法
        //this.name = "";//合法
        this.age = age;
    }
    public void getHigh(double high){
        //第一个high为类中定义的实例变量high，第二个high为该方法中的high
        this.high = high;
    }


    public  void show(){
        setName("Tom");
        setAge(21);
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }

    public  static  void printMsg(){
        setName("Tom");
       // setAge(21);  //非法
        System.out.println("name:"+name);
       // System.out.println("age:"+age); //非法
        TestVarAndMethod tv = new TestVarAndMethod();
        tv.setAge(21);
        System.out.println("age:"+tv.age);
    }
    /**
     * public 与static均为修饰符，编写代码时没有书写顺序问题（语法上）
     * @param args
     */
    public static void main(String[] args) {
        TestVarAndMethod tvam1 = new TestVarAndMethod();
        tvam1.setName("张三");
        tvam1.setAge(12);
        tvam1.getHigh(180.5);
        tvam1.getWeight(135.6);
        //测试类变量是类的所有对象共享的
        TestVarAndMethod tvam2 = new TestVarAndMethod();
        tvam2.setName("李四！");
        tvam2.setAge(22);
        System.out.println(tvam1.name +" "+tvam1.age+" "+tvam1.high+" "+tvam1.weight);
        System.out.println(tvam2.name +" "+tvam2.age);

    }
}
