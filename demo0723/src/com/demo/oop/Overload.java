package com.demo.oop;

/**
 * @ClassName 方法的重载
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  16:27:04
 * @Version 1.0.0
 */

public class Overload {

    public void method(){
        System.out.println("重载方法1");

    }
    public void method(int x){
        System.out.println("重载方法2");
    }
    public void method(long l){
        System.out.println("重载方法3");
    }
    public void method(int x,int y){
        System.out.println("重载方法4");
    }
   /* public void method(char[] chrArr){
        System.out.println("重载方法5");
    }
    public void method(String str){
        System.out.println("重载方法6");
    }
*/
   public void method(Person person){
       System.out.println("重载方法7");
   }
    public void method(Employee employee){
        System.out.println("重载方法8");
    }
    public static void main(String[] args) {
        Overload ol =new Overload();
        ol.method();
        ol.method(10);
        ol.method(10l);
        ol.method(34,56);
        //ol.method(null);//报错原因是由多个方法可以接受null参数值，匹配到多个方法，编译时无法确定调用哪个方法
       // ol.method(new char[5]);
        ol.method(null);//多个方法可以接收null参数值，匹配多个方法，但是方法的参数类型均存在继承关系，则调用的是子类作为参数的方法



    }
}
