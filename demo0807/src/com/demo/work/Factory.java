package com.demo.work;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  19:42:53
 * @Version 1.0.0
 */

public class Factory {

    /**
     * 定义数组存放实现类的对象
     */
    private static Person[]  per = new Person[10];


    static {

        try {
            Properties pro = new Properties();
            //加载属性文件
            pro.load(new FileInputStream("src/com/demo/work/information.properties"));
            String str = pro.getProperty("interface.impls");
            String[] path = str.split(",");
            for (int i= 0;i<path.length;i++ ) {
                //将获得的类名存入per[]数组
                per[i]  =  (Person) Class.forName(path[i]).newInstance();

            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public Person getInstance(String className) throws Exception{
        Person person = null;
        for (Person p : per){
            if (p!=null) {
                if (p.getClass().toString().endsWith(className)) {
                    person = p;
                }
            }
        }
        if (person==null) {
            throw new Exception("未找到类！");
        }

        return person;
    }

}
