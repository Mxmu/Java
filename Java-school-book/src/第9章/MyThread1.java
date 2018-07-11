package 第9章;

public class MyThread1 extends Thread{
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("当前主线程是:"+t);
        t.setName("MyThread1");
        System.out.println("当前主线程是:"+t);
        MyThread1 mt=new MyThread1();
        mt.start();
    }
    public void run(){
        int sum=0;
        for(int i=0;i<101;i++)
            sum+=i;
        System.out.println("1+2+...+100="+sum);
    }
}
