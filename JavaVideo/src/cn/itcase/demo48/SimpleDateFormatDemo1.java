package cn.itcase.demo48;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    DateFormat类方法parse
    将字符串解析为日期对象
    用户的输入,2018-5-20为字符串,转换为日期对象
    String =>Date  parse
    Date =>String  format
    时间和日期的模式必须和字符串中的时间日期匹配
    但是，日期是用户键盘输入，日期根本不能输入
    用户选择的形式
 */
public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws Exception{
        function();
    }
    public static void function() throws Exception {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse("2020-2-20");
        System.out.println(date);
    }
}
