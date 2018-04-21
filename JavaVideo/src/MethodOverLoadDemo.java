public class MethodOverLoadDemo {//方法的重载,在同一个类中，允许出现同名的方法，只要方法的参数列表不同即可
    public static void main(String[] args){
        int sum=getSum(2,3);

        System.out.println(sum);
    }
    public static int getSum(int a,int b){
        return a+b;
    }
    public static int getSum(int a,int b,int c){
        return a+b+c;
    }
    public static double getSum(double a,double b){
        return a+b;
    }
}
