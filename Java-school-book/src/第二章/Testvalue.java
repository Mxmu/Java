package 第二章;

public class Testvalue {
    public static void main(String[] args) {
        long lng=12345678;
        int int1=100;
        String str1=String.valueOf(lng);
        String str2=Integer.toString(int1,16).toUpperCase();
        System.out.println(str1);
        System.out.println(str2);
    }
}
