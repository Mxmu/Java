package cn.itcase.demo43;

public class TestReturn {
    public static void main(String[] args)
    {
        GetAnimal g=new GetAnimal();
        Animal a=g.getAnimal();
        a.eat();
    }
}
