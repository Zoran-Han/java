package com.demo.threads;

/**
 * @ClassName TestStopThread
 * 异常结束线程
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月16日  17:11:45
 * @Version 1.0.0
 */

public class TestStopThread {


    public class PrintNumberThread extends Thread {
        @Override
        public void run() {
            try {


                for (int i = 1; i <= 100; i++) {
                    System.out.print(i + " ");
                    if (i % 10 == 0) {
                        System.out.println();
                    }
                    Thread.sleep(100);
                }

            } catch (InterruptedException e) {
                System.out.println("线程被异常中断！");
            }

        }

    }

    public static void main(String[] args) {

        Thread t = new TestStopThread().new PrintNumberThread();
        t.start();
        try {
            Thread.sleep(2000);
            t.interrupt();
        } catch (Exception e) {

        }
    }
}
