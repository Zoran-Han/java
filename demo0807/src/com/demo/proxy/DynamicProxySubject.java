package com.demo.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName DynamicProxySubject
 * 动态代理类
 * 不论真实角色类中存在多少个方法，动态代理类中只需要重写一个invoke（）方法，就可以访问真是角色对象中不同的方法
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  16:30:30
 * @Version 1.0.0
 */

public class DynamicProxySubject implements InvocationHandler {


    /**
     * 目标对象（真实角色对象）
     */
    private Subject subject ;

    public  DynamicProxySubject(Subject subject){
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //访问真实角色对象的方法
        Object result = method.invoke(subject,args);
        return result;
    }
}
