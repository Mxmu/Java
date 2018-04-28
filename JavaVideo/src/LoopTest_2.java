/* A~Z 65~90
   a~z 97~122
 */
public class LoopTest_2 {
    public static void main(String[] args)
    {
      char DaXie='A';
      char XiaoXie='a';
      for(int i=0;i<26;i++)
      {
          System.out.println(DaXie+" "+XiaoXie);
          DaXie++;
          XiaoXie++;
      }
    }
}
