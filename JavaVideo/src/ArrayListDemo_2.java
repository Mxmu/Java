import java.util.ArrayList;
public class ArrayListDemo_2 {
    public static void main(String[] args){
        ArrayList<Integer> array=new <Integer>ArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        for(int i=0;i<array.size();i++)
        {
            System.out.println(array.get(i));
        }
    }

}
