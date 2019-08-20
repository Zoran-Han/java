package com.demo.threads;

/**
 * @ClassName TestThreadJoin
 * 测试应用线程join（）方法
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月16日  16:55:40
 * @Version 1.0.0
 */

public class TestThreadJoin {


    public  class PrintCharThread extends Thread{
        @Override
        public void run(){
            try {
                Thread.sleep(5000);

                for (int i = 1; i <= 100; i++) {
                    System.out.print(i+" ");
                    if (i%10==0){
                        System.out.println();
                    }
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public class CommentThread extends Thread{
        private Thread thread;
        public CommentThread(Thread thread){
            this.thread=thread;
        }

        @Override
        public void run(){

            try {
                System.out.println("程序开始执行！");
                thread.join();//当前线程等待Thread线程结束
                System.out.println("程序结束执行！");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        TestThreadJoin ttj = new TestThreadJoin();
        Thread t1 = ttj.new PrintCharThread();
        Thread t2 = ttj.new CommentThread(t1);
        t1.start();
        t2.start();
    }

}
