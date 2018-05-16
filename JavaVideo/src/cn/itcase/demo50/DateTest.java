package cn.itcase.demo50;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTest {
    /*
    计算活了多少天
    要知道生日和今天的日期
    两个日期变成毫秒值，减法
     */
    public static void main(String[] args) throws Exception {
       // function();
        function_1();
    }
    public static void function() throws Exception{
        System.out.println("请输入出生日期 格式yyyy-MM-dd");
        String birthdayString=new Scanner(System.in).next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate=sdf.parse(birthdayString);
        Date todayDate=new Date();
        long birthdaySecond=birthdayDate.getTime();
        long todaySecond=todayDate.getTime();
        long second=(todaySecond-birthdaySecond);
        if(second<0){
            System.out.println("还没出生");
        }
        else {
            System.out.println(second / 1000 / 60 / 60 / 24);
        }
    }
    /*
    闰年计算
    高级算法:日历设置到指定年份的3月1日,add向前偏移1天,获取天数,如果是29则为闰年
     */
    public static void function_1(){
        Calendar c=Calendar.getInstance();
        c.set(2018,2,1);
        c.add(Calendar.DAY_OF_MONTH,-1);
        int day=c.get(Calendar.DAY_OF_MONTH);
        //System.out.println(day);
        if(day==29){
            System.out.println(c.get(Calendar.YEAR)+"是闰年");
        }
        else{
            System.out.println(c.get(Calendar.YEAR)+"是平年");
        }
    }
}
