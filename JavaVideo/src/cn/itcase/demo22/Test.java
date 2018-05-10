package cn.itcase.demo22;

public class Test {
    public static void main(String[] args)
    {
        Animal a1=new Cat();
        Animal a2=new Dog();
        a1.eat();
        a2.eat();
        //类向下转型,强制转换,调用子类的特有
        //防止发生异常:a1属于Cat对象,转成Cat类,a2属于Dog对象,转成Dog
        //instanceof判断
        if(a1 instanceof Cat) {
            Cat c = (Cat) a1;
            c.catchMouse();
        }
        if(a2 instanceof Dog)
        {
            Dog d=(Dog) a2;
            d.lookHome();
        }
    }
}
