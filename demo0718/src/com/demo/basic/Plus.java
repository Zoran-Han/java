package com.demo.basic;

/**
 * 斐波那契数列的计算
 * @author hzrobo
 * @version 1.0.0
 * @createTime 2019年07月18日 16:56:10
 */
public class Plus {
    public static void main(String[] args){
        int a=1;
        int b=1;
        int len=20;
        int result =0;
        for(int i=1;i<=len;i++){
//
//            if(i==0){
//                System.out.print(a+" ");
//            }else if(i==1){
//                System.out.print(b+" ");
//            }else{
//                result = a + b;
//                a=b;
//                b=result;
//                System.out.print(result+" ");
//            }
           if(i>2){
               result = a + b;
               a=b;
               b=result;
               System.out.print(result+" ");
           }


        }
/*      int i=1;
        int j=1;
        int s=i+j;
        System.out.print(i+" "+j+" "+s+" ");
        int n=20;
        for(int k=0;k<n-3;k++){
            i=j;
            j=s;
            s=i+j;
            System.out.print(s+" ");
        }*/

    }

    }

