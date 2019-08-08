package com.demo.work;

import jdk.nashorn.internal.objects.annotations.Property;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  19:42:53
 * @Version 1.0.0
 */

public class Factory {

    /**
     * 定义数组存放实现类的对象
     */
    private static Person[]  per = new Person[10];
    //单例模式
    private static Factory factory;

    private Factory(){
        init();

    }

    /**
     * 返回工厂的实例
     * @return
     */
    public static Factory getInstance(){
        if (factory==null){
            factory = new Factory();
        }
        return factory;
    }

    private  void init(){

        try {

            Properties props = new Properties();
            props.load(new FileInputStream("src/com/demo/work/information.properties"));
            String[] classPaths = props.getProperty("interface.impls")==null
                    ? new String[]{}:props.getProperty("interface.impls").trim().split(",");
            for (int i= 0;i<classPaths.length;i++ ) {
                //将获得的类名存入per[]数组
                per[i]  =  (Person) Class.forName(classPaths[i]).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /*static {

        try {
            Properties pro = new Properties();
            //加载属性文件
            pro.load(new FileInputStream("src/com/demo/work/information.properties"));
            String str = pro.getProperty("interface.impls").trim();
            String[] path = str.split(",");
            for (int i= 0;i<path.length;i++ ) {
                //将获得的类名存入per[]数组
                per[i]  =  (Person) Class.forName(path[i]).newInstance();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


    /**
     * 查找工厂中的对象
     * @param className
     * @return
     * @throws Exception
     */
    public Person get(String className) throws Exception {
        /*Person person = null;
        for (Person p : per){
            if (p!=null) {
                if (p.getClass().toString().endsWith(className)) {
                    person = p;
                }
            }
        }
        if (person==null) {
            throw new Exception("未找到类！");
        }

        return person;*/
        for (Person p : per) {
            if (p.getClass().getName().equals(className)) {
                return p;
            }
        }

        //未找到，新建对象
        System.out.println("未找到对象，新建对象！");
        return (Person)Class.forName(className).newInstance();
    }

}
