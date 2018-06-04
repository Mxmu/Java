package 第五次上机.第一题.第二题二解;

import java.util.Scanner;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 *
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
    public static void check() throws MyException {
        System.out.println("请输入字符串:");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(i)>=48&&str.charAt(i)<=58){
                    throw new MyException("抛出异常,该字符串中包含数字字符!");
                }
            }
            System.out.println("不抛出异常");
        }

    public static void main(String[] args) {
        try{
            check();
        }catch (MyException e){
            System.out.println(e);
        }
    }
}

