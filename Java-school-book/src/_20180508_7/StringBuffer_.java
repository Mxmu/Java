package _20180508_7;

import java.util.Scanner;

public class StringBuffer_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一组字符串:");
        String s=sc.next();
        System.out.println("输入的字符串为:");
        System.out.println(s);
        StringBuffer buffer = new StringBuffer();
        buffer.append(s);
        buffer.insert(buffer.length()/2,"hello");
        System.out.println("在输入的字符串中间插入hello后为:");
        System.out.println(buffer);
    }
}
