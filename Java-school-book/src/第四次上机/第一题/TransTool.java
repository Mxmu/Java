package 第四次上机.第一题;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：
 * 将上次上机的第一题用抽象类来做，具体要求如下：
 * 建立交通工具抽象类TransTool，里面包含两个抽象方法void run()
 * 和void brake(),然后建立它的Bike、Car以及Bus子类, 在各个子类
 * 中重写void run()和void brake()方法，在实现各个方法时只要输出
 * 一个自己定义的对应的提示信息即可。最后建立一个测试类MyTest, 该
 * 类中包含主函数，测试运行时的多态性。
 */
abstract class TransTool {
        abstract void run();
        abstract void brake();
}
