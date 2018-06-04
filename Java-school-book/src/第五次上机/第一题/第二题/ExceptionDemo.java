package 第五次上机.第一题.第二题;

import java.util.Scanner;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：
 *  自定义一个异常类MyException,
 *  重写他toString() 方法，给出个性
 *  化的异常显示信息。当从键盘输入一
 *  个字符串，当该字符串中包含数字字符
 *  时，抛出一个MyException异常，否则不
 *  抛出异常。用两种方法完成该题，第一种
 *  方法要求异常的抛出和处理在main()函数中
 *  实现；第二种方法要求抛出异常和处理异常
 *  在不同的函数中处理，也就是在一个函数中
 *  抛出异常，但是不处理，在调用该函数的上层
 *  函数体中捕获并处理该异常。
 */
class MyException extends Exception{
    private String myString;
    public MyException(String myString){
        this.myString=myString;
    }
    public String getMyString(){
        return myString;
    }
    @Override
    public String toString(){
        return myString;
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        try{
            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(i)>=48&&str.charAt(i)<=58){
                    throw new MyException("抛出异常,该字符串中包含数字字符!");
                }
            }
            System.out.println("不抛出异常");
        }catch (MyException e){
            System.out.println(e);
        }
    }
}

