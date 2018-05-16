package cn.itcase.demo51;

public class IntegerDemo {
    public static void main(String[] args) {
        function();
        function_1();
        function_2();
        function_3();
    }
    public static void function(){
        int i=Integer.parseInt("12");
        System.out.println(i/2);
    }
    public static void function_1(){
        int i=Integer.parseInt("110",2);
        //"110",2含义:前面的数字是二进制的,但是方法parseInt运行结果都是十进制
        System.out.println(i);
    }
    public static void function_2(){
        //int=>String 任何类型+"" 变成String类型 或者可以Integer类中的静态方法toString()
        //toString(int ,int 进制) 将int整数转成指定进制数
        int i=3;
        String s=i+"";
        System.out.println(s+1);
        String s1=Integer.toString(5);
        System.out.println(s1+1);
        String s2=Integer.toString(5,2);
        System.out.println(s2);
    }
    public static void function_3(){
        Integer in=new Integer("100");
        int i=in.intValue();
        System.out.println(i--);
    }
}
