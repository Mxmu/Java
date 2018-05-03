package cn.itcase.demo03;

public class PersonTest {
    public static void main(String[] args)
    {
        int a=1;
        function(a);
        System.out.println(a);
        Person p=new Person();
        p.name="张三";
        System.out.println(p.name);
        function(p);
        System.out.println(p.name);
    }
    public static void function(int a)
    {
        a+=5;
    }
    public static void function(Person p)
    {
        p.name="李四";
    }
}
