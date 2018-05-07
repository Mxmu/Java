package FatherSon;
import FatherSon.Jc1;
public class Test2 {
    public static void main(String[] args)
    {
        Son1 s1=new Son1();
        Son2 s2=new Son2();
        Jc1 s=new Jc1();
        s.fun(s1);
        s.fun(s2);
    }
}
