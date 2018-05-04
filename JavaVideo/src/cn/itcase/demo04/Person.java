package cn.itcase.demo04;

public class Person {
    String name;
    private int age;
    //定义方法，对age变量进行赋值，必须set开头
    public void setAge(int a)
    {
        //对变量a进行范围限制
        if(a<0||a>200){
        age=20;
    }else{
    age=a;}
    }
    //定义方法，对age获取值，方法名get
    public int getAge()
    {
        return age;
    }
    public void speak()
    {
        System.out.println(name+"..."+age);
    }
}
