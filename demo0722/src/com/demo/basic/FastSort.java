package com.demo.basic;

/**
 * @ClassName FastSort
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月22日  20:13:30
 * @Version 1.0.0
 */

public class FastSort {
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

    public static void main(String[] args) {
        //创建一个乱序数组
        int[] arr = {25,18,59,6,9,11,7,21};
        System.out.print("快速排序：");
        FastSort fs = new FastSort();
        fs.sort(arr);
        for(int a : arr){

            System.out.print( a +" ");
        }
    }
}
