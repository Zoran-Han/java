package com.demo.threads;

/**
 * @ClassName TestThreadWaitNotify
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月19日  16:57:50
 * @Version 1.0.0
 */

public class TestThreadWaitNotify {


    /**
     * 账户类
     */
    private class Account {

        private Integer amount = 0;//余额

        /**
         * 存款
         * @param inAmount
         */
        public synchronized void deposit(int inAmount) {
            amount = amount + inAmount;
            System.out.println("存入：¥ " + inAmount + "\t\t\t取出：¥ 0 \t\t\t余额：¥ " + amount);
            notify();
        }

        /**
         * 取款
         *
         * @param outAmount
         */
        public synchronized void withdraw(int outAmount) {

            try {
                if (outAmount > amount) {
                    //让当前线程等待
                    wait();
                } else {
                    amount = amount - outAmount;
                    System.out.println("存入：¥ 0\t\t\t取出：¥" + outAmount + "\t\t\t余额：¥ " + amount);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        /**
         * 获得余额
         *
         * @return
         */
        public Integer getAmount() {

            return this.amount;
        }
    }

    /**
     * 存款线程
     */
    private class DepositRunnable implements Runnable {
        public Account account;//创建账户类

        @Override
        public void run() {

            try {
                while (true) {
                    //生成随机数
                    int amount = (int) (Math.random() * 500);
                    account.deposit(amount);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public DepositRunnable(Account account) {
            this.account = account;
        }
    }

    /**
     * 取款线程
     */
    private class WithdrawRunnable implements Runnable {
        public Account account;

        public WithdrawRunnable(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    //生成随机数
                    int amount = (int) (Math.random() * 500);
                    account.withdraw(amount);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public static void main(String[] args) {

        TestThreadWaitNotify ttwn = new TestThreadWaitNotify();
        Account account = ttwn.new Account();
        Thread depositThread = new Thread(ttwn.new DepositRunnable(account));
        Thread withdrawThread = new Thread(ttwn.new WithdrawRunnable(account));
        depositThread.start();
        withdrawThread.start();

    }

}
