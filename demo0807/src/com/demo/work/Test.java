package com.demo.work;

/**
 * @ClassName Test
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  19:43:16
 * @Version 1.0.0
 */

import com.demo.work.impl.Student;

/**
 * 定义工厂类，构建工厂对象时，创建所有的接口实现类对象；、
 * 工厂类定义方法，可以根据类名获取已经创建的实现类对象，若未找到对象就新建对象；
 * 定义测试类，定义方法，方法中通过接口访问不同实现类对象。
 */
public class Test {


    public static void main(String[] args){

        try {
            Factory factory = new Factory();
            Person person = factory.getInstance("Student");
            Person person1 = factory.getInstance("Boss");
            person.eat();
            person.sleep();
            person1.eat();
            person1.sleep();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
