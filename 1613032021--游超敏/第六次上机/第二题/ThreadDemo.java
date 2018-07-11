package 第六次上机.第二题;

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
