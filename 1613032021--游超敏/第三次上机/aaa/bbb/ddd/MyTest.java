package 第三次上机.aaa.bbb.ddd;

import aaa.bbb.ccc.Queue;

import java.util.Scanner;

public class MyTest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       // System.out.println("定义队列存储单元个数:");
      //  int a=sc.nextInt();
        Queue q=new Queue(3);
       // System.out.println("所定义队列能存储的数有"+(a-1)+"个");


        while(true){
            System.out.println("选择要实现的功能:");
            System.out.println("1-入队    2-出队    其他数字-退出");
            int b=sc.nextInt();
            switch (b)
            {
                case 1:
                    System.out.println("选择的是入队操作:");
                    System.out.println("请输入要入队的元素:");
                    int c=sc.nextInt();
                    //while(c!=0){
                        q.insert(c);//}
                    break;
                case 2:
                    System.out.println("选择的是出队操作:");
                    System.out.println("出队的元素是:");
                    int d=q.remove();
                    System.out.println(d);
                    break;
                default:
                    return;
            }
        }
    }
}
