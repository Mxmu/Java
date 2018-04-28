/*实现一个三行三列的矩阵和它的转置相乘*/
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        int[][] p = new int[3][3];
        int[][] q = new int[3][3];
        int count=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                p[i][j] = sc.nextInt();
                count++;
            }
        }
        System.out.println("您输入的矩阵为:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(p[i][j]+" ");
            }
            if(count%3==0) System.out.println();
        }
        System.out.println();
        System.out.println("它的转置矩阵为:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(p[j][i]+" ");
            }
            if(count%3==0) System.out.println();}
            System.out.println();
            System.out.println("您输入的矩阵与它的转置矩阵相乘为:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                q[i][j]=p[i][j]*p[j][i];
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(q[j][i]+" ");
            }
            if(count%3==0) System.out.println();}

    }
}
