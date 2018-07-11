package 第五次上机.第一题.第四题;

import java.util.Scanner;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：
 *  从键盘输入一个字符串放在一个 String类型的变量中，
 *  判断这个字符串的第10个字符是否等于‘R’，并且判断
 *  这个字符串的第3个到第7个字符的子串的值是否等于整数
 *  2014，如果这两个条件成立，显示“it's ok”，否则显示
 *  “the value is wrong”. 如果输入的字符串不足10个字
 *  符，则发生系统异常StringIndexOutOfBoundsException，
 *  如果第3到7个位置的子串不等于整数2014，则发生系统异常
 *  NumberFormatException。做相应的异常处理。
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str=sc.next();
        int len=str.length();
        try{
            if(len<10)
                throw new StringIndexOutOfBoundsException("输入的字符串个数小于10个");
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
