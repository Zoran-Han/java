package com.demo.work;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName TestPerson
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月08日  16:44:50
 * @Version 1.0.0
 */

public class TestPerson1 {

    private SimpleDateFormat dateFormat = new SimpleDateFormat();
    /**
     * 使用反射解析对象
     * @param className
     * @return
     * @throws Exception
     */
    public Object getInstance(String className) throws Exception{
        Class classz = Class.forName(className);
        Object object = classz.newInstance();
        //获取所有的属性值
        Field[] fields = classz.getDeclaredFields();


        //遍历属性数组
        for (Field field : fields){
            //解除访问权限
            field.setAccessible(true);
            //获取属性所有的注解
            Annotation[] annotations = field.getDeclaredAnnotations();
            //遍历注解数组
            for (Annotation annotation :annotations){

                if (annotation instanceof DateAnnotation){
                    //获取属性中的value值
                    String value = ((DateAnnotation) annotation).value();
                    String patten = ((DateAnnotation) annotation).pattern();
                    //判断value是否为空,为空则设置时间，不为空怎修改时间格式
                    if ("".equals(value)){
                        field.set(object,new Date());
                    }
                    else{
                        //修改日期格式

                        dateFormat.applyPattern(patten);
                        field.set(object,dateFormat.parse(value));
                    }
                }
            }
        }

        return object;
    }

    public static void main(String[] args) {


        try {
            TestPerson1 tp = new TestPerson1();
            Person person =(Person) tp.getInstance("com.demo.work.Person");
            person.setName("哪吒三太子");
            person.setSex("男");
            person.setIdentityNum("1000503130369");
            System.out.println("姓名："+person.getName()+" 性别："+person.getSex()+
                    " 出生日期:"+person.getDate()+" 身份证号："+person.getIdentityNum());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
