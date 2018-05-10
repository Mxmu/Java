package cn.itcase.demo21;
/*
    关键字instanceof比较一个引用类型的变量是不是这个类型的对象
 */
public class Test {
    public static void main(String[] args)
    {
        //Person p=new Student();
        Person p=new Teacher();
        boolean b=p instanceof Student;
        System.out.println(b);
        p.sleep();

    }
}
