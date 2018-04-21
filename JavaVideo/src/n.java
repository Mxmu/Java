import java.util.Random;

public class n {
    public static void main (String args[]){
        for (int a = 0 ; a < 8 ;a++){
            for (int b = 8; b > a ; b--){
                System.out.print(" ");
            }
            for (int b = 1; b < a*2 ; b++){
                System.out.print("*");//1,3,5,7
            }
            System.out.println();
        }
    }

}
