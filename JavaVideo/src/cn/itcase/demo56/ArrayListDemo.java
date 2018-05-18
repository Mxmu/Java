package cn.itcase.demo56;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        集合ArrayList,存储int类型数
        集合本身不接受基本类,自动装箱存储
         */
        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(4);
        for (int i = 0; i <array.size() ; i++) {
            System.out.println(array.get(i));
        }
        /*
        集合存储自定义的Person类的对象
         */
        ArrayList<Person> arrayPer=new ArrayList<Person>();
        arrayPer.add(new Person("a",20));
        arrayPer.add(new Person("b",21));
        arrayPer.add(new Person("c",22));
        //get(0),取出的对象是Person对象
        //打印的是一个对象,必须调用的toString()
        for (int i = 0; i <arrayPer.size() ; i++) {
            System.out.println(arrayPer.get(i));

        }
    }
}
