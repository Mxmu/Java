package aaa.bbb.ccc;

public class Queue {
    int []Queue;
    int front;
    int rear;
    public Queue(int[] queue,int front,int rear){
        super();
        Queue=queue;
        this.front=front;
        this.rear=rear;

    }
    public void insert(int x) {
        rear++;
        Queue[rear] = x;

    }
    public int remove()
    {
        int n=Queue[front];
        front++;
        return n;
    }

}
