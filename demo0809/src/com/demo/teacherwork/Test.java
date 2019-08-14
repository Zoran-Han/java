package com.demo.teacherwork;

import com.demo.io.TestInputStream;
import com.demo.teacherwork.impl.PersonServiceImpl;
import com.demo.teacherwork.pojo.Person;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @ClassName Test
 * 测试类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  14:44:08
 * @Version 1.0.0
 */

public class Test {

    @Autowried
    private PersonServiceImpl personService;


    public  void method(){
        personService.method();
    }

    public static void main(String[] args) {

        try {
            Test test = (Test) AutoWriedResolver.getInstance(Test.class);
            TestAutoWried testAuto = (TestAutoWried)AutoWriedResolver.getInstance(TestAutoWried.class);
            test.method();
            testAuto.service();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
