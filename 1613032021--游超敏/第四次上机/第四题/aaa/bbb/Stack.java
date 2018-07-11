package 第四题.aaa.bbb;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：将上次上机的第二题按如下要求改进和扩充，实现一个字符串的逆序功能。
 * 在工作目录中建立aaa.bbb.ccc包，在包ccc中建立一个名为Stack的类，
 * 有三个私有成员变量：char[] stk、int pos以及int size，分别表示
 * 创建的堆栈、栈顶的索引以及栈的容量大小，写出该类的构造函数、入栈
 * 函数void push(int x)、出栈函数int pop(), 取栈顶元素（元素不出栈）
 * 函数int peek()以及判断栈是否为空栈的函数void isEmpty()；另外，建
 * 立aaa.bbb.rrr包，在包中建立一个字符串逆序类Myreverser,该类包括两
 * 个私有数据成员String input和String output,分别表示逆序前和逆序后
 * 的字符串，请写出Myreverser类的构造函数public Myreverser(String
 * myinput)以及将字符串逆序函数public String reverse(),实现该逆序函
 * 数时要求使用aaa.bbb.ccc包中的Stack的类来做，算法思想是按照堆栈操作
 * 的先进后出的原则，将一个字符串的每个字符取出后依次入栈，所有字符都入
 * 栈完毕后再将栈中字符依次出栈后连接，即为逆序字符。注意，取字符串中索
 * 引为index的字符可以使用系统类库中String类的方法：public char charAt(int index)，
 * 具体可以查阅API文档。最后，建立aaa.bbb.ddd包，在ddd包中定义一个测试类MyTest，
 * 其中包含主函数，使用Stack类和Myreverser类测试字符串的逆序功能。
 */
public class Stack {
    private char[] stk;
    private int pos=-1;
    private int size;
    public Stack(int size){
        this.size=size;
        stk=new char[size];
    }
    public void push(char x){
        if(pos==size-1){
            System.out.println("栈满");
        }else {
            stk[++pos] = x;
        }
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("栈空");
            return 0;
        }else{
            return stk[pos--];
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("栈空");
        }else {
            System.out.print(stk[pos]);
        }
    }
    public boolean isEmpty(){
        if (pos==-1){
            return true;
        }else{
            return false;
        }
    }
}
