package com.demo.oop;

import com.sun.org.apache.regexp.internal.REDebugCompiler;

enum Color{
        RED,
        GREEN,
        BLUE
}

/**
 * @ClassName TestEnum
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月25日  16:02:44
 * @Version 1.0.0
 */

public class TestEnum {


    //编译后默认添加static修饰符，所以类方法可以直接访问枚举
    private   enum Season{
         SPRING("春天天o"),
         SUMMER("夏天天"),
         AUTUMN("秋天天"),
         WINTER("冬天天");

         private String value;

        private  Season(String value){
            this.value = value;

        }
        public String getValue(){
            return value;
        }
    }

    /*private TestEnum( ){
        System.out.println(Season.SUMMER);
    }*/

    /**
     * 获取季节
     * @param season
     * @return
     */
    public String getSeason(Season season){
        String result = null;
        switch (season){
            case SPRING:
                result = season.value;
                break;
            case AUTUMN:
                result =season.value;
                break;
            case SUMMER:
                result =season.value;
                break;
            case WINTER:
                result =season.value;
                break;
            default:
                return null;

        }

        return result;
    }

    /**
     * 应用枚举进行逻辑判断
     * @param color
     * @return
     */
    public String getColor(Color color){
        /*if(color==Color.RED){
            return "红色";
        }else if (color==Color.GREEN){
            return "绿色";
        }else if (color == Color.BLUE) {
            return "蓝色";
        }
        return  null;*/

//        switch (color){
//            case RED:
//                return "红色";
//            case GREEN:
//                return "绿色";
//            case BLUE:
//                return "蓝色";
//            default:
//                    return null;
//        }
        String result = null;
        switch (color){
            case RED:
                result = "红色";
                break;
            case GREEN:
                result ="绿色";
                break;
            case BLUE:
                result ="蓝色";
                break;

        }
        return result;

    }

    public  static void main(String[] args){
        System.out.println(Color.RED);
        System.out.println(Season.SPRING);
        System.out.println(Season.SPRING.value);
        System.out.println(Season.SUMMER);
        System.out.println("--------------------");
        //应用枚举进行逻辑判断
        TestEnum te = new TestEnum();
        System.out.println(te.getColor(Color.GREEN));
        System.out.println(te.getSeason(Season.SPRING));
        System.out.println(te.getSeason(Season.SUMMER));



    }

}
