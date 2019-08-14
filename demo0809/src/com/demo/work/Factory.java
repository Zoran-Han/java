package com.demo.work;

import java.io.File;
import java.util.ArrayList;

/**
 * @ClassName Factory
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月11日  21:07:29
 * @Version 1.0.0
 */

public class Factory {

    private static ArrayList arrayList = new ArrayList(20);

    /*//单例模式
    private static Factory factory;

    private Factory() {

    }

    *//**
     * 返回工厂的实例
     *
     * @return
     *//*
    public static Factory getInstance() {
        if (factory == null) {
            factory = new Factory();
        }
        return factory;
    }*/

    public static void find(File  dirPath) throws Exception {

        //创建目录对象
        File dir = new File("dirPath");
        //判断目录是否为目录
        File[] files = dirPath.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                //递归
                find(files[i]);

            }else{
                if (files[i].getName().toLowerCase().endsWith(".java")) {
                    String s = files[i].getPath().substring(4, files[i].getPath().length()-5).replace("\\",".");
                    arrayList.add(creator(s));
                }
            }
        }

    }
    public  static Object creator(String className) throws Exception{

       return Class.forName(className).newInstance();

    }

    public static void main(String[] args) {

        try {
            File file = new File("src\\");
            find(file);
            for (Object object : arrayList) {
                System.out.println(object);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





