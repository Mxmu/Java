import java.util.Random;
public class RandomDemo {
    public static void main(String[] args){
        Random ran=new Random();
        int i=ran.nextInt(100)+1;
        System.out.println(i);
        double j=ran.nextDouble();
        System.out.println(j);
    }
}
