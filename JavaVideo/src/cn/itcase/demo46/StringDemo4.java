package cn.itcase.demo46;

import java.sql.SQLOutput;

public class StringDemo4 {
    public static void main(String[] args) {
        function();
        function_1();
        function_2();
        function_3();
        function_4();
        function_5();
        function_6();
        function_7();
        function_8();
        function_9();
    }
    public static void function(){
        String str="adjaidhasjdpajd";
        int length=str.length();
        System.out.println(length);
    }
    public static void function_1(){
        String str="howareyou";
        System.out.println(str.substring(1,5));
        String str2="HelloWorld";
        System.out.println(str2.substring(1));
    }
    public static void function_2(){
        String str="howareyou";
        boolean b=str.startsWith("how");
        System.out.println(b);
    }
    public static void function_3(){
        String str="howareyou";
        boolean b=str.endsWith("you");
        System.out.println(b);
    }
    public static void function_4(){
        String str="abc";
        boolean b=str.contains("ba");
        System.out.println(b);
    }
    public static void function_5(){
        String str="NewYork";
        int index=str.indexOf('Y');
        System.out.println(index);
    }
    public static void function_6(){
        String str="abc";
        byte[] bytes=str.getBytes();
        for (int i = 0; i <bytes.length ; i++) {
            System.out.println(bytes[i]);

        }
    }
    public static void function_7(){
        String str="abc";
        char[] ch=str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
    }
    public static void function_8(){
        String str1="AbC";
        String str2="abc";
        boolean b1=str1.equals(str2);
        boolean b2=str1.equalsIgnoreCase(str2);
        System.out.println(b1);
        System.out.println(b2);
    }
    public static void function_9(){
        char ch="abcde".charAt(3);
        System.out.println(ch);
    }
}
