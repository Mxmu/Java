package cn.itcase.demo14;

public class Test {
    public static void main(String[] args)
    {
        JavaEE ee=new JavaEE();
        Network net=new Network();
        ee.setName("张三");
        ee.setId("009");
        net.setName("李四");
        net.setId("007");
        System.out.println(ee.getName()+"..."+ee.getId());
        System.out.println(net.getName()+"..."+net.getId());
        ee.work();
        net.work();
    }
}
