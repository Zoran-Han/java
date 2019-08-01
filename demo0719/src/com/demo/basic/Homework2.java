package com.demo.basic;
import java.util.Arrays;

/**
 * @ClassName Homework2
 * @Description TODO
 * @Author Hzrobo
 * @Date 2019/7/21 18:50
 * @Version 1.0.0
 */

public class Homework2 {

    /**
     * 冒泡排序
     * @param arr
     */
    public void BubbleSort(int[] arr){
        for (int i = 0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
            }
            }
        }
        System.out.print("冒泡排序:");
        showarr(arr);
        }

    /**
     * 反转排序
     * @param arr
     */
    public void ReverseSort(int[] arr){
        int len  = arr.length;
        for(int i = 0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-1-i];
            arr[len-1-i] = temp;
        }
        System.out.print("反转排序:");
        showarr(arr);
    }

    /**
     * 直接选择排序
     * @param arr
     */
    public void SelectSort(int[] arr){
        int index;
        for (int i=0;i<arr.length;i++){
            index = 0;
            for (int j=1;j<arr.length-1;j++){
                if (arr[j]>arr[index]){
                    index = j;
                }
            }
            //交换arr.length-1位置和index位置上的两个数
            int temp = arr[arr.length-1];
            arr[arr.length-1] = arr[index];
            arr[index] = temp;

        }
        System.out.print("直接选择排序：");
        showarr(arr);
    }


    /**
     * 快速排序其中一个步骤
     * 大于基数的放在基数右边，小于基数的放在基数左边
     * @param arr
     * @param left
     * @param right
     * @return
     */
    public int SortStep(int[] arr,int left,int right) {
        //以第一个元素为基数
        int base = arr[left];
        //循环交换元素
        while (left < right) {
            //右指针向左边移动,每次循环指针减一，循环结束时，right指针指向的数就是小于基数的数
            while (left < right && arr[right] >= base) {
                right--;
            }
            //将从右边找到的小于基数的数赋值给左边指针指向的元素
            arr[left] = arr[right];
            //左边指针向右移动，每次循环指针加一，循环结束时，left指针指向的数就是大于基数的数
            while (left < right && arr[left] <= base) {
                left++;
            }
            //将从左边找到的大于基数的数赋值给右边指针指向的元素，
            arr[right] = arr[left];
        }
        //外循环结束，left与right重合，这时左右两个指针同时指向的位置就是基数应该存放的位置
        arr[right] = base;
        //返回基数下标
        return left;
    }

    /**
     * 快速排序（升序）
     * @param arr
     */
    public void QuickSort(int[] arr, int left ,int right){
        //判断是否继续处理
        if (left<right){
           int baseIndex = SortStep(arr,left ,right);
           //方法的递归，即方法的自身调用
            //基数左边的数，再次进行划分
            QuickSort(arr,left,baseIndex-1);
            //基数右边的数,再次进行划分
            QuickSort(arr,baseIndex+1,right);
        }
    }

    /**
     * 排序（升序）
     * @param arr
     */
    public void sort(int[] arr){
        QuickSort(arr,0,arr.length-1);
    }

    /**
     * 求数组中的最大值
     * @param arr
     */
    public  int Max(int[] arr){
        //没考虑数组长度为0的时候
        int Max = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] > arr[0]) {
                Max = arr[i];
            }
        }
        //System.out.println("数组中最大值为："+Max);
        return Max;
    }
 /*   public int findMaxValue(int[] arr) {
        int Max = arr[0];
        for (int i : arr) {
            if (i > Max) {
                Max = arr[i];
            }
            return Max;
        }
*/

    /**
     * 输出数组中的最小值
     * @param arr
     */
    public  int  Min(int[] arr){
        int Min = arr[0];
        for (int i=0;i<arr.length;i++) {
            if (arr[i] < arr[0]) {
                Min = arr[i];
            }
        }
        //System.out.println("数组中最大值为："+Min);
        return Min;
    }

    /**
     * 查找元素，返回下标
     * @param arr
     * @param el
     * @return
     */
    public int indexOf(int[] arr,int el){
        //定义变量，记录找到元素的小标
        int index = -1;
        //遍历数组
        for(int i=0;i<arr.length;i++){
            if(el == arr[i]){
                index  = i;
            }
        }
        return index;
    }
    /**
     * 显示数组
     * @param arr
     */
    public  void showarr(int[] arr){
        for (int a: arr) {

            System.out.print(a+" ");
        }
        System.out.println();
    }

    public  static void main(String[] args){
        //创建一个乱序数组
        int[] arr = {25,18,59,6,9,11,7,21};
        //创建排序的类对象
        Homework2 hm = new Homework2();
        System.out.print("原数组序列：");
        hm.showarr(arr);
        //调用反转排序
        hm.ReverseSort(arr);
        //调用冒泡排序将数组排序
        hm.BubbleSort(arr);
        //调用直接选择排序
        hm.SelectSort(arr);
        //查找指定的元素，并返回找到的第一个元素的索引值
        System.out.println("-----先通过冒泡排序，再对数组进行索引查询-----");
        hm.BubbleSort(arr);
        int index = Arrays.binarySearch(arr,21);
        System.out.println("21的索引位置："+index);
        //输出数组中的最大最小值
        System.out.println("数组中最大的数： "+hm.Max(arr));
        System.out.println("数组中最小的数："+ hm.Min(arr));
        System.out.print("快速排序：");
        hm.sort(arr);
        for(int a : arr){

            System.out.print( a +" ");
        }


    }
}
