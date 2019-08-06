package com.demo.api;

import java.util.Random;

/**
 * @ClassName TestRandom
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月05日  14:05:34
 * @Version 1.0.0
 */

public class TestRandom {

    public static void main(String[]  args) {
        /**
         * 无参的构造函数，每次生成的随机数的的值不同
         */
        Random random = new Random();
        for(int i = 0;i<10;i++) {
            System.out.print(random.nextInt(100)+" ");
        }
        System.out.println();

        /**
         * 有参的构造方法，每次生成的随机数序列相同
         */
        Random random1 = new Random(100);
        for(int i = 0;i<10;i++) {
            System.out.print(random.nextInt(100)+" ");
        }
        System.out.println();

        Random random2 = new Random(10);
        for(int i = 0;i<10;i++) {
            System.out.print(random.nextInt(100)+" ");
        }
        System.out.println();
    }

}
