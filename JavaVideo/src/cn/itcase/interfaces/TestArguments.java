package cn.itcase.interfaces;

public class TestArguments {
    public static void main(String[] args)
    {
        Student s=new Student();
        noSmoking(s);
        noSmoking(new Student());

    }
    public static void noSmoking(Smoking s)
    {
        s.smoking();
        System.out.println(Smoking.a);
    }
}
