package com.demo.basic;

/**
 * 流程控制
 *
 * @author hzrobo
 * @version 1.0.0
 * @createTime 2019年07月18日 10:09:55
 */
public class TestBasicFlow {
    public static void main(String[] args) {
        System.out.println("--------if ……else语句--------");
        int score = 80;
        if (score > 90) {
            System.out.println("该同学的成绩为优秀");
        } else if (score >= 80 && score <= 90) {
            System.out.println("该同学的成绩为良");
        } else if (score >= 70 && score < 80) {
            System.out.println("该同学的成绩为中");
        } else if (score >= 70 && score < 80) {
            System.out.println("该同学的成绩为合格");
            System.out.println("该同学的成绩为不合格");
        }
        System.out.println("--------switch语句--------");
        int score1 = 81;
        switch (score/10) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("合格");
                break;
            default:
                System.out.println("不合格");
        }
        System.out.println("--------while循环--------");
        //循环输出1-10十个数字
        //初始化语句，初始化用于迭代的变量
        //while 可以不被执行
        int i=1;
        while(i<=10){
            System.out.print(i+" ");
            //迭代变量，数值发生改变:累加或者累减
            i++;
        }
        System.out.println();
        System.out.println("--------do……while--------");
        //do……while至少被执行一次
        i=1;
        do {
            System.out.print(i+" ");
            i++;
        }while (i<=10);
        System.out.println();
        System.out.println("--------for循环--------");
        for(int j=1;j<=10;j++){
            System.out.print(j+" ");
        }
        System.out.println();
        System.out.println("--------跳转语句--------");
        //--------跳转语句--------
        int k = 1;
        for(;;){//合法
            if(i<=10){
                System.out.print(k+" ");
                k++;
            }else{
                System.out.println(" 你是猪");
                break;
            }

        }
        System.out.println("--------continue--------");
        for(int a=1;a<=10;a++){
            if(a==5){
                continue;
            }
            System.out.print(a+" ");
        }
        //break
//        System.out.println();
//        for(int a=1;a<=10;a++){
//            if(a==5){
//                break;
//            }
//            System.out.print(a+" ");
//        }
        System.out.println();
        System.out.println("--------嵌套循环，并给循环添加标记（标记需要满足标识符命名规则）--------");
        a: for(int b=0;b<5;b++){
             for(int c=1;c<=10;c++){
                if(c==5){
                    break a;//结束内层循环
                }
                System.out.print(c+" ");
            }
            System.out.println();

        }




    }
}



