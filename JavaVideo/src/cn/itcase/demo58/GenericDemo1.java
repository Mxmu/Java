package cn.itcase.demo58;

import java.util.ArrayList;

public class GenericDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(123);
        array.add(456);
        Integer[] i=new Integer[array.size()];
        Integer[] j=array.toArray(i);
        for(Integer k:j){
            System.out.println(k);
        }
    }
}
