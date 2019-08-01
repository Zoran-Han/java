package com.demo.oop;
class A{

}
class B extends A{

}
class C extends B{

}
/**
 * @ClassName TestTransformation
 * 测试上下转型
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  16:38:57
 * @Version 1.0.0
 */
public class TestTransformation {


    /**
     * 使用instanceof关键字
     *
     * @param animal
     */
    public void method(Animal animal) {
        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.printMsg();
           // System.out.println("你是猫猫猫");
        } else if (animal instanceof Mouse) {
            Mouse mouse = (Mouse) animal;
            mouse.show();
            //System.out.println("你是鼠鼠鼠");
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
//        a = b;
//        b = c;
//        a = c;
        /*A a2 = c;
        B b2 = (B) a2;*/
        //A a2 = b;
        //  C c2 = (C) a2; //运行时出错
        System.out.println("程序执行完毕!");
        System.out.println("--------------------------");
        TestTransformation tt= new TestTransformation();
        Cat  cat = new Cat("Tom");
        Mouse mouse =new Mouse("Jirry","母");
        tt.method(cat);
        tt.method(mouse);
    }
}
