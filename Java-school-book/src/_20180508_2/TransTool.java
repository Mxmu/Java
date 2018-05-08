package _20180508_2;

public interface TransTool {
         void run();
         void brake();
}
class Bike implements TransTool
{
    public void run()
    {
        System.out.println("Bike run");
    }
    public void brake()
    {
        System.out.println("Bike brake");
    }
}

class Car implements TransTool
{
    public void run()
    {
        System.out.println("Car run");
    }
    public void brake()
    {
        System.out.println("Car brake");
    }
}

class Bus implements TransTool
{
    public void run()
    {
        System.out.println("Bus run");
    }
    public void brake()
    {
        System.out.println("Bus brake");
    }
}

