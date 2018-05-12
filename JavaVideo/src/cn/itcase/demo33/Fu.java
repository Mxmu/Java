package cn.itcase.demo33;
/*定义父类
  一部分方法，写成final修饰
  子类可以继承的，但是不能重写
 */
public class Fu {
    public final void show()
    {
        System.out.println("fu类的最终方法");
    }
    public void function()
    {
        System.out.println("fu类的一般方法");
    }
}
