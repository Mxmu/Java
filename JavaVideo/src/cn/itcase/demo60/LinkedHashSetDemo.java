package cn.itcase.demo60;

import java.util.LinkedHashSet;

/*
LinkedHashSet 基于链表的哈希表实现
继承自HashSet

LinkedHashSet自身特性,具有顺序,存储和取出的顺序相同的
线程不安全的集合,运行速度快
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> link=new LinkedHashSet<Integer>();
        link.add(123);
        link.add(13);
        link.add(12);
        link.add(23);
        link.add(1234);
        link.add(1233);
        link.add(14123);
        System.out.println(link);
    }
}
