package cn.itcase.demo58;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
泛型的通配符
 */
public class GenericDemo2 {
    public static void main(String[] args) {
        ArrayList<String> array=new ArrayList<String>();
        HashSet<Integer> set=new HashSet<Integer>();
        array.add("123");
        array.add("456");
        set.add(789);
        set.add(890);
        iterator(array);
        iterator(set);
    }
    /*
    定义方法,可以同时迭代2个集合
    参数:写ArrayList和HashSet父类,或者共同实现的接口
    泛型的通配,匹配所有的数据类型 ?
     */
    public static void iterator(Collection<?> coll){
        Iterator<?> it=coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
