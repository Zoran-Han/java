package com.demo.collections;

import java.util.Stack;

/**
 * @ClassName TestStack
 * 测试应用栈
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月15日  16:11:29
 * @Version 1.0.0
 */

public class TestStack {

    public static void main(String[] args) {
        //创建栈表
        Stack stack = new Stack();
        //压栈,向栈中添加元素
        stack.push(10);
        stack.push(20);
        stack.push(40);
        stack.push(80);
        stack.push(160);
        //返回栈顶元素
        System.out.println(stack.peek());//160
        //搜索元素，返回在战中的位置
        System.out.println(stack.search(10));//5  栈底
        System.out.println(stack.search(160));//1  栈顶，位置从一开始
        //提取占中所有元素
        while (!stack.empty()){
            System.out.print(stack.pop()+"  ");//返回并删除栈顶元素
        }


    }
}
