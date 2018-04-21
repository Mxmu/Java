import java.util.Scanner;
public class MethodDemo_1 {
    public static void main(String[] args){
        printRect();
        System.out.println(getNumber());
        int avg=getAvg(1,2,3);
        System.out.println(avg);
    }
    public static int getAvg(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static int getNumber(){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        return number;
    }
    public static void printRect(){
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++){
                System.out.print("*");

            }System.out.println();
        }
    }
}
