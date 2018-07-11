package 第三次上机.第四题;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：
 第四题：定义一个父类Father1, 其中包括一个成员函数void f(){ },
        定义类Father1的子类Son1，重写父类的f()函数，输出“this is the son1”,
        定义类Father1的子类Son2，重写父类的f()函数，输出“this is the son2",
        定义一个类Jc1，里面包含成员函数 void fun( Father1 f1){ f1.f();  },
        编写一个测试类Test2，包含主函数，分别定义子类Son1和Son2的两个不同的对象，
        传给Jc1的fun函数，测试多态性。
 */
public class Father1 {
    void f()
    {

    }

}
