package com.demo.threads;

/**
 * @ClassName TestDaemonThread
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月19日  11:27:01
 * @Version 1.0.0
 */

public class TestDaemonThread {

    class DaemonThread extends Thread {
        public void run() {
            while (true) {
                try {
                    System.out.println("正在监控。。。。");
                    Thread.sleep(5000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private class printNumber extends Thread {
        @Override
        public void run() {
            try {
                for (int i = 1; i <= 100; i++) {
                    System.out.print(i + "  ");
                    if (i % 10 == 0) {
                        System.out.println();
                    }
                    sleep(100);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        TestDaemonThread t = new TestDaemonThread();
        Thread t1 = t.new DaemonThread();
        Thread t2 = t.new printNumber();
        //将线程t1标记为守护线程
        t1.setDaemon(true);
        t1.start();
        t2.start();

    }

}
