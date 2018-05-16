package cn.itcase.demo48;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
    日期格式:
        yyyy 年份
        MM   月份
        dd   月中的天数
        HH   0-23小时
        mm   小时中的分钟数
        ss   秒
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH点mm分钟ss秒");
        String date=sdf.format(new Date());
        System.out.println(date);
    }
}
