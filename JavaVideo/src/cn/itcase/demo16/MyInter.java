package cn.itcase.demo16;
/* 接口没有变量，都是常量
注意:public static final 修饰符，在接口的定义找那个，可以省略不写
    但是不写不等于没有
    三个修饰符，还可以选择性书写
   接口中的成员方法特点：
    public abstract 返回值类型 方法名（参数列表）
    修饰符public abstract可以不写，选择性书写
    但是写不写都有
   实现类，实现接口，重写接口的全部抽象方法，创建实现类对象
   多实现没有安全隐患，原因在于接口中的方法全是抽象，没有主体
   依赖实现类，重写才可以执行，接口多实现中，没有安全问题的
   解决了单继承局限性
 */
public interface MyInter {
    public static final int x=3;
    public abstract void show();
    public abstract int getSum(int a,int b);
}
