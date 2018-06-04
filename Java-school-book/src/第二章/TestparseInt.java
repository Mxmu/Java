package 第二章;

public class TestparseInt {
    public static void main(String[] args) {
        String str1="100";
        String str2="12345678";
        int int1=Integer.parseInt(str1,16);
        long lng=Long.valueOf(str2).longValue();
        System.out.println(int1);
        System.out.println(lng);
    }
}
