package cn.itcase.demo13;
/*抽象类可以没有抽象方法，可以定义带有方法体的方法
  让子类继承后，可以直接使用
  abstract不能与private，final，static连用
 */
public abstract class Animal {
    public void sleep()
    {
        System.out.println("动物睡觉");
    }
}
