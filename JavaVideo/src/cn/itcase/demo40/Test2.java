package cn.itcase.demo40;

public class Test2 {
    public static void main(String[] args)
    {
        Animal a=new Animal(){
            public void eat(){
                System.out.println("在吃饭");
            }
            public void sleep(){
                System.out.println("在睡觉");
            }
        };
        a.eat();
        a.sleep();
    }
}
