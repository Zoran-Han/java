package com.demo.oop;

class Parent{

    public  void printMsg(){
        System.out.println("cccc");
    }

}
/**
 * @ClassName InnerClass
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月25日  14:22:17
 * @Version 1.0.0
 */

public class InnerClass {
    //普通内部类
    private class  InnerA{
        public void printMsg(){
            System.out.println("内部类InnerA");
        }
    }

    //静态内部类
    public static class  InnerB{
        public void printMsg(){
            System.out.println("内部类InnerB");
        }
    }
    //局部内部类（方法本地内部类）
    public static void method(){
        //方法，语句块中只能使用final修饰符
        final class C{

                public void printMsg(){
                    System.out.println("内部类InnerC");
                }
            }
    }
    //语句块中的内部类相当于局部变量，可以重名
    {
        class C{

            public void printMsg(){
                System.out.println("内部类InnerC");
            }
        }
    }
    //匿名类，只能被实例一次，只能使用final修饰符
    final Parent p = new Parent(){
        //可以重写基类Parent类中的printMsg方法
        @Override
        public void printMsg(){
            System.out.println("匿名的内部类");
        }
        public void show(){
            //System.out.println("匿名的内部类");
        }

    };
    public void createInnerInstance(){
        InnerA innerA = new InnerA();
        InnerB innerB = new InnerB();

    }
    public static void createInnerInstance2(){
        //通过定义类的对象来创建对象
        InnerClass innerClass = new InnerClass();
        InnerA innerA1 = innerClass.new InnerA();
        //上面方式的简写
        InnerA innerA = new InnerClass().new InnerA(); //编译出错

        InnerB innerB = new InnerB();
        //通过类名来访问
        InnerB innerB2 = new InnerClass.InnerB();

    }
    public  static void main(String[] args){

    }

}
