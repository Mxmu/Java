package cn.itcase.demo48;


import java.util.Date;

public class DataDemo {
    public static void main(String[] args) {
       // Data d=new
        /*long time=System.currentTimeMillis();//返回当前日期的毫秒值
        //时间原点:公元1970年1月1日 午夜0:00:00
        System.out.println(time);*/
        function();
        function_1();
        function_2();
        function_3();
    }
    public static void function(){
        Date date=new Date();
        System.out.println(date);
        //获取到的是当前操作系统中的时间和日期
    }
    public static void function_1(){
        Date date=new Date(1526401533833L);
        System.out.println(date);
    }
    public static void function_2(){
        Date date=new Date();
        long time=date.getTime();
        System.out.println(time);
    }
    public static void function_3(){
        Date date=new Date();
        System.out.println(date);
        date.setTime(0);
        System.out.println(date);
    }
}
