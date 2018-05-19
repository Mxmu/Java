package cn.itcase.demo58;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
泛型:指明了集合中存储数据的类型<数据类型>
 */
public class GenericDemo {
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        Collection <String>coll=new ArrayList<String>();
        coll.add("abc");
        coll.add("bc");
        coll.add("c");
        //coll.add(1);

        Iterator<String> it=coll.iterator();
        while(it.hasNext()){
            //System.out.println(it.next());
            String s=it.next();
            System.out.println(s.length());
        }
    }
}
