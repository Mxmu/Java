import java.util.Scanner;
public class LoopTest_1 {
    public static void main(String[] args)
    {
        System.out.println("请输入一个数:");
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int a=0;         //定义百位数字
        int b=0;         //定义十位数字
        int c=0;         //定义个位数字
        a=s/100;
        b=s/10%10;
        c=s%10;
        if(s==a*a*a+b*b*b+c*c*c)
            System.out.println(s+"是水仙花数");
        else System.out.println(s+"不是水仙花数");
      /*  for(int i=100;i<=999;i++)
        {
            a=i/100;
            b=i/10%10;
            c=i%10;
            if(i==a*a*a+b*b*b+c*c*c)
            {
                System.out.println(i);
            }
        }*/

    }
}
