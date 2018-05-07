package aaa.bbb.ggg;

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
            //return ;
        }
        else {
            Queue[rear] = x;
            rear = (rear + 1) % counter;
        }


    }
    public int remove()
    {
        int x;
        if(rear==front)
        {
            System.out.println("队空,不能出队");
            return 0;
        }
        else {
            x = Queue[front];
            front = (front + 1) % counter;
            return x;
        }
    }

}