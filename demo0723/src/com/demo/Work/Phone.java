package com.demo.Work;

/**
 * @ClassName Phone
 * 作业一
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月23日  19:36:36
 * @Version 1.0.0
 */

public class Phone {
    private String name;//手机品牌
    private double px;//像素
    private String  fingerprint;//手机指纹

    public String getName() {
        return name;
    }

    public double getPx() {
        return px;
    }

    public String isFingerprint() {
        return fingerprint;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPx(double px) {
        if(px <=2000){
            System.out.println("像素太低，请输入2000以上的像素");
            return;
        }

        this.px = px;
    }

    public void setFingerprint(String fingerprint) {
        if(!"Yes".equals(fingerprint) && !"No".equals(fingerprint)){
            System.out.println("输入有误，取值为：Yes|No ");
        }
        this.fingerprint = fingerprint;
    }

}
