package com.demo.oop;

/**
 * @ClassName Cat
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  15:29:52
 * @Version 1.0.0
 */

public class Cat extends Animal {

    public  Cat(String name){
        this.name = name;
    }

    public void printMsg(){
        System.out.println("猫类 "+name);
    }
    @Override
    public void say(Animal animal) {
        Mouse mouse = (Mouse) animal;
        System.out.println( name +"猫天天欺负老鼠" +animal.name+"("+ mouse.gender+")" );
    }
}
