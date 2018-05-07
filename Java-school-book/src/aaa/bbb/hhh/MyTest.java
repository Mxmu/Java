package aaa.bbb.hhh;
import aaa.bbb.ggg.Queue;
import java.util.Scanner;

public class MyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(3);
                    System.out.println("请输入入队的元素:");
                    int c = sc.nextInt();
                    q.insert(c);
                    System.out.println("出队的元素是:");
                    int d = q.remove();
                    System.out.println(d);

        }
    }

