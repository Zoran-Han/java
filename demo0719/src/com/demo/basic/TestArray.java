package com.demo.basic;

/**
 * 测试数组
 * @author
 * @createTime 2019年07月19日 09:40:30
 * @version  1.0.0
 */
public class TestArray {

    public  static void main(String[] args){
        //三种声明数组的方式
      /*  int[] intarr1;
        int intarr2[];
        int  []intarr3;*/
      //创建数组，数组的初始化
        //静态初始化
        int[] arr1 = {1, 10, 100};
        //动态初始化
        int[] arr2 = new int[5];
        int[] arr3 = new int[]{10, 100, 1000, 10000};
        String[] arr4 = new String[5];
        boolean[] arr5 = new boolean[5];
        float[] arr6 = new float[5];
        //获取数组元素的值
        int el1 = arr1[0];
        int el2 = arr2[0];
        int el3 = arr3[arr3.length-1];
        String el4 = arr4[0];
        boolean el5 = arr5[0];
        float el6 = arr6[0];
        System.out.println(el1);
        System.out.println(el2);
        System.out.println(el3);
        System.out.println(el4);
        System.out.println(el5);
        System.out.println(el6);
        //循环修改素组中的元素
        System.out.println("--------------------------");
        for(int i=0;i<arr2.length;i++){
            //修改元素的值
            arr2[i] = 2*i+1; //赋值为奇数
        }
        //循环输出数组中的元素
        // for……each循环
        for(int i : arr2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("数组arr3的长度为："+arr3.length);
        System.out.println("--------------------------");
        /*//二维数组的声明
        int[][] intArr1;
        int intArr2[][];
        int [][]intArr3;
        int[]  intArr4[];
        int []intArr5[];
        int[] []intArr6;*/

        /*int[][] intArr1 = {{10,100,1},{200,400,600,800},{30,300,3000,30000}};
        int intArr2[][] = new int[3][3];
        int intArr3[][] = new int[3][];
        int intArr4[][] = new int[][]{{1,5,6},{2,5,8},{10,100,500,50000}};
        //二维数组的遍历
        for(int i=0;i<intArr4.length;i++){
            for(int j=0;j<intArr4[i].length;j++){
                System.out.print(intArr4[i][j]+" ");
            }
            System.out.println();
        }*/
        //扩展三维
        //int intArr[][][]=new int[3][][];
        //创建二维数组，固定所有的长度
        int[][] intArr = new int[3][3];
        //给二位数组中的元素赋值
        intArr[0][0] = 1;   //给二维数组中的第一个"一维"数组元素赋值
        intArr[1][1] = 5;
        intArr[2][2] = 9;
        //遍历数组
        for(int i=0;i<intArr.length;i++){
            for(int j=0;j<intArr[i].length;j++){
                System.out.print(intArr[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("-------------foreach----------");
        for(int []subArr : intArr){
            for(int e1 : subArr){
                System.out.print(e1+"   ");
            }
            System.out.println();
        }

         //创建二维数组，只固定二维数组的长度
        System.out.println("-------------------------------");
        /*char[][] chrArr = new char[3][];
        char[] subArr1 = new char[1];
        chrArr[0]  =subArr1;
        chrArr[1] =new char[2];
        chrArr[2] =new char[3];
        subArr1[0] = 'A';
        chrArr[1][1] = 'B';
        chrArr[2][2] = 'C';*/
        char[][] chrArr = new char[3][];
        //给二维数组中的每个一维数组进行初始化并且对部分一维数组进行赋值，最后遍历数组
        chrArr[0]  =new char[1];
        chrArr[1] =new char[2];
        chrArr[2] =new char[3];
        chrArr[0][0] = 'A';
        chrArr[1][1] = 'B';
        chrArr[2][2] = 'C';
        for(char[] subArr:chrArr){
            for(char el:subArr){
                System.out.print( el+"   ");
            }
            System.out.println();
        }



    }
}
