package 第四次上机.第二题;

public class MyTest {
    public static void main(String[] args)
    {
        TransTool m;
        m=new Bike();
        m.run();
        m.brake();
        m=new Car();
        m.run();
        m.brake();
        m=new Bus();
        m.run();
        m.brake();
    }
}
