package cn.itcase.demo56;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection接口中的方法
是集合中所有实现类必须拥有的方法
使用Collection接口的实现类,程序的演示
ArrayList implements List
List extends Collection
方法的执行,都是实现的重写
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //function();
        //function_1();
        //function_2();
        function_3();
    }
/*
Collection接口的方法
void clear() 清空集合中的所有元素
集合容器本身依然存在
 */
    public static void function(){
        //接口的多态方式调用
        Collection<String> coll=new ArrayList<String>();
        coll.add("abc");
        coll.add("bcd");
        System.out.println(coll);
        coll.clear();
        System.out.println(coll);
    }
    /*
    boolean contains(Object o) 判断对象是否存在于集合中,对象存在返回true
     */
    public static void function_1(){
        Collection<String> coll=new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("123");
        boolean b=coll.contains(123); //类型不一样
        System.out.println(b);
    }
    /*
   Object[] toArray() 集合中的元素,转成一个数组中的元素,集合转成数组
   返回的是一个存储对象的数组,数组存储的数据类型是 Object
     */
    public static void function_2(){
        Collection<String> coll=new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("123");
        Object [] objs=coll.toArray();
        for (int i = 0; i <objs.length ; i++) {
            System.out.println(objs[i]);
        }
    }
    /*
    boolean remove(Object o) 移除集合中的指定元素
    若有两个相同 删除第一个遇到的元素
     */
    public static void function_3(){
        Collection<String> coll=new ArrayList<String>();
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("123");
        System.out.println(coll);
        boolean b=coll.remove("c");
        System.out.println(b);
        System.out.println(coll);
    }

}
