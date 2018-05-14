package cn.itcase.demo46;

public class StringBufferDemo {
    public static void main(String[] args) {
        function();
        function_1();
        function_2();
        function_3();
        function_4();
        function_5();
    }
    public static void function(){
        StringBuffer buffer=new StringBuffer();
        buffer.append(6);
        System.out.println(buffer);
    }
    public static void function_1(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("abcdef");
        buffer.delete(1,5); //開始索引包含,结尾索引不包含
        System.out.println(buffer);
    }
    public static void function_2(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("abcdef");
        buffer.insert(3,9);
        System.out.println(buffer);
    }
    public static void function_3(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("abcdef");
        buffer.replace(1,4,"Q");
        System.out.println(buffer);
    }
    public static void function_4(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("abcdef");
        buffer.reverse();
        System.out.println(buffer);
    }
    public static void function_5(){
        StringBuffer buffer=new StringBuffer();
        buffer.append("abcdef");
        buffer.append(122333);
        String s=buffer.toString();
        System.out.println(s);

    }
}
