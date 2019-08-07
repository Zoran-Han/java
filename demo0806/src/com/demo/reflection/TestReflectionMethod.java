package com.demo.reflection;

import com.demo.pojo.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName TestReflectionMethod
 * 测试反射机制，访问方法
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月06日  13:48:53
 * @Version 1.0.0
 */

public class TestReflectionMethod {

    /**
     * 创建学生对象
     * @param name
     * @param gender
     * @param age
     * @return
     */
    public Student createStudent(String name,String gender,Integer age) throws  Exception {
        Class classz = Student.class;
        Student student =(Student)classz.newInstance();
        //获得方法并设置属性值
        Method method = classz.getMethod("setName", String.class);
        method.invoke(student,name);
        method = classz.getMethod("setGender", String.class);
        method.invoke(student,gender);
        method = classz.getMethod("setAge", Integer.class);
        method.invoke(student,age);
        return student ;

    }

    /**
     * 创建任意对象
     * @param classz
     * @param params
     * @return
     */
    public Object  creator(Class classz, Object[] params) throws Exception{
        //创建对象
        Object object = classz.newInstance();
        //获得所有的属性
        Field[] fields = classz.getDeclaredFields();
        for(int i = 0;i<fields.length;i++){
            //获得当前属性
            Field field=fields[i];
            //获得属性名
            String fieldName = field.getName();
            //获得方法名
            String methodName = "set"+ String.valueOf(fieldName.charAt(0)).toUpperCase()+fieldName.substring(1) ;
            //获得方法对象
            Method method = classz.getMethod(methodName,field.getType());
            //调用方法设置属性的值
            method.invoke(object,params[i]);
        }
        return  object;

    }

    public static void main(String[] args) throws Exception {
        TestReflectionMethod trm = new TestReflectionMethod();
        Student stu =trm.createStudent("宛如","女",22);
        System.out.println("姓名："+stu.getName()+" 性别："+stu.getGender()+" 年龄："+stu.getAge());
        System.out.println("------------------------");
        Student stu2 = (Student) trm.creator(Student.class,new Object[]{"小如","女",20});
        System.out.println("姓名："+stu2.getName()+" 性别："+stu2.getGender()+" 年龄："+stu2.getAge());
    }

}
