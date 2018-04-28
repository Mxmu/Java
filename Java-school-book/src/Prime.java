/*求出2-1000内的所有个位为3或7并且十位为1或2的素数，并按每行5列的格式输出*/
//import java.util.Scanner;
public class Prime {
    public static void main(String[] args)
    {
       int n,t,count=0;
       for(n=2;n<=1000;n++)
       {
           for(t=2;t<=(int)Math.sqrt(n);t++)
           {
               if(n%t==0) break;
           }
           if(t>(int)Math.sqrt(n))
           {
               if(((n%10==3) &&(n / 10 % 10 ==1))||((n%10==3)&&(n/10%10==2))
                       ||((n%10==7)&&(n/10%10==1))||((n%10==7)&&(n/10%10==2))) {
                   count++;
                   System.out.print(n+"\t");
                   if (count % 5 == 0) System.out.println( );
               }

       }

}}}
