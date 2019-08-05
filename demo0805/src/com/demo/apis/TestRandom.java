package com.demo.apis;

import java.util.Random;

/**
 * 测试随机数生成器
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月05日 14:05:32
 */
public class TestRandom {

    public static void main(String[] args) {
        Random random = new Random();
        for(int i=0; i<10; i++) {
            System.out.print(random.nextInt(100)+" "); //输出0...100(不包括)之间的随机数
        }
        System.out.println();
        random = new Random();
        for(int i=0; i<10; i++) {
            System.out.print(random.nextInt(100)+" ");
        }
        System.out.println();

        random = new Random(100);
        for(int i=0; i<10; i++) {
            System.out.print(random.nextInt(100)+" ");
        }
        System.out.println();
        random = new Random(100);
        for(int i=0; i<10; i++) {
            System.out.print(random.nextInt(100)+" ");
        }
        System.out.println();
        random = new Random(10); //有参数的构造方法，每次生成的随机数序列相同
        for(int i=0; i<10; i++) {
            System.out.print(random.nextInt(100)+" ");
        }
        System.out.println();
    }

}
