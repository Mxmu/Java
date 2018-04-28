import java.util.ArrayList;
public class ArrayListDemo_1 {
    public static void main(String[] args)
    {
        ArrayList<String> arr=new ArrayList<String>();
        arr.add("哈哈哈哈");
        arr.add("呜呜呜呜");
        arr.add("嘻嘻嘻嘻");
        int size=arr.size();
        System.out.println(size);
        String s=arr.get(1);
        System.out.println(s);
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));
    }
}
