package _20180522_2;

import java.util.Scanner;

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

