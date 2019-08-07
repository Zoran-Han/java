package com.demo.reflection;

import com.demo.pojo.Person;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Properties;

/**
 * @ClassName TestIntrospector
 * //测试内省
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月06日  15:11:14
 * @Version 1.0.0
 */

public class TestIntrospector {


    public static  void main(String[] args){
        try {
            //创建Bean信息接口对象
            BeanInfo beanInfo = Introspector.getBeanInfo(Person.class);
            //获得所有属性的描述
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            //创建存放属性值的哈希表

            Hashtable params = new Hashtable();
            params.put("name","张三");
            params.put("gender","女");
            params.put("age",23);
            //创建Bean类对象
            Object object = Person.class.newInstance();

            //遍历属性数组
            for(PropertyDescriptor pd : propertyDescriptors){
                //获得属性名称
                String fieldName = pd.getName();
                //设置参数的值
                //System.out.println(fieldName);

                if(!"class".equals(fieldName)){
                    //获得setter()方法

                    Method method = pd.getWriteMethod();
                    //设值
                    //Bean类中未定义setter（）方法，运行时抛出空指针异常
                    method.invoke(object,params.get(fieldName));
                }
            }


            for(PropertyDescriptor pd : propertyDescriptors){
                String fieldName = pd.getName();

                //获取属性值
                if(!"class".equals(fieldName)){

                    //获得getter()方法
                    Method method = pd.getReadMethod();
                    //设值
                    //Bean类中未定义setter（）方法，运行时抛出空指针异常
                    //若未存储setter（）方法设置的值，将会返回代码中设置的默认值
                    System.out.println(method.invoke(object));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
