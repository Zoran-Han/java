package com.demo.basic;

/**
 * 图形的显示
 * @author hzrobo
 * @version 1.0.0
 * @createTime 2019年07月18日 15:30:10
 */
public class MultTable {
    public static void main(String[] args){
        System.out.println("----------九九算数乘法表----------");
         for(int i=1;i<10;i++){
            loop: for(int j=1;j<10;j++){
                 if(j>i){
                     //continue;
                     break loop;
                 }
                 System.out.print(i+"*"+j+"="+i*j+"  ");
                 }
             System.out.println();
             }



         }
    }

