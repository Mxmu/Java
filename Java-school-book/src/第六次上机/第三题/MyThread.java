package 第六次上机.第三题;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：利用多线程实现如下字符串“***”和字符串“###”的交替输出：
 * ***
 * ###
 * ***
 * ###
 */

    class Print{
        boolean flag;
        Print(){
            flag=true;
        }
        public synchronized void print1(){

            while(!flag){
                try{
                    wait();
                }catch (InterruptedException e){

                }
            }
            System.out.println("###");
            flag=false;
            notify();
        }
        public synchronized void print2(){
            while(flag){
                try{
                    wait();
                }catch (InterruptedException e){

                }
            }
            System.out.println("***");
            flag=true;
            notify();
        }
    }
class MyThread2 extends Thread{
    public Print p;
    MyThread2(Print p){
        this.p=p;
    }
    public void run(){
        int i=2;
        while(i!=0){
            p.print2();
            i--;
            try{
                sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }
}
 class MyThread1 extends Thread{
        public Print p;
        MyThread1(Print p){
            this.p=p;
        }
        public void run(){
            int i=2;
            while(i!=0){
                p.print1();
                i--;
                try{
                    sleep(1000);
                }catch (InterruptedException e){

                }
            }
        }
}

public class MyThread{
        public static void main(String[] args){
            Print p1=new Print();
            MyThread1 t1=new MyThread1(p1);
            MyThread2 t2=new MyThread2(p1);
            t1.start();
            t2.start();
        }
}
