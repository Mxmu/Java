package cn.itcase.demo32;
/* 在类的定义上，加上修饰符final
    类：最终类，不能有子类，不可以被继承
    太监类
    但是使用方式没有变化
 */
public final class Fu {
    public void show()
    {
        System.out.println("最终类的方法");
    }
}
