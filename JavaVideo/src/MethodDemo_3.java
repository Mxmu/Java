public class MethodDemo_3 {
    public static void main(String[] args){//方法调用中参数传递问题
        int a=1;
        int b=2;
        change(a,b);
        System.out.println(a);
        System.out.println(b);
    }
    public static void change(int a,int b){
        a=a+b;
        b=b+a;
    }

}
