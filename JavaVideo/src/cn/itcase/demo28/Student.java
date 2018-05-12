package cn.itcase.demo28;
/*子类中所有的构造方法，无论重载多少个，第一行必须是super()
  如果父类有多个构造方法，子类任意调用一个就可以
 */
public class Student extends  Person {
    public Student()
    {
        super(0);
    }
    public Student(String s)
    {
        super(1);
    }
}
