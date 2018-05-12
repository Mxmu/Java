package cn.itcase.demo34;
/*对象的共享数据(静态修饰)
    被静态修饰的成员，可以被类名直接调用
    内存中，静态优先于非静态存在的
 */
public class Test {
    public static void main(String[] args)
    {
        Person p1=new Person();
        Person p2=new Person();
        p1.name="哈哈";
        p2.name="嘻嘻";
        System.out.println(p1.name);
        System.out.println(p2.name);
        p1.className="基础班";
        System.out.println(p2.className);
        System.out.println(Person.className);
    }
}
