package com.demo.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName PersonDefaultAnnotation
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月08日  11:14:26
 * @Version 1.0.0
 */


@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

public @interface PersonDefaultAnnotation   {

        public String userName();
        public String gender() default "男";
        public int age() default 1;
        //public Class classz();

        //以下类型均不可用
       /* public Student stu(); //注释成员无效
        public Integer intt();
        public Object obj();*/
}
