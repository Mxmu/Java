package cn.itcase.demo12;
/* 方法没有主体的方法，必须使用关键字abstract修饰
   抽象的方法，必须存在于抽象的类中，类也必须用abstract修饰
   抽象类不能new
   抽象类使用：定义类继承抽象类，将抽象方法进行重写，创建子类的对象
   如果子类继承了抽象类，重写了一部分的抽象方法，这个子类还是一个抽象类
 */
public abstract class Develop{
        public abstract void work();
}
