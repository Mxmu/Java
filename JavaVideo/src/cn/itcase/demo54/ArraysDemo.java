package cn.itcase.demo54;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
   // function();
        // function_1();
       // function_2();
        int [] arr={56,23,54,78,86,25,65,87,65,45};
        int [] newArray= test(arr);
        System.out.println(Arrays.toString(newArray));
    }
    /*
    static void sort(数组)
    对数组升序排列
     */
    public static void function(){
        int [] arr={5,1,3,4,612,62,5};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }
    }
    /*
    static int binarySearch(数组,被查找元素)
    数组的二分搜索法
    返回元素在数组中出现的索引
    元素不存在,返回的是(-插入点-1)
     */
    public static void function_1(){
        int [] arr={1,2,3,4,6,7,8,9};
        int index=Arrays.binarySearch(arr,5);
        System.out.println(index);
    }
    /*
    static String toString(数组)
    将数组变成字符串
     */
    public static void function_2(){
        int [] arr={3,4,21,45,13,4325};
        String s=Arrays.toString(arr);
        System.out.println(s);
    }
    /*
    定义方法,接受输入,存储的是10个人考试成绩
    将最后三个人的成绩,存储到新的数组中,返回新的数组
     */
    public static int[] test(int[] arr){
        Arrays.sort(arr);
        int[] result=new int[3];
        //System.arraycopy(arr,0,result,0,3);
        for(int i=0;i<3;i++){
            result[i]=arr[i];
        }
        return result;
    }
}
