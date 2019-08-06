package com.demo.work;

import java.lang.reflect.Constructor;

/**
 * @ClassName ReflectionCreator
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月05日  18:49:44
 * @Version 1.0.0
 */

public class ReflectionCreator {
    /**
     * 可以创建并初始化任意类对象的通用方法
     *
     * @param className
     * @param param
     * @param value
     * @return
     */
    public Object creator(String className, Class[] param, Object[] value) throws Exception {
        //根据类名加载类
        Class class1 = Class.forName(className);
        //获得构造器
        Constructor constructor = class1.getConstructor(param);
        //创建对象
        Object object = constructor.newInstance(value);
        return object;
    }

    public static void main(String[] args) {
        ReflectionCreator re = new ReflectionCreator();
        //使用构造器创建对象
        try {
            Object employee = re.creator("com.demo.reflection.Employee",
                    new Class[]{Class.forName("java.lang.String"), String.class, int.class},
                    new Object[]{"小李","男",25});
            System.out.println(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
