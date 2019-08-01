package com.demo.oop;

/**
 * @ClassName Mouse老鼠类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  15:30:10
 * @Version 1.0.0
 */

public class Mouse  extends  Animal{

    protected  String gender  ;

    public  Mouse(String name,String gender){
        this.name = name;
        this.gender = gender;
    }

    public void show(){
        System.out.println("鼠类 "+name+"["+gender+"]");
    }

    @Override
    public void say(Animal animal) {
        System.out.println( name +"老鼠天天被"+animal.name+"猫欺负");
    }
}
