package com.demo.proxy;

/**
 * @ClassName ProxySubject
 * 代理类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  16:01:56
 * @Version 1.0.0
 */

public class ProxySubject  implements Subject {

    /**
     * 定义抽象类变量，关联真是类对象
     */
    private Subject subject;

    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        subject.request();

    }

    @Override
    public void method2() {

    }

    public void method1(){

    }
}
