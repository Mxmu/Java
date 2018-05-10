package cn.itcase.demo16;

import cn.itcase.demo15.MyInerfaceImp1;

public class Test {
    public static void main(String[] args)
    {
        System.out.println(MyInter.x);
        //MyInter.x=3; //final最终，变量不能改变
       MyInterImp1 my=new MyInterImp1();
       my.show();
       System.out.println(my.getSum(2,3));

    }
}
