import java.util.Scanner;
public class Matrix_1 {
    public static int[][] Multiply(int a[][], int b[][]) {
        int [][] c= new int[3][3];
        int i;
        int j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                 c[i][j]=a[i][j]*b[i][j];
            }

        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        int count = 0;
        System.out.println("输入第一个矩阵:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
                count++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            if (count % 3 == 0) System.out.println();

        }
        System.out.println();
        System.out.println("输入第二个矩阵:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
                count++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            if (count % 3 == 0) System.out.println();

        }
        System.out.println();
        System.out.println("相乘后的矩阵为:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {   c=Multiply(a,b);
                System.out.print(c[i][j]+" ");
            }
            if (count % 3 == 0) System.out.println();
        }
    }
}
