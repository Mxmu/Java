import java.util.Scanner;

public class checkDemo {
    public static void check(){
        Scanner in=new Scanner(System.in);
        System.out.println("请输入商品的数目:");
        int num=in.nextInt();
        if(num<0)
            throw new NumberFormatException("商品数目不能小于0!");
        else
            System.out.println("商品数目为:"+num);
    }
    public static void main(String[] args) {
        try{
            check();
        }catch(Exception e){
            System.out.println("异常:"+e.getMessage());
        }
    }
}
