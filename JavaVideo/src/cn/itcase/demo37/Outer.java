package cn.itcase.demo37;

public class Outer {
    private int a=1;
    class Inner{
        public void inner()
        {
            System.out.println("内部类方法inner"+a);
        }
    }
}
