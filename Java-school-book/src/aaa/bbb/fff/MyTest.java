package aaa.bbb.fff;

import aaa.bbb.eee.Queue;

import java.util.Scanner;

public class MyTest {
    public static   void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue queue=new Queue(10);
        int i,m,k;
        System.out.println("1：插入队列 2：删除队列元素 3:输出队列元素 0：退出");
        while((k=sc.nextInt())!=0) {
            switch (k) {
                case 1:
                    System.out.println("插入队列 0：退出");
                    if ((i = sc.nextInt()) != 0) {
                        queue.insert(i);
                    }
                    else{return ;}
                    break;
                case 2:
                    System.out.println("删除队列元素 任意数字出队一个元素 0：退出");
                    while ((m = sc.nextInt()) != 0) {
                        queue.remove();
                    }
                    break;
                case 3:
                    System.out.println("队列元素：");
                    queue.print();
                    break;
                default:
                    break;
            }
        }

    }
}
