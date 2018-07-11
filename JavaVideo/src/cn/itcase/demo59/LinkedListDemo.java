package cn.itcase.demo59;

import java.util.LinkedList;

/*
LinkedList链表集合的特有功能
自身特点:链表底层实现,查询慢,增删快

子类特有功能,不能多态调用
 */
public class LinkedListDemo {
    public static void main(String[] args) {
       // function();
        //function_1();
        function_2();
    }
    /*
    addFirst(E) 添加到链表的开头
    addLast(E) 添加到链表的结尾
     */
    public static void function(){
        LinkedList<String> link=new LinkedList<String>();
        link.add("abc");
        link.add("bcd");

        link.addFirst("ycm");
        link.addLast("lalalal");
        System.out.println(link);
    }
    /*
    E getFirst() 获取链表的开头
    E getLast() 获取链表的结尾
     */
    public static void function_1() {
        LinkedList<String> link = new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        link.add("4");

        //if (link.size() != 0) {
        if(!link.isEmpty()){
            String first = link.getFirst();
            String last = link.getLast();
            System.out.println(first);
            System.out.println(last);
        }
    }

    /*
    E removeFirst() 移除并返回链表的开头
    E removeLast() 移除并返回链表的结尾
     */
    public static void function_2(){
        LinkedList<String> link = new LinkedList<String>();
        link.add("1");
        link.add("2");
        link.add("3");
        link.add("4");

        String first=link.removeFirst();
        String last=link.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(link);
    }
}
