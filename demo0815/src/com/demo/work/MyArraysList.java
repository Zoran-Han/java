package com.demo.work;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @ClassName MyArraysList
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月16日  10:07:28
 * @Version 1.0.0
 */

public class MyArraysList<E> implements Iterable<E>{


    private Object[] elements = new Object[10];    //存放元素的数组
    private int size;   //元素的个数

    /**
     * 尾部添加元素
     * @param e
     */
    public void add(E e){
        //判断是否超出容量范围
        if (size==elements.length){
            elements = Arrays.copyOf(elements,elements.length<<1);//长度乘2
        }
        elements[size++]=e;
    }

    //获取元素
    public E get(int index){
        return (E) elements[index];
    }

    public int size(){
        return size;
    }
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private  int cursor;

            @Override
            public boolean hasNext() {
                return  cursor<size();
            }

            @Override
            public E next() {
                return get(cursor++);
            }
        };
    }
}
