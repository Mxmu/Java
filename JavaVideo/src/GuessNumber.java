import java.util.Random;
import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args){
    System.out.println("猜数字游戏");
    System.out.println("请输入一个数字:");
    Random ran=new Random(0);
    int ranNumber=ran.nextInt(100)+1;
    Scanner sc=new Scanner(System.in);
    while(true){
        int number=sc.nextInt();
        if(number>ranNumber) {
            System.out.println("猜大了");
        }else if(number<ranNumber) {
            System.out.println("猜小了");
        }else {
            System.out.println("猜中了");
            break;}
        }
    }
    }

