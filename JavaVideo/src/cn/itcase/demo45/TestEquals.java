package cn.itcase.demo45;

import sun.awt.geom.AreaOp;
/*
    方法equals比较两个对象内存地址
    多态中，不能调用子类的特有内容
    重写equals方法
 */
public class TestEquals {
    public static void main(String[] args) {
        Person p1=new Person("李四",25);
        Person p2=new Person("张三",20);
        boolean b=p1.equals(p2);
        System.out.println(b);
        p1=p2;
        boolean c=p1.equals(p2);
        System.out.println(c);

    }
}
