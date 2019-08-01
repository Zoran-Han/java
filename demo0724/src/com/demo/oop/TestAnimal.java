package com.demo.oop;

/**
 * @ClassName TestAnimal
 * 测试转型的应用
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  15:40:51
 * @Version 1.0.0
 */

public class TestAnimal {

    public  Object method(){
      // return 1;
        // return "SS";
        return  new Animal();
    }

    public  Animal getAnimal(){
       //return  new Cat("jai ");
        return new Mouse("df","母");
    }
    public static void main(String[] args) {
    /*    Cat cat = new Cat("Tom");
        Mouse mouse= new Mouse("杰瑞");
        cat.say(mouse);
        mouse.say(cat);
        */
    Animal cat = new Cat("Tom");
    Animal mouse = new Mouse("Jerry","母");
    cat.say(mouse);
    mouse.say(cat);


    }
}
