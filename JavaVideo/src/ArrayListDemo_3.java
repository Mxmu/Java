import java.util.ArrayList;
public class ArrayListDemo_3 {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new <Integer>ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(2,9); //在2索引位置添加9
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }                                  //输出1 2 9 3 4
        System.out.println();
        arr.set(3,7);                      //把3索引的元素更改为7
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" "); //输出1 2 9 7 4
        }
        System.out.println();
        arr.remove(2);               //删除2索引位置的元素
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" "); //输出1 2 7 4
        }
        arr.clear();                    //清空
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" "); //无输出
        }

    }
}
