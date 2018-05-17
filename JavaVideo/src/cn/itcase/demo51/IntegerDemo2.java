package cn.itcase.demo51;

public class IntegerDemo2 {
    public static void main(String[] args) {
        function();
       // function_1();
        function_2();
    }
    //自动装箱和拆箱的好处:基本类型和引用类直接运算
    public static void function(){
        //自动装箱,基本数据类型1,直接变成了对象
        Integer in=1; //Integer in=new Integer(1)
        //in是引用类型不能和基本类型运算
        //自动拆箱,把引用类型in转换成基本类型
        //System.out.println(in.toString());
        //in+1=>in.inValue()+1
        in=in+1;
        System.out.println(in);
    }
    //自动装箱和拆箱弊端,可能出现空指针异常
    public static void function_1(){
        Integer in=null;
        //in=null.intValue()+1
        in=in+1;
        System.out.println(in);
    }
    public static void function_2(){
        Integer i=new Integer(1);
        Integer j=new Integer(1);
        System.out.println(i==j);//false对象地址
        System.out.println(i.equals(j));//true 继承Object重写equals比较对象的数据
        System.out.println("=======================");
        Integer a=500;
        Integer b=500;
        System.out.println(a==b);//false
        System.out.println(a.equals(b));
        System.out.println("==========================");
        //数据在byte范围内,JVM不会重新new对象
        Integer aa=127;//Integer aa=new Integer(127)
        Integer bb=127;//Integer bb=aa;
        System.out.println(aa==bb);
        System.out.println(aa.equals(bb));
    }
}
