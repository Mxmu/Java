package cn.itcase.demo55;

import java.math.BigInteger;

/*
超级大的整数运算
超过long取值范围整数,封装成BigInteger类型的对象
 */
public class BigIntegerDemo {
    public static void main(String[] args) {
       // function();
        function_1();
    }
    /*
    BigInteger类的构造方法
    传递字符串,要求数字格式,没有长度限制
     */
    public static void function(){
        BigInteger b=new BigInteger("4153265246347637");
        BigInteger b1=new BigInteger("1515415326524124146347637");

        System.out.println(b);
        System.out.println(b1);
    }
    /*
    BigInteger对象的四则对象
    调用方法计算,计算结果也只能BigInteger对象
     */
    public static void function_1(){
        BigInteger b1=new BigInteger("414563462561616462626");
        BigInteger b2=new BigInteger("15356314627271");
        BigInteger bigAdd=b1.add(b2);
        System.out.println(bigAdd);
        BigInteger bigSub=b1.subtract(b2);
        System.out.println(bigSub);
        BigInteger bigMul=b1.multiply(b1);
        System.out.println(bigMul);
        BigInteger bigDiv=b1.divide(b2);
        System.out.println(bigDiv);
    }
}
