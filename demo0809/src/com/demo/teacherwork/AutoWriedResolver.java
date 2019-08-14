package com.demo.teacherwork;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @ClassName AutoWriedResolver
 * 注解解析器类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  15:21:42
 * @Version 1.0.0
 */

public class AutoWriedResolver {

    /**
     * 创建并返回实例对象
     * 查找使用了@Autowried注解属性，为其赋予相应的对象
     */
    public static Object getInstance(Class classz) throws Exception{
        //创建工厂容器对象
        CreatorFactory factory = CreatorFactory.getInstance("com.demo.teacherwork");
        //创建对象
        Object object =classz.newInstance();
        //获得类的所有属性
        Field[] fields = classz.getDeclaredFields();
        //遍历属性数组
        for (Field field :fields) {
            //获得自动装载注解
            Annotation anno = field.getAnnotation(Autowried.class);
            //判断是否获得自动装在注解
            if (anno!=null){
                //查找工厂容器中的对象
                Object fieldObject = factory.find(field.getType());
                //赋值给当前属性
                field.setAccessible(true);//取消访问权限检测
                field.set(object,fieldObject);
            }

        }
        return object;
    }

}
