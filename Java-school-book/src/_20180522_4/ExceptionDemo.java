package _20180522_4;

import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();
        int len=str.length();
        try{
            if(len<10)
                throw new StringIndexOutOfBoundsException("输入字符串不足10个");
            else if(str.indexOf("2014",0)!=2)
                throw new NumberFormatException("第3个到第7个字符的子串的值不等于2014");
            else if(str.charAt(9)=='R')
                System.out.println("it's ok");
        }catch (StringIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage()+"\nthe value is wrong");
        }catch(NumberFormatException e2){
            System.out.println(e2.getMessage()+"\nthe value is wrong");
        }
    }
}
