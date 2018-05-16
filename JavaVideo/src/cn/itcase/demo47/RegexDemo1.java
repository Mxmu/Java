package cn.itcase.demo47;

public class RegexDemo1 {
    public static void main(String[] args) {
        split_1();
        split_2();
        split_3();
        split_4();
    }
    public static void split_1(){
        String str="12-25-36-98";
        String[] strArr=str.split("-");
        System.out.println("数组的长度"+strArr.length);
        for (int i = 0; i <strArr.length ; i++) {
            System.out.println(strArr[i]);
        }
    }
    public static void split_2(){
        String str="18 22 40 65";
        String[] strArr=str.split(" ");
        System.out.println("数组的长度"+strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
    public static void split_3(){
        String str="18   22        40    65";
        String[] strArr=str.split(" +");
        System.out.println("数组的长度"+strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
    public static void split_4(){
        String ip="192.168.85.1";
        String[] strArr=ip.split("\\.");
        System.out.println("数组的长度"+strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
