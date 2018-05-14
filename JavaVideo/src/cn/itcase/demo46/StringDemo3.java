package cn.itcase.demo46;

public class StringDemo3 {
    public static void main(String[] args) {
        function();
        function_1();
    }
    public static void function(){
        byte[] bytes={97,98,99,100};
        String s=new String(bytes);
        System.out.println(s);
        String s1=new String(bytes,1,2);
        System.out.println(s1);
    }
    public static void function_1(){
        char[] ch={'a','b','c','d','e','f'};
        String s=new String(ch);
        System.out.println(s);
        String s1=new String(ch,1,4);
        System.out.println(s1);
    }
}
