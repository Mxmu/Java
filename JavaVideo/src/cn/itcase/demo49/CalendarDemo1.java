package cn.itcase.demo49;

import cn.itcase.demo18.C;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        function();
        function_1();
        function_2();
        function_3();
    }
    public static void function(){
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"-"+month+"-"+day);

    }
    public static void function_1(){
        Calendar c=Calendar.getInstance();
        c.set(Calendar.MONTH,9);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"-"+month+"-"+day);
        c.set(2099,9,9);
        year=c.get(Calendar.YEAR);
        month=c.get(Calendar.MONTH)+1;
        day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"-"+month+"-"+day);
    }
    public static void function_2(){
        Calendar c=Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH,280);
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH)+1;
        int day=c.get(Calendar.DAY_OF_MONTH);
        System.out.println(year+"-"+month+"-"+day);
    }
    public static void function_3(){
        Calendar c=Calendar.getInstance();
        Date date=c.getTime();
        System.out.println(date);
    }
}
