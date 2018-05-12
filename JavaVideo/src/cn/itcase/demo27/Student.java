package cn.itcase.demo27;
/*
    子类的构造方法，有一个默认添加的构造方法
    注意：子类构造方法的第一行，有一个隐式代码super()
    public Student()
    {
        super();
        }
        子类的构造方法的第一行super语句，调用分类的构造方法
 */
public class Student extends Person {
    public Student()
    {
        //super();  //即使注释也存在
        System.out.println("调用了子类构造方法");
    }
}
