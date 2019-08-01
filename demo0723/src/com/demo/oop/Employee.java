package com.demo.oop;

/**
 * @ClassName Employee
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  15:48:20
 * @Version 1.0.0
 */

public class Employee extends Person {
    public void method(){

        // int age = super.age;
        super.age = 58;
        super.printMsg();
        // super.show();//无法访问
    }

    public Employee(){

        super("王八");
        System.out.println("子类构造方法");
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.printMsg();
        emp.name = "李四";
        emp.age = 36;
        emp.gender = "男";
        emp.printMsg();
        //emp.show();//无法访问权限
        emp.method();
    }
}
