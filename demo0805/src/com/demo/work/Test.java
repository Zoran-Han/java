package com.demo.work;

/**
 * @author Teacher
 * @version 1.0.0
 * @createTime 2019年08月05日 10:23:48
 */
public class Test {

    public static void main(String[] args) {
        DateUtils du = DateUtils.getInstance();
        //获得当前时间
        System.out.println(du.currentDate());
        System.out.println(du.format(du.currentDate()));
        System.out.println(du.format(du.getDate(1998, 11,
                25, 13, 20, 35), "yyyy/MM/dd HH:mm:ss"));
        System.out.println("------------------------------------------------");
        StudentService ss = new StudentService();
        System.out.println(ss.formatJSON(new Student("张山", "男", 21)));
        System.out.println(ss.formatJSON(new Student[]{
                new Student("张山", "男", 21),
                new Student("李四", "男", 22),
                new Student("王舞", "女", 20)
        }));
    }

}
