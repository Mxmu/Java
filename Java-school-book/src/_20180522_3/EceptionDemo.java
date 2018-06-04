package _20180522_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        int a,b;
        try{
            System.out.println("输入a的值:");
            a=sc.nextInt();
        }catch (InputMismatchException e1){
            System.out.println("输入的串中包含非数字字符!");
             a=sc.nextInt();
        }
        try{
            System.out.println("输入b的值:");
            b=sc1.nextInt();
        }catch(InputMismatchException e2){
            System.out.println("输入的串中包含非数字字符!");
            b=0;
        }
        System.out.println("a-b="+(a-b));
    }
}
