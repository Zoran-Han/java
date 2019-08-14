package com.demo.teacherwork;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @AnnotaitionName Autowried
 * 自定义自动装在对象的注解
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  14:40:27
 * @Version 1.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)

public @interface Autowried {

}
