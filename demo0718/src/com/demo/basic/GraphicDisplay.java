package com.demo.basic;

/**
 * 图形的显示
 * @author hzrobo
 * @version 1.0.0
 * @createTime 2019年07月18日 15:49:10
 */
public class GraphicDisplay {
    public static void main(String[] args) {
        int rowCount=5;
        System.out.println("-------直角三角形-------");
        for (int i = 1; i <=rowCount; i++) {
            for (int j = 1; j <=2*i-1; j++) {
                   System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------等腰三角形-------");
        for (int i = 1; i <=rowCount; i++) {
            for (int j = 1; j <=rowCount-i; j++) {
                System.out.print(" ");
                }
            for(int j=1; j<=2*i-1;j++){
                System.out.print('*');
            }
            System.out.println();
            }
        System.out.println("-------菱形-------");
        for (int i = 1; i <=rowCount*2-1; i++) {
            int scount = i<rowCount ? rowCount-i : -(rowCount-i);//计算空格的数量
            int ccount=i<rowCount ? 2*i-1 : 2*rowCount-1-2*(i-rowCount);//计算星号的数量

            for (int j = 1; j <=scount; j++) {
                System.out.print(" ");
            }

            for(int k=1;k <=ccount;k++){
                System.out.print('*');
            }
            System.out.println();
        }

    }
}


