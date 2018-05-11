package cn.itcase.demo25;

public class Test {
    public static void main(String[] args)
    {
        Person p1=new Person();
        p1.setName("张三");
        p1.setAge(12);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        Person p2=new Person("李四",14);
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
    }
}
