import java.util.Scanner;

class MyException extends Exception{
    private String myString;
    public MyException(String myString){
        this.myString=myString;
    }
    public String getMyString(){
        return myString;
    }
    @Override
    public String toString(){
        return myString;
    }
}

public class ExceptionTest {
    public static void main(String[] args) {
        double i,j;
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入分子:");
        i=scan.nextDouble();
        System.out.println("请输入分母:");
        j=scan.nextDouble();
        try{
            if(j==0){
                throw new MyException("除数不能为零!");
            }
            else{
                System.out.println("分数值为:"+i+"/"+j+"="+(i/j));
            }
        }catch (MyException e){
            System.out.println(e);
        }
    }
}
