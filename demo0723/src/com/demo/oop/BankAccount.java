package com.demo.oop;

/**
 * @ClassName BankAccount
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月22日  20:21:18
 * @Version 1.0.0
 */

public class BankAccount {
    /*String cardNum;//卡号
    double balance;//余额

    //创建存款类
    public double Deposit(String cardNum,double balance,double deNum) {
        if (cardNum == this.cardNum) {
            System.out.println("账户余额为：" + balance);
            balance += deNum;
            System.out.println("存款:" + deNum +"  "+ "余额为：" + balance);
        } else {
            System.out.println("友情提示：请核对卡号！");
        }
        return balance;
    }

    //创建取款类
    public  void Withdrawal(String cardNum, double balance,double withdrawalNum){
        if(cardNum == this.cardNum) {
            System.out.println("账户余额为：" + balance);
            if (balance>= withdrawalNum) {
                balance -= withdrawalNum;
                System.out.print("取款：" + withdrawalNum+"  ");
                System.out.println("余额为：" + balance);
            } else {
                System.out.println("余额不足，请先努力存款！");
            }
        }else{
            System.out.println("友情提示：请核对卡号！");
        }
    }

    //创建构造函数，初始化变量
    public void BankAccount(String cardNum,double balance){
        this.cardNum = cardNum;
        this.balance = balance;

    }*/
    String accountNumber;//卡号
    double amount;//余额

    /**
     * 构造方法的初始化
     * @param accountNumber
     * @param amount
     */
    public BankAccount(String accountNumber,double amount){
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    /**
     * 存款
     * @param amount
     */
    public void deposit(double amount){
        this.amount += amount;
        System.out.println("卡号："+accountNumber+"存入金额："+ amount +"  余额："+this.amount);
    }

    /**
     * 取款
     * @param amount
     */
    public  void withdrawal(double amount){
        //判断余额是否足够
        if (this.amount < amount){
            System.out.println("卡号："+accountNumber+"余额不足！");
            return;//直接结束执行
        }
        //余额中扣除取出金额
      this.amount -= amount;
        System.out.println("卡号："+accountNumber+"取出金额："+ amount+"  余额："+this.amount);
        }

    public static void main(String[] args) {
         /* BankAccount ba = new BankAccount();
        ba.BankAccount("6217004310008888",1000.00);
        ba.Deposit("6217004310008888",5000.00,1000);
        ba.Withdrawal("6217004310008888",5000.00,4000.00);*/
        BankAccount ba = new BankAccount("6317004310002222",100.0);
        ba.withdrawal(200);
        ba.deposit(500);
        ba.withdrawal(200);


    }
}
