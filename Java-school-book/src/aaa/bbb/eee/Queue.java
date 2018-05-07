package aaa.bbb.eee;

public class Queue {
    int[] que;
    int front=0;
    int rear=0;
    int counter;
    public Queue(int b){
        que=new int[b];
        counter=b;
    }
    public void insert(int x){
        if((rear+1)%counter==front) System.out.print("队列已满");
        else {
            que[rear]=x;
            rear=(rear+1)%counter;
        }
    }
    public void remove(){
        if(front==rear) System.out.print("空队列，无法出的队");
        else{
            front=(front+1)%counter;
        }
    }
    public void print(){
        if(front==rear) System.out.print("空队列，无法打印");
        else{
            int p=front;
            while (p!=rear) {
                System.out.println(que[front]);
                p=(p+1)%counter;
            }
            p=front;
        }
    }
}

