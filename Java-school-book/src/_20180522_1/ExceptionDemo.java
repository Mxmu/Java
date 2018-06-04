package _20180522_1;
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            String str = null;
            int len = str.length();

        } catch (NullPointerException e1) {
            System.out.println("空指针异常");
        }
        try {
            int a = 12 / 0;
        } catch (ArithmeticException e2) {
            System.out.println("算术异常");
            try {
                float[] arr = new float[4];
                arr[4] = 9;
            } catch (ArrayIndexOutOfBoundsException e3) {
                System.out.println("数组下标越界异常");
            }
            try {
                String str1 = "23U";
                double d = Double.parseDouble(str1);
            } catch (NumberFormatException e4) {
                System.out.println("字符串转换为数字时异常");
            }
        }
    }
}