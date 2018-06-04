package 第五次上机.第一题;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：
 * 设计一个程序，不考虑程序代码的算法意义，
 * 只要求程序代码可能产生NullPointerException
 * 异常、ArithmetricException异常、
 * ArrayIndexOutofBoundException异常以
 * 及NubmerFormatException异常，并通过try-catch语句
 * 捕获以上各种异常，做不同的处理（显示不同的提示信息）。
 */
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