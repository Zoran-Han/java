package com.demo.threads;

/**
 * @ClassName TestThreadSync
 * 线程同步
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月19日  16:03:28
 * @Version 1.0.0
 */

public class TestThreadSync {

    /**
     * 账户类
     */
    private class Account{

        private Integer amount = 0;//余额 ，在使用wrapper类型时，必须赋初值，因为wrapper是引用类型，默认值为null

      /**
       * 存款
       * 同步方法格式
       * @param inAmount
       */
        public synchronized void deposit(int inAmount){

            try {
                //获得存款金额
                int amount = this.amount;
                Thread.sleep(1000);
                this.amount = amount + inAmount;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        /**
         * 存款
         * 同步语句块格式
         * @param inAmount
         */

      /*  public  void deposit(int inAmount){

            try {
                synchronized (this) {
                    //获得存款金额
                    int amount = this.amount;
                    Thread.sleep(10);

                    this.amount = amount + inAmount;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
*/
        /**
         * 获得余额
         * @return
         */
        public Integer getAmount(){

            return this.amount;
        }

    }

    /**
     * 存钱的线程
     */
    private class DepositRunnable implements Runnable{

        private Account account; //声明账户类型变量


        public DepositRunnable(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            account.deposit(10);

        }

    }

    public static void main(String[] args) {

        try {
        TestThreadSync tts = new TestThreadSync();
        //创建资源对象
        Account account = tts.new Account();

        //创建线程组的对象
        ThreadGroup group = new ThreadGroup("accountThreadGroup");

        //循环创建线程并添加到线程组中
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(group,tts.new DepositRunnable(account));
            t.start();
        }

        //等待线程组中所有线程结束
        while (group.activeCount()>0){

            Thread.sleep(100);
        }
        //输出账户余额
            System.out.println("您的账户余额："+account.getAmount());

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
