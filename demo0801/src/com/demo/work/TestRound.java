package com.demo.work;

/**
 * @ClassName TestRound
 * 四舍五入功能
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月01日  19:11:14
 * @Version 1.0.0
 */

public class TestRound {



    public  void  rounds(double a,int b){

        //1.25   1.25*10  12.5+0.5>= math.floor(1.25*10+1)  reture 1.25

        double c = a * (Math.pow(10,b)) ;
        double d = Math.floor(c+1);

        if ( c+0.5 >= d){
            Double i =  a + Math.pow(10,-b);
            String str1 = Double.toString(i);
            //int in = str1.indexOf(".");
            String str2 = str1.substring(0,str1.indexOf(".")+(b+1));
            System.out.println(str2);

        }else{

            String str1 = Double.toString(a);
            String str2 = str1.substring(0,str1.indexOf(".")+(b+1));
            System.out.println(str2);


        }
    }

    public static void main(String[] args) {

        TestRound testRound = new TestRound();
        testRound.rounds(2.358,2);

    }

}
