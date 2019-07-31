package com.demo.api;

/**
 * 工作卡
 */
class BankCard implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

/**
 * 职员类
 * 浅度克隆
 */
class Employee implements Cloneable {

    private String name;
    private double salary;
    private BankCard bankCard;

    public Employee() {
    }

    public Employee(String name, double salary, BankCard bankCard) {
        this.name = name;
        this.salary = salary;
        this.bankCard = bankCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

/**
 * 经理类
 * 深度克隆
 */
class Manager implements Cloneable {

    private String name;
    private double salary;
    private BankCard bankCard;

    public Manager() {
    }

    public Manager(String name, double salary, BankCard bankCard) {
        this.name = name;
        this.salary = salary;
        this.bankCard = bankCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public BankCard getBankCard() {
        return bankCard;
    }

    public void setBankCard(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager manager = (Manager) super.clone();
        manager.setBankCard((BankCard) manager.getBankCard().clone());
        return manager;
    }
}

/**
 * 浅度克隆与深度克隆
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 15:46:57
 */
public class TestClone {

    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee("张山", 6000, new BankCard());
            Employee emp2 = (Employee) emp1.clone();
            System.out.println(emp1.getName()+" "+emp1.getSalary()+" "+emp1.getBankCard());
            System.out.println(emp2.getName()+" "+emp2.getSalary()+" "+emp2.getBankCard());
            System.out.println(emp1+" "+emp2);
            System.out.println(emp1==emp2);
            System.out.println("----------------------------------");
            Manager man1 = new Manager("王武", 9000, new BankCard());
            Manager man2 = (Manager) man1.clone();
            System.out.println(man1.getName()+" "+man1.getSalary()+" "+man1.getBankCard());
            System.out.println(man2.getName()+" "+man2.getSalary()+" "+man2.getBankCard());
            System.out.println(man1+" "+man2);
            System.out.println(man1==man2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
