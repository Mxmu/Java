package 第六次上机.第一题;

import com.sun.org.apache.bcel.internal.generic.LNEG;
/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：实现一个单向链表，链表的每个节点包括整型数据域和下一个节点的引用，要求实现链表的建立（建立的链表必须有序，按数据域升序排列）、节点的插入、节点的删除、链表的遍历（打印）
 * 要求：c++语言中我们一般用结构体类型的变量表示链表的每个结点，在java语言里，我们用类类型的变量，即对象来表示每个结点。因此，要求首先建立一个名为LinkNode的结点类，其中包括数据成员int data 和 LinkNode next，分别表示结点的数据域和链表中下一个结点的引用。写出该类的构造函数，以及public void DisplayLinkNode()成员函数，打印当前结点的数据域的值。
 * 然后再写一个名为 LinkList的链表类，包括数据成员	LinkNode head，表示链表的头结点的引用，按下列给出的类的框架完善各个成员函数

 */
import java.util.Scanner;

public class LinkList{
    第六次上机.第一题.LinkNode head;
    public LinkList(){ //写出构造函数
        head=null;
    }
    void Sort_Create(){ /*有序插入法生成链表，从键盘输入若干无序的整数（输入-1表示输入结束），将输入的整数赋值给各个结点对象的data成员，并要求创建的链表的数据域的值是按升序排列的。每输入一个整数，就创建一个结点，并将该结点插入到已生成的有序链表的合适位置，保证插入后链表依然有序。插入结点时调用下面的成员函数void Insert(LinkNode n)*/
        System.out.println("请输入节点数据，输入-1结束");
        Scanner sc=new Scanner(System.in);
        第六次上机.第一题.LinkNode n;
        int a=sc.nextInt();
        while(a!=-1){
            n=new 第六次上机.第一题.LinkNode(a);
            Insert(n);
            a=sc.nextInt();
        }
        sc.close();
    }

    void Insert(第六次上机.第一题.LinkNode n){
        /*在链表中查找恰当的位置，将结点n插入到当前链表中，确保插入后链表依然有序。*/
        第六次上机.第一题.LinkNode a,b;
        if(head==null){
            head=n;
            n.next=null;
        }else if(head.data>n.data){
            n.next=head;
            head=n;
        }else{
            a=b=head;
            while((b.next!=null)&&(b.data<n.data)){
                a=b;
                b=b.next;
            }
            if(b.data<n.data){
                b.next=n;
                n.next=null;
            }else{
                n.next=b;
                a.next=n;
            }
        }
    }

    void PrintList(){
        /*打印链表上各个结点的数据域的值*/
        第六次上机.第一题.LinkNode p;
        System.out.println("链表为：");
        p=head;
        while(p!=null){
            p.show();
            p=p.next;
        }
        System.out.println();
    }

    void Delete_one_node(int num){
        /*在当前链表中查找数据域的值为num的结点，将该结点删除*/
        第六次上机.第一题.LinkNode a,b;
        if(head==null){
            System.out.println("表空，无法删除节点");
        }
        if(head.data==num){
            head=head.next;
            System.out.println("删除成功");
        }else{
            a=head;
            b=a.next;
            while(b.data!=num&&b.next!=null) {
                a=b;
                b=b.next;
            }
            if(b.data==num){
                b=b.next;
                a.next=b;
                System.out.println("删除成功");
            }else{
                System.out.println("无可删除节点");
            }
        }
    }

}
