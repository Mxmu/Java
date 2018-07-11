package cn.itcase.demo60;

import java.net.SocketTimeoutException;
import java.util.HashSet;

/*
HashSet集合的自身特点:
底层数据结构,哈希表
存储,取出都比较快
线程不安全(不同步),运行速度快
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
//        HashSet<String> set=new HashSet<String>();
//        set.add(new String("abc"));
//        set.add(new String("abc"));
//        set.add(new String("bbc"));
//        set.add(new String("bbc"));
//        set.add(new String("adc"));
//        set.add(null);
//        set.add(null);
//        System.out.println(set);

        HashSet<Person> setPerson=new HashSet<Person>();
        setPerson.add(new Person("a",20));
        setPerson.add(new Person("b",10));
        setPerson.add(new Person("b",10));
        setPerson.add(new Person("c",25));
        setPerson.add(new Person("d",19));
        setPerson.add(new Person("e",17));
        System.out.println(setPerson);
    }
}
