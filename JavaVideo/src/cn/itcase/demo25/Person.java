package cn.itcase.demo25;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age)
    {
        //System.out.println("我是一个空参数的构造方法");
        this.name=name;
        this.age=age;
    }
    public Person()
    {

    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
}
