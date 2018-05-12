package cn.itcase.demo27;
/*
父类先进方法区
子类自动拥有父类的成员(父类先进才能实现子类拥有父类)
super表示父类存储位置
子类对象空间中，划分两个区域，一个区域留给自己的父类
一个区域留给自己
父类成员变量，跟随子类的对象进入堆内存
 */
public class Test {
    public static void main(String[] args)
    {
        new Student();
    }
}
