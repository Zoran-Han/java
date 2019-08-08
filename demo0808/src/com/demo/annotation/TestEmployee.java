package com.demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @ClassName TestEmployee
 * 测试职员类中的应用的日期注解
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月08日  15:28:33
 * @Version 1.0.0
 */

public class TestEmployee {

    /**
     * 创建时间格式化对象
     */
    private SimpleDateFormat dateFormat = new SimpleDateFormat();

    /**
     * 使用反射解析对象，同时解析注解
     * @param className
     * @return
     * @throws Exception
     */
    public Object getInstance(String className) throws  Exception{

        Class classz = Class.forName(className);
        Object object = classz.newInstance();

        //获得所有属性
        Field[] fields = classz.getDeclaredFields();
        //遍历属性数组
        for(Field field:fields){
            //取消属性访问权限检测,即运行访问
            field.setAccessible(true);
            //获得属性的所有注解
            Annotation[] annotations = field.getDeclaredAnnotations();
            //遍历属性的注解数组
            for (Annotation annotation:annotations){
                if (annotation instanceof DateAnnotation){
                    //下转型
                    DateAnnotation dateAnnotation =(DateAnnotation)annotation;
                    //获得注解中的属性值  value
                    String value = dateAnnotation.value();
                    String patten = dateAnnotation.pattern();
                    //判断value是否为空字符串
                    if ("".equals(value)){
                        //新建日期对象赋值给标注的属性
                        field.set(object, new Date());

                    }else {
                        //修改日期格式
                        dateFormat.applyPattern(patten);
                        //格式化value时间字符串，生成日期对象，赋值给注解标注的属性
                        field.set(object,dateFormat.parse(value));
                    }
                }
            }
        }

        return object;
    }

    public static void  main(String[] args){


        try {
            TestEmployee te = new TestEmployee();
            Employee emp = (Employee) te.getInstance("com.demo.annotation.Employee");
            System.out.println(emp.getInTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
