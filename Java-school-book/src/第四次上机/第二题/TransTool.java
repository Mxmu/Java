package 第四次上机.第二题;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：将上次上机的第一题用接口来做，具体要求如下：
 * 建立交通工具接口TransTool，里面包含两个方法void run()
 * 和void brake(),然后分别建立Bike、Car以及Bus类实现该接口，
 * 在实现各个方法时只要输出一个自己定义的对应的提示信息即可。
 * 最后建立一个测试类MyTest, 该类中包含主函数，测试接口回调。
 */
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

