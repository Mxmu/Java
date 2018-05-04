package cn.itcase.demo05;

public class PersonTest {
    public static void main(String[] args)
    {
        Person p=new Person();
        p.setAge(18);
        p.setName("张三");
        p.speak();
        System.out.println(p);
       // System.out.println(p.getName());
       // System.out.println(p.getAge());
    }
}
