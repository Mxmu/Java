package 第三次上机.aaa.bbb.ccc;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：在工作目录中建立aaa.bbb.ccc包，在包ccc中建立一个名为Queue队列类，
 *      有4个私有成员变量：int[] que, int front，int rear, int counter
 *      分别表示创建的任意大小的队列、队列的头部、队列尾部的索引，以及已经入
 *      队的元素的个数。写出该类的构造函数、入队函数void insert(int x)、出
 *      对函数int remove(), 另外，建立aaa.bbb.ddd包，在ddd包中定义一个测试
 *      类MyTest，其中包含主函数，测试Queue类的各个方法。
 */
public class Queue {
    int []Queue;
    int front;
    int rear;
    int counter;
    public Queue(int len)
    {
        this.counter=len;
        Queue =new int [len] ;
        front=0;
        rear=0;

    }
    public void insert(int x)
    {
        if((rear+1)%counter==front)
        {
            System.out.println("队满,不能入队");

        }

            Queue[rear] = x;
            rear = (rear + 1) % counter;



    }
    public int remove()
    {
        int x;
        if(rear==front)
        {
            System.out.println("队空,不能出队");

        }

            x = Queue[front];
            front = (front + 1) % counter;
            return x;

    }

}
