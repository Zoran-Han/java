package com.demo.Work;

/**
 * @ClassName TestPhone
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  19:56:22
 * @Version 1.0.0
 */

public class TestPhone extends  Phone{

    public static void main(String[] args) {
        TestPhone te = new TestPhone();
        te.setName("Iphone4");
        te.setPx(5000);
        te.setFingerprint("No");
        System.out.println("品牌："+te.getName()+"  像素： "+te.getPx()+"  是否可以指纹解锁： "+te.isFingerprint());
    }
}
