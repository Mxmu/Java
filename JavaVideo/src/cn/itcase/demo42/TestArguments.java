package cn.itcase.demo42;

public class TestArguments {
    public static void main(String[] args)
    {
        Person p=new Person();
        operatorPerson(p);
        operatorPerson(new Person());
    }
    public static void operatorPerson(Person p)
    {
        p.eat();
        p.run();
    }
}
