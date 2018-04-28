import java.io.Console;

public class TestPhone_1 {
    public static void main(String[] args)
    {
        Phone p1=new Phone();
        Phone p2=new Phone();
        p1.color="yellow";
        p1.brand="联想";
        p1.size=4;
        p2.color="red";
        System.out.println(p1.color+" "+p1.brand+" "+p1.size);
        System.out.println(p2.color+" "+p2.brand+" "+p2.size);
    }
}
