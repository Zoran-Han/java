package com.demo.basic;
/**
 * 基础语法测试
 * 数据类型、运算符以及表达式
 * @author hzrobo
 * @create2019年07月17日 15:30：25
 * @version 1.0.0
 */
public class TestBasicStatement {
    /**
     * 主函数
     * @param args
     */
    public static void main (String[] args){
        //自增、自减运算
        System.out.println("----------自增、自减运算-----------");
        int i = 1;
        /*int j = ++i;//先自增，再运算
        System.out.println("i="+i+",j="+j );*/
        int j =i++;//先运算，后自增
        System.out.println("i="+i+",j="+j );

        //逻辑运算符
        System.out.println("----------逻辑运算符-----------");
        System.out.println(true&&false);
        System.out.println(true&&true);
        System.out.println(true||false);
        System.out.println(false||false);
        System.out.println(true&false);
        System.out.println(true&true);
        System.out.println(true|false);
        System.out.println(false|false);
        int x = 1;
        System.out.println(3 > 2||x++>1);// 其中||为简单运算 ，如果左边表达式可以确定表达式的值，右边表达式就不会执行
        System.out.println("x="+x);
        System.out.println("----------位运算-----------");
        System.out.println(true&false);
        System.out.println(1&3);// 00000001  00000011按位与
        //System.out.println(true&3);//语法错误
        System.out.println("----------移位运算-----------");
        //0000010   00001000
        int a=2;
        a = a << 5;  //数字1表示移动1位，<<表示向左移动 移动几位相当于乘几个二
        System.out.println("a="+ a);
        System.out.println("----------进制转换-----------");
        //定义二进制、八进制、十六进制
        System.out.println(0B00001000);//0b 、0B大小写一样的   零B开头表示八进制
        System.out.println(015);//零开头表示八进制
        System.out.println(0x1F);//零x 开头表示八进制  0x、0X大小写一样的
        System.out.println("----------数值表示符号-----------");
        //l L long     f  F float   d  D  double
        long l = 100;//整型数值默认是int型
        long l1 = 12345678910L;
        float f = 10;
        float f1 = 10.0f;//浮点型默认是double型，
        double d = 10.0;
        double d1 = 10.5d;
        System.out.println("----------数据类型----------");
        char c1 = 'e';
        char c2 = '渝';
        char c3 = '\u4E07';
        int 整型变量 = 100;//定义标识符可以使用汉字
        System.out.println(c1+" "+c2+" "+c3+" "+整型变量+"");
        byte b = 1;
        short s = 1;
        char c = 'A';
        int i1 =b;
        i1 = s;
        i1 =c;
       // short s1 = c; //不能自动类型转换
        short s1 = 'A';//字符常量可以直接赋值给byte、short
        byte b1 = 'A';
        System.out.println(s1+"  "+b1);//输出的是ASCII码
        int i2 = '渝';
        System.out.println(i2);//输出的是Unicode编码
        System.out.println("----------强制数据类型转换-----------");
        char c4 = (char) i2;
        System.out.println("c4="+ c4);
        //扩展
        double d3 = (char) i2;
        System.out.println("i2="+ i2);
        //强制类型转换可能会发生数值精度的丢失
        int i4 = 128; //00000000 00000000 00000000 10000000
        byte b4 =(byte)i4; //10000000 减一 01111111  取反 10000000   高位为1  认定为负数
        System.out.println("b4="+b4);
        System.out.println("----------优先级----------");
        int x5=1,y5=2;
       // int z5=x5+++y5*y5;//1+2*2
      //  int z5=x5+ ++y5*y5;//1+3*3
        int z5=x5---y5*y5;//1-2*2
        System.out.println("z5="+z5);

  }
}
