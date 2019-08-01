package com.demo.basic;

/**
 * 数组操作工具类
 * @author
 * @createTime 2019年07月19日 16:09:30
 * @version  1.0.0
 */
public class ArrayUtil {
    //成员变量，长度
    private  int length;

    /**
     * 成员方法，设置长度
     * @param length
     */
    public  void setLengthength(int length){
        this.length = length;
    }

    /**
     * 成员方法，获取长度
     * @return
     */
    public  int  getLength(){
        return length;
    }

    /**
     * 排序
     * @param array
     */
    public  void sort(int[] array){
        //冒泡排序遍历数组
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++ ){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
    public  static void main(String[] args){
        //创建对象
        ArrayUtil au = new ArrayUtil();
        //访问属性
        au.length = 8;
        System.out.println("length="+au.length);
        //通过方法访问数组
        au.setLengthength(19);
        System.out.println("length = "+ au.getLength());

        //创建数组
        int intArr[] = {25,12,8,50,30,15,5};
        //排序
        au.sort(intArr);
        for(int el: intArr){
            System.out.print(el+"  ");
        }
        System.out.println();
    }
}
