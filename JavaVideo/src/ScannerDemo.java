import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
       int i= sc.nextInt();
        System.out.println(i+1);
        String s=sc.next();
        System.out.println(s+2);
    }
}
