package 第三次上机.第二题;

import java.util.Scanner;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：用二维for-each语句输出二维数组中每个元素的值。
 */
public class ForEachTest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[] a:arr)
            for(int i=0;i<3;i++)
            System.out.print(a[i]+" ");
    }
}

