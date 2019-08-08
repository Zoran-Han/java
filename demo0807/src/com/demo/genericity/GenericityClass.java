package com.demo.genericity;

/**
 * 泛型类
 * @param <E>
 */
class MyArrayList<E>{

    //使用泛型变量创建数组
    private E[] array;
    private  int size;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setArray(E[] array) {
        this.array = array;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public MyArrayList(){
        capacity = 16;
        size = 0;
        array = (E[])new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        size =0;
        array = (E[])new Object[capacity];
    }

    public Object[] getArray() {

        return array;
    }

    public int getSize() {
        return size;
    }

    //添加元素
    public void add(E e){

        array[size++] = e;
    }
    public E get(int index){
        return array[index];
    }

}

/*class MyHsshTable<T,E,ABFaa33cc>{

    private ABFaa33cc var;
}*/

/**
 * @ClassName GenericityClass
 * 使用泛型类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月07日  10:54:40
 * @Version 1.0.0
 */

public class GenericityClass {

    public static  void main(String[] args){
        //变量默认是Object型
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add("张一山");
        System.out.println(list.get(0)+" "+list.get(1));

        MyArrayList<String> list2= new MyArrayList<>();
        //list2.add(12);//编译不通过 只能添加String型
        list2.add("刚刚好");
        list2.add("大哥");
        for (int i=0; i<list2.getSize();i++){
            System.out.println(list2.get(i));
        }
        //MyArrayList<int> list3 = new MyArrayList<int>();//编译失败，使用泛型时不能使用基本数据类型作为泛型参数

    }


}
