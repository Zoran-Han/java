package com.demo.work;

/**
 * @ClassName Bank
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月19日  20:25:39
 * @Version 1.0.0
 */

public class Bank {


    //创建账户类
    private class Account {

        private int amount; //余额

        //存款
        public synchronized void inMoney(int inAmount) {
            amount = amount + inAmount;
            System.out.println("存款：" + inAmount + "\t\t余额：" + amount);
            notify();//等待

        }

        //取款
        public synchronized void outMoney(int outAmount) {

            try {
                if (outAmount > amount) {
                    wait();

                } else {
                    amount = amount - outAmount;
                    System.out.println("取款：" + outAmount + "\t\t余额：" + amount);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        //获得余额
        public int getAmount() {
            return this.amount;
        }

    }

    //创建取款线程
    private class OutMoney implements Runnable {
        private Account account;//创建账户

        @Override
        public void run() {
            try {
                while (true) {
                    int amount = (int) (Math.random() * 1000);
                    account.outMoney(amount);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public OutMoney(Account account) {
            this.account = account;
        }
    }

    //创建存款线程
    private class InMoney implements Runnable {

        private Account account;//创建账户

        @Override
        public void run() {
            try {
                while (true) {
                    int amount = (int) (Math.random() * 1000);
                    account.inMoney(amount);
                    Thread.sleep(1000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        public InMoney(Account account) {
            this.account = account;
        }
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        Account account = b.new Account();
        Thread in = new Thread(b.new InMoney(account));
        Thread out = new Thread(b.new OutMoney(account));
        in.start();
        out.start();

    }

}
