package com.demo.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName TestPerson
 * 测试人员数据封装注解应用
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月08日  14:01:03
 * @Version 1.0.0
 */

public class TestPerson {

    public  Person getPersonInstance() throws  Exception {
        //获得人员类的类信息对象
        Class classz =Person.class;
        //获得注解
        PersonDefaultAnnotation pda = (PersonDefaultAnnotation)
                classz.getAnnotation(PersonDefaultAnnotation.class);
       /* //获得注解属性
        String userName = pda.userName();
        String gender = pda.gender();
        int age = pda.age();
        //创建人员对象
        Person person = (Person) classz.newInstance();
        //设置属性
        Field field = classz.getDeclaredField("userName");
        field.setAccessible(true);
        field.set(person,userName);
        field = classz.getDeclaredField("gender");
        field.setAccessible(true);
        field.set(person,gender);
        field = classz.getDeclaredField("age");
        field.setAccessible(true);
        field.set(person,age);
        return person;*/

        //创建人员对象
        Person person = (Person) classz.newInstance();
        //获得人员对象的属性
        Field[] fields = classz.getDeclaredFields();
        for (Field field : fields){
            //取消访问权限检测
            field.setAccessible(true);
           /* //获得注解的Class对象
            Class aclass = pda.getClass();
            //获得当前属性对应的注解中的属性(在反射中当做方法处理)
            Method  method = aclass.getMethod(field.getName());
            //访问方法，获得注解中设置的值
            Object value  = method.invoke(pda);
            //给属性设置
            field.set(person,value);*/
            field.set(person,pda.getClass().getMethod(field.getName()).invoke(pda));
        }
        return person;


    }

    public static  void main(String[] args) throws Exception {
        TestPerson tp = new TestPerson();
        Person person = tp.getPersonInstance();
        System.out.println(person.getUserName()+" "+person.getGender()+" "+person.getAge());
        Person person1 = new Person();
        System.out.println(person1.getUserName()+" "+person1.getGender()+" "+person1.getAge());


    }
}
