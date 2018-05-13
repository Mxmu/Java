package cn.itcase.demo43;

public class TestArguments {
    public static void main(String[] args)
    {
        Cat c=new Cat();
        operatorAnimal(c);
        operatorAnimal(new Dog());
    }
    public static void operatorAnimal(Animal a)
    {
        a.eat();
    }
}
