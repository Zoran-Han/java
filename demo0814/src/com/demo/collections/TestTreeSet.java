package com.demo.collections;



import com.demo.collections.pojo.Employee;
import com.demo.collections.pojo.Student;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName TestTreeSet
 * 测试树形集
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月14日  16:44:07
 * @Version 1.0.0
 */

public class TestTreeSet {


    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        // TreeSet集合中的元素必须可以进行相互比较，否则运行时报错
        set.add(new Student("张一山","CQ1005"));
        set.add(new Student("张山","CQ1008"));
        set.add(new Student("张一","CQ1003"));
        for (Student s :set){
            System.out.println(s.getName()+" "+s.getNumber());
        }

        System.out.println("-------------------------------");
        //创建树形集指定比较器
        Set<Employee> set2 = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getSalary()-o2.getSalary();//升序
                //return o2.getSalary()-o1.getSalary();//逆序
            }
        });
        // TreeSet集合中的元素必须可以进行相互比较，否则运行时报错
        set2.add(new Employee("张天",6500));
        set2.add(new Employee("张地",8500));
        set2.add(new Employee("张月",5500));
        for (Employee e:set2){
            System.out.println(e.getName()+" "+e.getSalary());
        }

        System.out.println("-------------------------------");

        //创建树形集,使用lambda表达式指定比较器
        Set<Employee> set3 = new TreeSet<>((o1, o2) -> { return o1.getSalary()-o2.getSalary();});
        // TreeSet集合中的元素必须可以进行相互比较，否则运行时报错
        set3.add(new Employee("张天",6500));
        set3.add(new Employee("张地",8500));
        set3.add(new Employee("张月",5500));
        for (Employee e:set3){
            System.out.println(e.getName()+" "+e.getSalary());

        }


    }
}
