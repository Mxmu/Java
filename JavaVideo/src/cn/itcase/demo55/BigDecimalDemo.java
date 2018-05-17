package cn.itcase.demo55;

import cn.itcase.demo17.B;

import java.math.BigDecimal;
//保证浮点运算精确性
public class BigDecimalDemo {
    public static void main(String[] args) {
       // System.out.println(0.09+0.01);
       // function();
        function_1();
    }
    public static void function(){
        BigDecimal b1=new BigDecimal("0.09");
        BigDecimal b2=new BigDecimal("0.01");
        BigDecimal bigAdd=b1.add(b2);
        System.out.println(bigAdd);
        BigDecimal b3=new BigDecimal("1");
        BigDecimal b4=new BigDecimal("0.32");
        BigDecimal bigSub=b3.subtract(b4);
        System.out.println(bigSub);
        BigDecimal b5=new BigDecimal("1.015");
        BigDecimal b6=new BigDecimal("100");
        BigDecimal bigMul=b5.multiply(b6);
        System.out.println(bigMul);
    }
    public static void function_1(){
        BigDecimal b1=new BigDecimal("1.301");
        BigDecimal b2=new BigDecimal("100");
        BigDecimal bigDiv=b1.divide(b2);
        System.out.println(bigDiv);
    }

}
