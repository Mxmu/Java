package cn.itcase.demo52;

import java.util.concurrent.ForkJoinPool;

public class SystemDemo {
    public static void main(String[] args) {
        //function();
        //function_1();
        //function_2();
        //function_3();
        function_4();
    }
    public static void function(){
        //获取系统当前毫秒值
        //static long currentTimeMillis()
        long start=System.currentTimeMillis();
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    //退出虚拟机 所有程序全停止
    //static void exit(0)
    public static void function_1(){

        while(true)
        {
            System.out.println("Hello");
            System.exit(0);
        }
    }
    /*
    JVM在内存中,收取对象的垃圾
    static void gc()
     */
    public static void function_2(){
        new Person();
        new Person();
        new Person();
        System.gc();
    }
    /*
    获取当前操作系统的属性
     */
    public static void function_3(){
        System.out.println(System.getProperties());
    }
    /*
    System类方法,复制数组
    arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
    Object src要复制的源数组
    int srcPos数组源的起始索引
    Object dest复制后的目标数组
    int destPos目标数组起始索引
    int length复制几个
     */
    public static void function_4(){
        int [] src={11,22,33,44,55,66};
        int [] dest={77,88,99,0};
        System.arraycopy(src,1,dest,1,2);
        for (int i = 0; i <dest.length ; i++) {
            System.out.println(dest[i]);

        }
    }
}
