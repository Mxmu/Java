package cn.itcase.demo51;

import java.sql.SQLOutput;

/*
Integer类的3个静态方法
做进制的转换
十进制转换成二进制 toBinarString(int)
十进制转换成八进制 toOctalString(int)
十进制转换成十六进制 toHexString(int)
三个方法,返回值都是以String形式出现
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        function_1();
    }
    public static void function(){
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
    public static void function_1(){
        System.out.println(Integer.toBinaryString(99));
        System.out.println(Integer.toOctalString(99));
        System.out.println(Integer.toHexString(99));
    }
}
