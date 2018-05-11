package cn.itcase.demo24;
/*
    方法的名字，必须和类的名字完全一致
    构造方法不允许写返回值类型，void也不能写
    构造方法在new的时候自动执行
    只运行一次
    new对象时就是在调用对象的构造方法
 */
public class Test {
    public static void main(String[] args)
    {
        Person p=new Person("张三",20);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
