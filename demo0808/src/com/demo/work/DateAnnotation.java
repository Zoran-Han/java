package com.demo.work;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @AnnotaitionName DateAnnotation
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月08日  16:29:58
 * @Version 1.0.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)

public @interface DateAnnotation {

    //value 是注解的默认属性
    public String value() default "";
    public String pattern() default "yyyy/MM/dd HH:mm:ss";

}
