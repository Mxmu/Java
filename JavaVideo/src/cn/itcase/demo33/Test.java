package cn.itcase.demo33;

public class Test {
    public static void main(String[] args)
    {
        Zi z=new Zi();
        z.function();
        z.show();
        final int i=10; //final修饰，一次赋值，终生不变
        System.out.println(i);
        //final修饰引用变量问题
        final Zi z2=new Zi();//变量保存的地址终生不变
        z2.function();
    }
}
