package cn.itcase.demo10;
/*子类中，出现了和父类一模一样的方法的时候，子类重写父类的方法，覆盖
   子类重写父类的方法
   保证子类方法的权限大于或者等于父类方法权限
   default权限是默认权限，不能写，写了就报错
 */
public class Zi extends Fu {
    public void show2()
    {
        System.out.println("子类的方法show2");
    }
}
