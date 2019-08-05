package com.demo.api;

import java.io.IOException;

/**
 * @ClassName TestRuntime
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月02日  16:43:54
 * @Version 1.0.0
 */


public class TestRuntime {
    //"C:\Program Files (x86)\Microsoft Office\root\Office16\WINWORD.EXE"

    public static void main(String[] args){

        Runtime runtime = Runtime.getRuntime();
        //打开word文档

        try {
            runtime.exec("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\WINWORD.EXE " +
                    "E:\\ChianSoft\\课程记录\\Java从入门到精通_笔记.docx");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
