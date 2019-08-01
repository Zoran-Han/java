package com.demo.basic;

/**
 * 作业
 * @author  hzrobo
 * @version 1.1.1
 * @createTime 2019年7月18日  19:34:11
 */
public class Test {
    public static  void main(String[] args) {
      /*  System.out.println("------------九九乘法表---------------");
        for(int i=1;i<10;i++){
            for (int j=1;j<10;j++){
                if(j>i){
                   break;

                }
                System.out.print(i+"×"+j+"="+i*j+" ");
            }
            System.out.println(" ");
        }*/

    /*    System.out.println("------------斐波那契数列---------------");
        int a = 1;
        int b = 1;
        int s = 0;
        int n = 20;
        for (int k = 1; k <= n; k++) {
            if (k > 2) {
                s = a + b;
                a = b;
                b = s;
                System.out.print(s+"  ");
            }
        }*/
        System.out.println("------------图形显示---------------");
        int row=5;
        //直角三角形
      /*  for(int i=1;i<=row;i++){
            for (int j=1;j<=2*i-1;j++){
                System.out.print("☆");
            }
            System.out.println(" ");
        }*/
        //等腰三角形
        /*for(int i=1;i<=row;i++){
            for (int j=1;j<=row-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
            System.out.print("☆");
        }
            System.out.println( );
        }*/

        //菱形
        for(int i=1;i<=2*row-1;i++) {
                int star= i<=row ? 2*i-1:2*row-2*(i-row)-1;//星星数
                int space=i<row ? row-i:i-row;//空格数
            for(int k=1;k<=space;k++){
                System.out.print("  ");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("☆");
            }
            System.out.println();
            }

        }
    }


