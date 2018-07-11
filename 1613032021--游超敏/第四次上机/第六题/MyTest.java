package 第四次上机.第六题;
/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：
 *
 利用jdk提供的类库中的Stack<E>完成上述测试类MyTest的测试要求。

 */

import java.util.Stack;

public class MyTest {
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
        Stack<String> stk=new Stack<String>();
        stk.push("a");
        stk.push("b");
        stk.push("c");
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }

    public static void Text2(){
        Stack<Integer> stk=new Stack<Integer>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }

    public static void Text3(){
        Student std1=new Student("小王");
        Student std2=new Student("小明");
        Student std3=new Student("小红");
        Stack<Student> stk=new Stack<Student>();
        stk.push(std1);
        stk.push(std2);
        stk.push(std3);
        System.out.println(stk.pop());
        System.out.println(stk.pop());
        System.out.println(stk.pop());
    }
}
