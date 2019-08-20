package com.demo.threads;

/**
 * 继承Thread类创建线程
 */
class PrintCharThread extends Thread{

    private char chr;//输出的字符
    private int time = 50;//输出的次数

    public PrintCharThread(){

    }

    public PrintCharThread(char chr) {
        this.chr = chr;
    }

    public PrintCharThread(char chr, int time){
        this.chr = chr;
        this.time = time;
    }
    @Override
    public void run() {

        for (int i = 0; i < time; i++) {
            System.out.print(chr+" ");
        }
    }
}

/**
 * 实现Runnable接口创建线程
 */
class PrintCharRunnable implements Runnable{

    private char chr;//输出的字符
    private int time = 50;//输出的次数

    public PrintCharRunnable() {
    }

    public PrintCharRunnable(char chr, int time) {
        this.chr = chr;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < time; i++) {
            System.out.print(chr+" ");
        }
    }
}


/**
 * @ClassName TestTwoThread
 * 两种创建线程的方式
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月16日  16:02:25
 * @Version 1.0.0
 */

public class TestTwoThread {

    public static void main(String[] args) {
        //创建线程对象
        Thread t1 = new PrintCharThread('A',200);
        Thread t2 = new PrintCharThread('B',200);
        //启动线程
        t1.start();
        t2.start();

        Thread t3 = new Thread(new PrintCharRunnable('P',200));
        t3.start();

    }
}
