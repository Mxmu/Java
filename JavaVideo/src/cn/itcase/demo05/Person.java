package cn.itcase.demo05;
/*私有化所有所有的属性（成员变量），必须写对应的get/set方法
  凡是自定义的类，自定义成员变量，应该私有化，提供get/set
  this关键字:
  区分成员变量和局部变量同名情况
  方法中，访问成员变量，写this.
  this和调用者p内存地址相同
 */
public class Person {
    private String name;
    private  int age;
    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public void speak()
    {
        String name="李四";
        int age=16;
        System.out.println(this);
        System.out.println("人在说话"+this.name+"..."+this.age);
    }
}
