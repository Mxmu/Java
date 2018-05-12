package cn.itcase.demo38;

public class Test {
    public static void main(String[] args)
    {
        Outer.Inner in=new Outer().new Inner();
        in.inner();

    }

}
