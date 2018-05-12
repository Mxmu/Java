package cn.itcase.demo36;
import java.util.*;
/*
有名字对象，引用型变量，可以反复使用
匿名对象，没有引用变量，只能使用一次
匿名对象可以当作参数传递
 */
public class Test {
    public static void main(String[] args)
    {
        Person p=new Person();
        p.eat();

        new Person().eat();
        method(p);
        method(new Person());
        Person p1=method();
        p1.eat();
        //int number=new Scanner(System.in).nextInt();//只能一次
    }
    public static void method(Person p)
    {
        p.eat();
    }
    public static Person method()
    {
        Person p=new Person();
        return p;
    }
}
