package _20180508_2;

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
