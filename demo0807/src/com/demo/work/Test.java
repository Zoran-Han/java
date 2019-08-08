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
            //获得工厂对象
            Factory factory = Factory.getInstance();
            //获取接口类实现对象
            Person person = factory.get("com.demo.work.impl.Student");
            Person person1 = factory.get("com.demo.work.impl.Boss");
            person.eat();
            person.sleep();
            person1.eat();
            person1.sleep();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
