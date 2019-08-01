package com.demo.Work;

import java.sql.SQLOutput;

/**
 * @ClassName TestSingleton
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  09:31:06
 * @Version 1.0.0
 */

public class TestSingleton {

    public static void main(String[] args) {
        // Singleton s = new Singleton();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);

    }
}
