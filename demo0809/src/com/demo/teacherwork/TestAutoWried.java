package com.demo.teacherwork;

import com.demo.teacherwork.impl.PersonServiceImpl;
import com.demo.teacherwork.pojo.Person;

/**
 * @ClassName TestAutoWried
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  15:16:46
 * @Version 1.0.0
 */

public class TestAutoWried {

    @Autowried
    private PersonServiceImpl personService;

    public void service(){
        personService.method();
    }

}
