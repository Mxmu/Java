package 第四次上机.第五题.pka.pkb.pkc.pka.pkb.pkd;

import 第四次上机.第五题.pka.pkb.pkc.MyStack;

public class Mytest {
    public static void main(String[] args){
        Text1();
        System.out.println();
        Text2();
        System.out.println();
        Text3();
    }

    static class Student{
        String name;
        public Student(String name){
            this.name=name;
        }
    }

    public static void Text1(){
        MyStack<String> stk=new MyStack<String>(2);
        stk.push("a");
        stk.push("b");
        stk.push("c");
        stk.pop();
        stk.pop();
        stk.pop();
    }

    public static void Text2(){
        MyStack<Integer> stk=new MyStack<Integer>(2);
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.pop();
        stk.pop();
        stk.pop();
    }

    public static void Text3(){
        Student std1=new Student("小王");
        Student std2=new Student("小明");
        Student std3=new Student("小红");
        MyStack<Student> stk=new MyStack<Student>(2);
        stk.push(std1);
        stk.push(std2);
        stk.push(std3);
        stk.pop();
        stk.pop();
        stk.pop();
    }
}

