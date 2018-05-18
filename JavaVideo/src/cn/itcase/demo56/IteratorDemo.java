package cn.itcase.demo56;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
集合中的迭代器:
    获取集合中元素方法
 接口Iterator 两个抽象方法
  boolean hasNext() 判断集合中还有没有可以被取出的元素,如果有返回true
  next() 取出集合中的下一个元素
 Iterator接口,找实现类
  Collection接口定义方法
   Iterator iterator()
   ArrayList 重写方法 iterator(), 返回了Iterator接口的实现类的对象
   使用ArrayList集合的对象
   Iterator it=array.iterator(),运行结果就是Iterator接口的实现类的对象
   it是接口的实现类对象,调用方法hasNext和next集合元素迭代
 */
public class IteratorDemo {
    public static void main(String[] args) {
        //Collection<String> coll=new ArrayList<String>();
        Collection<String> coll=new HashSet<String>();

        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");
        Iterator<String> it=coll.iterator();
        boolean b=it.hasNext();
        System.out.println(b);

        while(it.hasNext())
        {
            String s=it.next();
            System.out.println(s);
        }
    }
}
