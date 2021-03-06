package cn.itcase.demo53;

public class MathDemo {
    public static void main(String[] args) {
        //function();
        //function_1();
        //function_2();
        //function_3();
        //function_4();
        //function_5();
        function_6();
    }
    public static void function(){
       // int i=Math.abs(-9);
        int i=abs(-9);
        System.out.println(i);
    }
    public static int abs(int i){
        if(i>=0)
            return i;
        else
            return -i;
    }
    /*
    static double ceil(double d)
    返回大于或者等于参数d的最小整数
     */
    public static void function_1(){
        double d=Math.ceil(5.1);
        System.out.println(d);
    }
    /*
    返回小于或者等于参数d的最大整数
    static double floor(double d)
     */
    public static void function_2(){
        double d=Math.floor(-1.5);
        System.out.println(d);
    }
    /*
    static double pow(double a,double b）
    a的b次方
     */
    public static void function_3(){
        double d=Math.pow(2,3);
        System.out.println(d);
    }
    public static void function_4(){
        double d=Math.sqrt(-2);//NaN
        System.out.println(d);
    }
    /*
    static double random() 返回随机数0.0-1.0之间
    来源,也是Random类
     */
    public static void function_5(){
        for(int i=0;i<10;i++){
            double d=Math.random();
            System.out.println(d);
        }
    }
    /*
    static double round(double d)
    获取参数的四舍五入值,取整数
     */
    public static void function_6(){
        //double d=Math.round(5.6198);
        double d=round(5.467778);
        System.out.println(d);
    }
    public static int round(double i){
       return (int)(i+0.5);
    }
}
