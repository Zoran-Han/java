package com.demo.proxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName Client
 * 客户程序，使用代理对象，访问真是对象
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  16:07:24
 * @Version 1.0.0
 */

public class Client {

    public static void main(String[] args) {

        //使用静态代理
       /* Subject subject = new RealSubject();
        Subject proxy = new ProxySubject(subject);
        proxy.request();
        ((ProxySubject)proxy).method1();*/

        //使用动态代理
       //创建真实角色类对象作为目标对象
        Subject subject = new RealSubject();
        //创建动态代理对象
        DynamicProxySubject proxySubject = new DynamicProxySubject(subject);
        //将动态代理对象转型给抽象角色的类或接口的引用
        //Subject proxy = (Subject) proxySubject;//编译失败，不存在is-a关系
        //使用Proxy类创建代理类
        Subject proxy = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{Subject.class}, proxySubject);
        //访问真实角色类对象的方法
        proxy.request();
        proxy.method2();
    }
}
