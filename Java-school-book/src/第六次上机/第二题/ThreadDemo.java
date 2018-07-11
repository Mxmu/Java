package 第六次上机.第二题;

/**
 * 软件工程161班
 * 1613032021
 * 游超敏
 * 题目：编程完成以下功能：创建两个线程，
 * 每个线程打印出线程的名字后再睡眠，给
 * 其它线程以执行的机会，每个线程前后共
 * 睡眠5次。线程退出前打印提示信息：说明
 * 该线程即将退出。要求分别采用从Thread
 * 类继承和实现Runnable接口两种方式来实
 * 现程序（即编写两个程序）。
 */
public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        //Thread t=new Thread(new Thread(),"A");
        //Thread p=new Thread(new Thread(),"B");
        ThreadDemo t=new ThreadDemo();
        t.setName("线程A");
        ThreadDemo p=new ThreadDemo();
        p.setName("线程B");
        t.start();
        p.start();
    }
    public void run(){
        for (int i = 0; i <5 ; i++) {
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("线程"+Thread.currentThread().getName()+"即将退出");
    }
}
