package 第四次上机.第八题;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：利用jdk提供的类库中的ArrayList类建立一个字符串的动态数组，
 * 数组中的所有元素要求从键盘输入，数组建立好了以后，要求当输入一个
 * 指定的字符串时，在刚才的数组中查找该字符串，如果找到，将该字符串
 * 元素删除，如果找不到，则给出提示信息。
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入要输入的字符串个数:");
        int n = sc.nextInt();
        System.out.println("输入一组字符串:");
        for (int i = 0; i < n; i++) {
            System.out.println("输入第" + (i + 1) + "个字符串:");
            String str = sc1.nextLine();
            array.add(str);
        }
        System.out.println("数组中元素为:");
        System.out.println(array);
        System.out.println("请输入要删除的字符串:");
        String c = sc2.nextLine();
        int flase=0;
        for (int i = 0; i < array.size(); i++) {
            if (c.equals(array.get(i))) {
                array.remove(i);
                flase++;
            }
        }
        if(flase==0){
            System.out.println("在数组中找不到所给字符串!");
        }
        else {
            System.out.println("修改后数组为:");
            for (int i = 0; i < array.size(); i++) {
                System.out.println(array.get(i));
            }
        }
    }
}

