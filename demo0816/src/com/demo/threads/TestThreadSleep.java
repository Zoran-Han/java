package com.demo.threads;


/**
 * @ClassName TestThreadSleep
 * 应用线程的sleep（）方法
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月16日  16:48:18
 * @Version 1.0.0
 */

public class TestThreadSleep {


    class PrintCharThread extends Thread{

       /* public PrintCharThread() {
            super();
        }*/

        @Override
        public void run(){
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("i= " + i);

                    sleep(1000);
                }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


    public static void main(String[] args) {
        Thread t = new TestThreadSleep().new PrintCharThread();
        t.start();
    }

}
