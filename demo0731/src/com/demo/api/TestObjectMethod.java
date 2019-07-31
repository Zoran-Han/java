package com.demo.api;

/**
 * 学生类
 */
class Student {

    private String number; //学号
    private String name; //姓名
    private String gender; //性别

    public Student() {

    }

    public Student(String number) {
        this.number = number;
    }

    public Student(String number, String name, String gender) {
        this.number = number;
        this.name = name;
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

/**
 * 人员类
 */
class Person {

    private String number; //编号
    private String name; //姓名
    private String gender; //性别

    public Person() {
    }

    public Person(String number, String name, String gender) {
        this.number = number;
        this.name = name;
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return number+" "+name+" "+gender;
    }

    @Override
    public boolean equals(Object o) {
        //return this.number.equals(((Person) o).getNumber());
        Person p = (Person) o;
        return this.number.equals(p.getNumber());
    }
}

/**
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年07月31日 13:39:37
 */
public class TestObjectMethod {

    public static void main(String[] args) {
        /*Student student1 = new Student("00001", "张山", "男");
        Student student2 = new Student("00001", "李丽", "女");
        System.out.println(student1+"  "+student1.toString());
        System.out.println(student2+"  "+student2.toString());
        System.out.println("--------------------------------");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println("--------------------------------");
        System.out.println(student1==student2);
        System.out.println(student1.equals(student2));

        //int i = 0x1b6d3586;
        System.out.println(0X1b6d3586); //460141958*/

        Person p1 = new Person("0001", "张山", "男");
        Person p2 = new Person("0001", "李师师", "女");
        Person p3 = new Person("0002", "王武", "男");
        System.out.println(p1);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1==p3);
        System.out.println(p1.equals(p3));
    }

}
