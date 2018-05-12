package cn.itcase.demo39;

public class Outer {
    public void out()
    {
        class Inner{
            public void inner()
            {
                System.out.println("局部内部类方法");
            }
        }
        Inner in=new Inner();
        in.inner();
    }
}
