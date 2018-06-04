package 第四次上机.第五题.pka.pkb.pkc;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：
 * 在工作目录中建立pka.pkb.pkc包，
 * 在包pkc中建立一个名为MyStack<E>
 *     的范型堆栈类，有两个私有成员
 *     变量：E[] stk和 int pos，分
 *     别表示创建的任意大小的堆栈和
 *     栈顶的索引，写出该类的构造函
 *     数、入栈函数void push(E x)、
 *     出栈函数E pop(), 另外，建立
 *     pka.pkb.pkd包，在pkd包中定义
 *     一个测试类MyTest，其中包含主
 *     函数，测试MyStack<E>类的各个
 *     方法，测试时要求分别E的取值包
 *     括Integer, String以及自己建
 *     立的一个类Student(自己任意定义) 。
 * @param <E>
 */
public class MyStack<E> {
    E[] stk;
    int pos=-1;
    public MyStack(int num){
        stk=(E[]) new Object[num];
    }
    public void push(E x){
        if(pos==stk.length-1){
            System.out.println("栈满");
        }else{
            stk[++pos]=x;
        }
    }
    public void pop(){
        if(pos==-1){
            System.out.println("栈空");
        }else{
            System.out.println(stk[pos--]);
        }
    }
}
