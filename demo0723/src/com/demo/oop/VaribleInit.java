//指定包的路劲，指明类所占的位置，package必须是java源文件中第一行代码
package com.demo.oop;

/**
 * @ClassName 成员变量初始值
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  10:51:07
 * @Version 1.0.0
 */

public class VaribleInit {
    int i;
    float f;
    double d;
    char c;
    boolean b;
    int[] intArr;
    String  str;
    Customer cust;//类的初始值

    public void printMsg(){

        System.out.println("int:"+i); // 初始值 int:0
        System.out.println("float:"+f);//初始值 float:0.0
        System.out.println("double:"+d);//初始值 double:0.0
        System.out.println("char:"+c); //初始值 char:nul    (ASCLL:0) 输出结果为空白
        System.out.println("boolean:"+b); //初始值 boolean:false
        System.out.println("Arr:"+intArr);  //初始值 Arr:null
        System.out.println("String:"+str); //初始值 String:null
        System.out.println("Customer:"+cust); // 初始值 Customer:null


    }
    public void doubleOrfloat(){
        double d1 = 60;
        double d2 = 12;
        double result = d1 / d2;
        System.out.println("result= "+result);
    }
    //语句块
    public static void main(String[] args) {
        VaribleInit vi = new VaribleInit();
        vi.printMsg();
        vi.doubleOrfloat();

    }
}
