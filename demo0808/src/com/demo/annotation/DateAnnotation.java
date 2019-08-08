package com.demo.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *@AnnotaitionName DateAnnotation
 *  处理日期的注解
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月08日  14:01:03
 * @Version 1.0.0
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface DateAnnotation {

    public String value() default "";
    public String pattern() default "yyyy-MM-dd HH:mm:ss";

}
