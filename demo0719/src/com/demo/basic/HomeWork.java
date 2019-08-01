package com.demo.basic;

import java.util.*;

/**
 * @ClassName 统计字母的数量
 * @Description TODO
 * @Author Hzrobo
 * @Date 2019/7/20 14:32
 * @Version 1.0.0
 */

public class HomeWork {
    public static void main(String[] args) {
        //定义一个字符串，对字符串进行统计，按顺序输出字符串中的大写字母和小写字母
        String str = "YbFLpRcdAcOBApD";
        //将字符串转换为字符类型的数组
        char[] charArr = str.toCharArray();
        //定义字符串，记录每次统计出 的字符
        String result  = "";  //表示是空的字符串 ，占内存空间，
        // String result1  = null;  //表示什么都没有，不占内存空间
        //循环统计字母
        //定义整型变量，记录统计出的字母总数
        int count = 0;
        for (char c = 'A'; c >='A'&& c<='z';c++){
            //排除非字母字符
            if(c >'Z' && c<'a'){
                continue;
            }
            //定义整型变量，统计处当前字母的数量
            int tempCount = 0;
            //遍历字符数组
            for (char el : charArr){
                //判断字母是否相同
                if(c==el){
                    tempCount++;
                    count++;
                }

            }
            //记录统计出的数字与字母
            if(tempCount > 0 ) {
                //    result += tempCount + c;//会出错，原因是赋值运算符+=的运算等级最低，会出现类型转换
                result = result + tempCount + c;
            }
            //判断是否统计处所的字符
            if (count == str.length()){
                break;
            }

        }
        System.out.println(result);
    }

}
//也可以使用先排序，在通过判断是否相同来确定数目，最后输出

       /* HashMap<Character, Integer> map = new HashMap<>();
            for(int i=0; i<str.length();i++) {
                char ch = str.charAt(i);
                if(map.containsKey(ch)) {
                    map.put(ch, map.get(ch)+1);
               }else {
                     map.put(ch, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entrySet.iterator();
        while(iterator.hasNext()) {
            Map.Entry<Character, Integer> next = iterator.next();
            System.out.print(next.getKey()+" :"+next.getValue()+"  " + "");
        }*/



