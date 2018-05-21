import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args) {
        int score,num;
        double avg;
        Scanner in=new Scanner(System.in);
        try {
            System.out.println("请输入总分:");
            score = in.nextInt();
            System.out.println("请输入人数:");
            num = in.nextInt();
            avg = score / num;
            System.out.println("平均成绩为:" + avg);
        }catch (InputMismatchException e1){
            System.out.println("输入的不是数字!");
        }catch (ArithmeticException e2){
            System.out.println("人数不能为0");
        }catch(Exception e3){
            System.out.println("其他异常");
        }
    }
}
