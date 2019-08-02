package com.demo.work;

/**
 * @ClassName TestFormat
 * 格式转换
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月01日  19:11:48
 * @Version 1.0.0
 */

public class TestFormat {

    private String  format(String string){

        String[] strings = string.split("");
        String s1 = "";
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].charAt(0) >= 48 && strings[i].charAt(0) <= 57){
                int index = Integer.parseInt(strings[i]);
                String s2 = "";
                for (int j = 0; j < index-1; j++) {
                    s2+=strings[i+1];
                }
                strings[i]=s2;
            }
        }
        for (String s:strings){
            s1+=s;
        }
        return s1.replace("-","@");
    }
    public static void main(String[] args){
            String str1 = "ttt5yjd-jdd4yh";     //tttyyyyyjd@jddyyyyh
            String str2 = "Hsdkf4sd-fsd3tr";   //Hsdkfssssd@fsd3tttr
            TestFormat te = new TestFormat();
            System.out.println(te.format(str1));
            System.out.println(te.format(str2));

        }


    }


