package cn.itcase.demo42;

import sun.misc.Perf;

public class TestReturn {
    public static void main(String[] args)
    {
        getPerson g=new getPerson();
        Person p=g.get();
        p.run();
        p.eat();

    }
}
