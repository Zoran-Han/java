package com.demo.work;

/**
 * @ClassName ServicesStudent
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月04日  16:47:03
 * @Version 1.0.0
 */

public class ServicesStudent {

    /**
     * 定义有一个学生类型的数组来存放学生信息
     */
    private Student[] students;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    //单个对象输出格式
    public String singleOutput(Student[] students){
        StringBuffer stringBuffer = new StringBuffer();

        if (students.length == 1){
            stringBuffer.append("{"+"姓名:"+students[0].getName()+" 性别:"+students[0].getGender()+
                    " 年龄:"+students[0].getAge()+"}");
        } else{
            System.out.println("数组为空或者数组过长！");
        }

        return stringBuffer.toString();
    }

    //多个对象输出格式
    public String multipleOutput(Student[] students){
        StringBuffer stringBuffer = new StringBuffer();

        if (students.length > 1){
            stringBuffer.append("[");
            for(int i = 0; i<students.length;i++){
                stringBuffer.append("{"+"姓名:"+students[0].getName()+" 性别:"+students[0].getGender()+
                        " 年龄:"+students[0].getAge()+"}");
                if(i<students.length-1){
                    stringBuffer.append(" , ");
                }
            }
            stringBuffer.append("]");

        } else{
            singleOutput(students);
            System.out.println("数组长度不足或为空！");

        }


        return stringBuffer.toString();
    }

    public static void main(String[] args){
        ServicesStudent servicesStudent1 = new ServicesStudent();
        ServicesStudent servicesStudent2 = new ServicesStudent();
        ServicesStudent servicesStudent3 = new ServicesStudent();
        Student[] student1 = new Student[]{new Student("丹尼","男",25)};
        Student[] student2 = new Student[]{
                new Student("丹尼","男",25),
                new Student("小明","男",22),
                new Student("莉莉","女",19),
                new Student("杨紫","女",25)
        };
        System.out.println(servicesStudent1.singleOutput(student1));
        System.out.println(servicesStudent2.multipleOutput(student2));
        System.out.println(servicesStudent3.multipleOutput(student1));
        System.out.println(servicesStudent1.singleOutput(student2));


    }



}
