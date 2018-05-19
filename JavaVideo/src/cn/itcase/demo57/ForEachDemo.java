package cn.itcase.demo57;
import cn.itcase.demo56.Person;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        //function();
        //function_1();
        function_2();
    }

    public static void function(){
        /*
        实现for循环,遍历数组
        好处:代码少了,方便对容器遍历
        弊端:没有索引,不能操作容器里面的元素
         */
        int[] arr={3,1,3,4,5,6,7,8};
        for(int a:arr)
        {
            System.out.println(a+1);
        }
        System.out.println(arr[0]);
    }
    public static void function_1(){
        String [] str={"a","bcd","e","def"};
        for(String b:str){
            System.out.println(b);
            System.out.println(b.length());
        }
    }
    public static void function_2(){
        ArrayList<Person> array=new ArrayList<Person>();
        array.add(new Person("a",20));
        array.add(new Person("b",19));
        for(Person p:array){
            System.out.println(p);
        }
    }
}
