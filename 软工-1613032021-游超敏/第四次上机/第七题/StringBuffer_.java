package 第四次上机.第七题;

import java.util.Scanner;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：利用jdk提供的类库中的Scanner类从键盘输入任意一组字符串，
 * 要求在字符串的中间位置插入一个字串：hello,使用jdk提供的类库
 * 中的StringBuffer类(具体方法请查阅JDK API文档)
 */
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
